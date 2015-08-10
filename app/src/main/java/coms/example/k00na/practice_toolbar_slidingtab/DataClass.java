package coms.example.k00na.practice_toolbar_slidingtab;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k00na on 4.8.2015.
 */
public class DataClass {


    private static int[] scientists = {R.drawable.isac_newton, R.drawable.einstein, R.drawable.darwin_2};
    private static String[] scientistsNames = {"Newton", "Einstein", "Darwin"};
    private static int[] musicians = {R.drawable.snoop_dogg, R.drawable.gwen_stefani_2, R.drawable.ozzy_osbourne};
    private static String[] musiciansNames = {"Snoop", "Gwen Stefani", "Ozzy"};
    private static int[] politicians = {R.drawable.tito, R.drawable.malcom_x, R.drawable.ghadafi};
    private static String[] politicianNames = {"Tito", "Malcom X", "Ghadafi"};


    private static List<Person> scientistList;



    public int[] getScientists() {
        return scientists;
    }

    public void setScientists(int[] scientists) {
        this.scientists = scientists;
    }

    public int[] getMusicians() {
        return musicians;
    }


    public static List<Person> getMusicianList()
    {
        List<Person> musicPeople = new ArrayList<Person>();
        Person person;
        for(int i=0; i<musicians.length; i++)
        {
            person = new Person();
            person.setName(musiciansNames[i]);
            person.setImgRes(musicians[i]);

            musicPeople.add(person);
        }

        return musicPeople;
    }

    public static List<Person> getScientistsList()
    {

        if(scientistList != null)
            return scientistList;

         scientistList = new ArrayList<Person>();
        Person person;
        for(int i=0; i<scientists.length; i++)
        {
            person = new Person();
            person.setName(scientistsNames[i]);
            person.setImgRes(scientists[i]);

            scientistList.add(person);
        }

        return scientistList;
    }

    public static List<Person> getPoliticianList()
    {
        List<Person> musicPeople = new ArrayList<Person>();
        Person person;
        for(int i=0; i<politicianNames.length; i++)
        {
            person = new Person();
            person.setName(politicianNames[i]);
            person.setImgRes(politicians[i]);

            musicPeople.add(person);
        }

        return musicPeople;
    }



    public static int[] getAllImgRes(){

        int[] imgRes = {R.drawable.isac_newton, R.drawable.einstein, R.drawable.darwin_2,
                R.drawable.snoop_dogg, R.drawable.gwen_stefani_2, R.drawable.ozzy_osbourne,
                R.drawable.tito, R.drawable.malcom_x, R.drawable.gadafi};

        return imgRes;

    }

    public int[] getPoliticians() {
        return politicians;
    }


    public String[] getScientistsNames() {
        return scientistsNames;
    }

    public String[] getMusiciansNames() {
        return musiciansNames;
    }

    public String[] getPoliticianNames() {
        return politicianNames;
    }
}

package coms.example.k00na.practice_toolbar_slidingtab;

/**
 * Created by niggor on 8.8.2015.
 */
public class Person {

    private String name;
    private int imgRes;
    private int[] scientists = {R.drawable.isac_newton, R.drawable.einstein, R.drawable.darwin_2};
    private int[] musicians = {R.drawable.snoop_dogg, R.drawable.gwen_stefani_2, R.drawable.ozzy_osbourne};
    private int[] politicians = {R.drawable.tito, R.drawable.malcom_x, R.drawable.ghadafi};



    /*
        CONSTRUCTORS
     */

    public Person(int img){

        this.imgRes = img;
    }


    public Person(int img, String name){
        this.imgRes = img;
        this.name = name;
    }



    /*
        SETTERS AND GETTERS DOWN-BELLOW
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public int[] getScientists() {
        return scientists;
    }

    public void setScientists(int[] scientists) {
        this.scientists = scientists;
    }

    public int[] getMusicians() {
        return musicians;
    }

    public void setMusicians(int[] musicians) {
        this.musicians = musicians;
    }

    public int[] getPoliticians() {
        return politicians;
    }

    public void setPoliticians(int[] politicians) {
        this.politicians = politicians;
    }
}

package coms.example.k00na.practice_toolbar_slidingtab;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k00na on 5.8.2015.
 */
public class TheFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
    private RecyclerViewsAdapter mAdapter;
    private DataClass dataClass = new DataClass();
    private FloatingActionButton mFab;
    int mTabsNumber;
    private int counter = 0;
    private List<Person> personData;
    private DataClass data = new DataClass();


    public static final String EXTRA_POSITION = "coms.example.k00na.practice_toolbar_slidingtab.position";


       public Fragment getInstance(int position){

        TheFragment fragment = new TheFragment();
        Bundle args = new Bundle();
        args.putInt(EXTRA_POSITION, position);

        fragment.setArguments(args);
        return fragment;


    }

    public List<Person> getData(int tabsNumber){

        personData = new ArrayList<>();
        int[] icons = new int[3];
        String[] names = new String[3];

        if(tabsNumber == 0) {
            personData = DataClass.getScientistsList();
        }
        else if(tabsNumber == 1) {
            personData = DataClass.getMusicianList();
        }
        else {
            personData = DataClass.getPoliticianList();
        }


      /*  for(int i = 0; i<15; i++){
            Person newPerson = new Person(icons[i % icons.length], names[i % names.length]);
            personData.add(newPerson);
        }*/

        return personData;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.recyclerview_layout, container, false);

        Bundle bundle = getArguments();
        // od tu bo fragment vedel v katerem tab-u se nahaja
        mTabsNumber = bundle.getInt(EXTRA_POSITION);


        mFab = (FloatingActionButton)v.findViewById(R.id.fab_id);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), AddingPersonsActivity.class);
                startActivity(i);



            /*
            // Dodajanje nove osebe v specifičen seznam. Zakomentirano zaradi implementiranja nove funkcionalnosti FAB-a
             Person newPerson = new Person();




        if(mTabsNumber == 0){
            newPerson.setImgRes(data.getScientists()[counter]);
            newPerson.setName(data.getScientistsNames()[counter]);
            if(counter  == 2)
                counter = 0;
            else
                counter++;
        }
        else if(mTabsNumber == 1){
            newPerson.setImgRes(data.getMusicians()[counter]);
            newPerson.setName(data.getMusiciansNames()[counter]);
            if(counter  == 2)
                counter = 0;
            else
                counter++;

        }
        else if(mTabsNumber == 2){
            newPerson.setImgRes(data.getPoliticians()[counter]);
            newPerson.setName(data.getPoliticianNames()[counter]);
            if(counter  == 2)
                counter = 0;
            else
                counter++;

        }


        mAdapter.add(newPerson);
            */

            }
        });





        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_xml_id);
        mRecyclerView.setLayoutManager(mLayoutManager);


        mAdapter = new RecyclerViewsAdapter(getActivity(), getData(mTabsNumber), mTabsNumber);
        mRecyclerView.setAdapter(mAdapter);

        return v;


    } // <-- END OF OnCreateView


}   // <-- END OF TheFragment


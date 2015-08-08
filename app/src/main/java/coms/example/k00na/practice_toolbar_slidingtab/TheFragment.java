package coms.example.k00na.practice_toolbar_slidingtab;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by k00na on 5.8.2015.
 */
public class TheFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
    private RecyclerView.Adapter mAdapter;


    public static final String EXTRA_POSITION = "coms.example.k00na.practice_toolbar_slidingtab.position";


    public Fragment getInstance(int position){

        TheFragment fragment = new TheFragment();
        Bundle args = new Bundle();
        args.putInt(EXTRA_POSITION, position);

        fragment.setArguments(args);
        return fragment;


    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.recyclerview_layout, container, false);

        Bundle bundle = getArguments();
        // od tu bo fragment vedel v katerem tab-u se nahaja
        int number = bundle.getInt(EXTRA_POSITION);



        mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerview_xml_id);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerViewsAdapter(number);
        mRecyclerView.setAdapter(mAdapter);

        // TO DO: set the adapter for the mRecyclerView
        return v;


    }
}   // <-- END OF TheFragment


package coms.example.k00na.practice_toolbar_slidingtab;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import coms.example.k00na.practice_toolbar_slidingtab_added_code.SlidingTabLayout;

public class AddingPersonsActivity extends AppCompatActivity {

    private RecyclerView mAddPersonRecycler;
    private RecyclerView.LayoutManager mLayoutManager;
    private AddingPersonAdapter mAdapter;

    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_persons);

        toolbar = (Toolbar)findViewById(R.id.include_appbar_addperson_activity);
        setSupportActionBar(toolbar);

        // ADAPTER STUFF
        mAddPersonRecycler = (RecyclerView)findViewById(R.id.add_person_recycler_id);
        mLayoutManager = new GridLayoutManager(this, 3);
        mAdapter = new AddingPersonAdapter(this);
        mAddPersonRecycler.setAdapter(mAdapter);
        mAddPersonRecycler.setLayoutManager(mLayoutManager);



    }


}

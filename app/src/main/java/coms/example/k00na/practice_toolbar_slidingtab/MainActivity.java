package coms.example.k00na.practice_toolbar_slidingtab;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import coms.example.k00na.practice_toolbar_slidingtab_added_code.SlidingTabLayout;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private SlidingTabLayout theTab;
    private ViewPager theViewPager;
    private PagerAdapterYo pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.include_appbar_mainactivity);

        setSupportActionBar(toolbar);

        theTab = (SlidingTabLayout)findViewById(R.id.slidingTabLayout_XML_ID);
        theTab.setSelectedIndicatorColors(R.color.primaryText);
        theViewPager = (ViewPager)findViewById(R.id.viewPager_ID);
        pagerAdapter = new PagerAdapterYo(getSupportFragmentManager());

        theViewPager.setAdapter(pagerAdapter);
        theTab.setViewPager(theViewPager);




        // Arranging the Toolbar
        getSupportActionBar().setTitle(R.string.app_title);
        getSupportActionBar().setLogo(R.mipmap.android_icon_32);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.random_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.searchIcon) {
            Toast.makeText(this, "HEY HEY!", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, SubActivity.class);
            startActivity(i);

        }


        return super.onOptionsItemSelected(item);
    }







}

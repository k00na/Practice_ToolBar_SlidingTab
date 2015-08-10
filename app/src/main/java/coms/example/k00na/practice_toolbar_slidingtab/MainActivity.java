package coms.example.k00na.practice_toolbar_slidingtab;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;
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
        theViewPager = (ViewPager)findViewById(R.id.viewPager_ID);
        theViewPager.setOffscreenPageLimit(3);
        pagerAdapter = new PagerAdapterYo(getSupportFragmentManager());
        theViewPager.setAdapter(pagerAdapter);

        setSupportActionBar(toolbar);

        theTab = (SlidingTabLayout)findViewById(R.id.slidingTabLayout_XML_ID);
        theTab.setCustomTabView(R.layout.custom_tab_view, R.id.tabText);
        theTab.setDistributeEvenly(true);

        theTab.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.accentColor);
            }
        });
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


    class PagerAdapterYo extends FragmentStatePagerAdapter {


        private int[] icons ={R.mipmap.ic_accessibility_black_24dp, R.mipmap.ic_face_black_24dp, R.mipmap.ic_perm_identity_black_24dp};

        public PagerAdapterYo(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return icons.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {

            Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), icons[position]);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            ImageSpan imageSpan = new ImageSpan(drawable);
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(imageSpan, 0, spannableString.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

            return spannableString;
        }

        @Override
        public Fragment getItem(int i) {

            TheFragment theFragment = new TheFragment();

            return theFragment.getInstance(i);
        }




    }


}

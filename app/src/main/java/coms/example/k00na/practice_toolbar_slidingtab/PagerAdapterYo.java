package coms.example.k00na.practice_toolbar_slidingtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by k00na on 5.8.2015.
 */
class PagerAdapterYo extends FragmentStatePagerAdapter {

    private String[] tabs = {"TAB 1", "TAB 2", "TAB 3"};

    public PagerAdapterYo(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabs[position];
    }

    @Override
    public Fragment getItem(int i) {

        TheFragment theFragment = new TheFragment();

        return theFragment.getInstance(i);
    }
}
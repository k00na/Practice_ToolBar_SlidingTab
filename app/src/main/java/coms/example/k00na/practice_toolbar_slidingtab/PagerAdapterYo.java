package coms.example.k00na.practice_toolbar_slidingtab;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by k00na on 5.8.2015.
 */
class PagerAdapterYo extends FragmentStatePagerAdapter {

    private String[] tabs = {"TAB 1", "TAB 2", "TAB 3"};
    private int[] icons ={R.mipmap.ic_accessibility_black_24dp, R.mipmap.ic_face_black_24dp, R.mipmap.ic_perm_identity_black_24dp};

    public PagerAdapterYo(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        MainActivity mainActivity = new MainActivity();

        aaa

        return tabs[position];
    }

    @Override
    public Fragment getItem(int i) {

        TheFragment theFragment = new TheFragment();

        return theFragment.getInstance(i);
    }
}
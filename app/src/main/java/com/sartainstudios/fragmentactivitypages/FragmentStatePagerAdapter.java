package com.sartainstudios.fragmentactivitypages;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 9/18/2017.
 */

public class FragmentStatePagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {
    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public FragmentStatePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    private void addFragment(Fragment fragment, String fragmentTitle) {
        fragmentList.add(fragment);
        fragmentTitleList.add(fragmentTitle);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }
}
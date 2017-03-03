package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_manual extends FragmentPagerAdapter {

    private final List<Fragment> fragments_manual;

    public FragmentPagerAdapter_manual(FragmentManager fm, List<Fragment> fragments_manual) {
        super(fm);
        this.fragments_manual = fragments_manual;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments_manual.get(position);
    }

    @Override
    public int getCount() {

        return fragments_manual.size();
    }
}

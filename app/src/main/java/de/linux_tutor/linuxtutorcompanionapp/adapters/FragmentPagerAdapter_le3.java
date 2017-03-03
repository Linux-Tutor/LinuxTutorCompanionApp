package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le3 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le3;

        public FragmentPagerAdapter_le3(FragmentManager fm, List<Fragment> fragments_le3) {
            super(fm);
            this.fragments_le3 = fragments_le3;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le3.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le3.size();
        }
}

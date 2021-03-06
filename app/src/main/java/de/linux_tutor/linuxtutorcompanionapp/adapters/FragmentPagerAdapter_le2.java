package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le2 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le2;

        public FragmentPagerAdapter_le2(FragmentManager fm, List<Fragment> fragments_le2) {
            super(fm);
            this.fragments_le2 = fragments_le2;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le2.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le2.size();
        }
}

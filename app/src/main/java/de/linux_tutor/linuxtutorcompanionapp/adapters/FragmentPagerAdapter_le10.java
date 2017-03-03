package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le10 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le10;

        public FragmentPagerAdapter_le10(FragmentManager fm, List<Fragment> fragments_le10) {
            super(fm);
            this.fragments_le10 = fragments_le10;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le10.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le10.size();
        }
}

package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le8 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le8;

        public FragmentPagerAdapter_le8(FragmentManager fm, List<Fragment> fragments_le8) {
            super(fm);
            this.fragments_le8 = fragments_le8;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le8.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le8.size();
        }
}

package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le13 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le13;

        public FragmentPagerAdapter_le13(FragmentManager fm, List<Fragment> fragments_le13) {
            super(fm);
            this.fragments_le13 = fragments_le13;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le13.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le13.size();
        }
}

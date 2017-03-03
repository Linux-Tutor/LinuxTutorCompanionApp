package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le9 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le9;

        public FragmentPagerAdapter_le9(FragmentManager fm, List<Fragment> fragments_le9) {
            super(fm);
            this.fragments_le9 = fragments_le9;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le9.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le9.size();
        }
}

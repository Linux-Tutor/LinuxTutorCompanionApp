package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le5 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le5;

        public FragmentPagerAdapter_le5(FragmentManager fm, List<Fragment> fragments_le5) {
            super(fm);
            this.fragments_le5 = fragments_le5;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le5.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le5.size();
        }
}

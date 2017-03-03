package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragmentPagerAdapter_le11 extends FragmentPagerAdapter {

        private final List<Fragment> fragments_le11;

        public FragmentPagerAdapter_le11(FragmentManager fm, List<Fragment> fragments_le11) {
            super(fm);
            this.fragments_le11 = fragments_le11;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le11.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le11.size();
        }
}

package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Niclas on 19.08.2016.
 */
public class FragmentPagerAdapter_le1 extends FragmentPagerAdapter {

        List<Fragment> fragments_le1;

        public FragmentPagerAdapter_le1(FragmentManager fm, List<Fragment> fragments_le1) {
            super(fm);
            this.fragments_le1 = fragments_le1;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le1.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le1.size();
        }
}

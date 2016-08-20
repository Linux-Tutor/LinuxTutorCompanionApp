package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Niclas on 19.08.2016.
 */
public class FragmentPagerAdapter_le12 extends FragmentPagerAdapter {

        List<Fragment> fragments_le12;

        public FragmentPagerAdapter_le12(FragmentManager fm, List<Fragment> fragments_le12) {
            super(fm);
            this.fragments_le12 = fragments_le12;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le12.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le12.size();
        }
}

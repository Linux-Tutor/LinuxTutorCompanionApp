package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Niclas on 19.08.2016.
 */
public class FragmentPagerAdapter_le6 extends FragmentPagerAdapter {

        List<Fragment> fragments_le6;

        public FragmentPagerAdapter_le6(FragmentManager fm, List<Fragment> fragments_le6) {
            super(fm);
            this.fragments_le6 = fragments_le6;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le6.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le6.size();
        }
}

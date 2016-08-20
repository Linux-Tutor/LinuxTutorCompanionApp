package de.linux_tutor.linuxtutorcompanionapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Niclas on 19.08.2016.
 */
public class FragmentPagerAdapter_le7 extends FragmentPagerAdapter {

        List<Fragment> fragments_le7;

        public FragmentPagerAdapter_le7(FragmentManager fm, List<Fragment> fragments_le7) {
            super(fm);
            this.fragments_le7 = fragments_le7;
        }

        @Override
        public Fragment getItem(int position) {
            return this.fragments_le7.get(position);
        }

        @Override
        public int getCount() {

            return fragments_le7.size();
        }
}

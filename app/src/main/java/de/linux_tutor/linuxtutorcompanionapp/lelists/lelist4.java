package de.linux_tutor.linuxtutorcompanionapp.lelists;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TabHost;

import java.util.List;
import java.util.Vector;

import de.linux_tutor.linuxtutorcompanionapp.R;
import de.linux_tutor.linuxtutorcompanionapp.adapters.FragmentPagerAdapter_le4;
import de.linux_tutor.linuxtutorcompanionapp.fragments.fragment1_le4;
import de.linux_tutor.linuxtutorcompanionapp.fragments.fragment2_le4;
import de.linux_tutor.linuxtutorcompanionapp.fragments.fragment3_le4;
import de.linux_tutor.linuxtutorcompanionapp.fragments.fragment4_le4;
import de.linux_tutor.linuxtutorcompanionapp.fragments.fragment5_le4;
import de.linux_tutor.linuxtutorcompanionapp.fragments.fragment6_le4;

public class lelist4 extends AppCompatActivity implements TabHost.OnTabChangeListener, ViewPager.OnPageChangeListener {

    private TabHost tabHost;
    private ViewPager viewPager;
    private int i = 0;

    // fake content for tabhost
    class FakeContent implements TabHost.TabContentFactory {
        private final Context mContext;

        public FakeContent(Context context) {
            mContext = context;
        }

        @Override
        public View createTabContent(String tag) {
            View v = new View(mContext);
            v.setMinimumHeight(0);
            v.setMinimumWidth(0);
            return v;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs_viewpager_layout);

        i++;

        // init tabhost
        this.initTabHost();

        // init ViewPager
        this.initializeViewPager();

    }

    private void initializeViewPager() {
        List<Fragment> fragments_le4 = new Vector<>();

        fragments_le4.add(new fragment1_le4());
        fragments_le4.add(new fragment2_le4());
        fragments_le4.add(new fragment3_le4());
        fragments_le4.add(new fragment4_le4());
        fragments_le4.add(new fragment5_le4());
        fragments_le4.add(new fragment6_le4());

        FragmentPagerAdapter_le4 myViewPagerAdapter = new FragmentPagerAdapter_le4(
                getSupportFragmentManager(), fragments_le4);
        this.viewPager = (ViewPager) super.findViewById(R.id.viewPager);
        assert this.viewPager != null;
        this.viewPager.setAdapter(myViewPagerAdapter);
        this.viewPager.setOnPageChangeListener(this);

        onRestart();

    }

    private void initTabHost() {

        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        assert tabHost != null;
        tabHost.setup();

        String[]LinuxEssentialsTabs = getResources().getStringArray(R.array.LinuxEssentialsTabs);

        for (String LinuxEssentialsTab : LinuxEssentialsTabs) {
            TabHost.TabSpec tabSpec;
            tabSpec = tabHost.newTabSpec(LinuxEssentialsTab);
            tabSpec.setIndicator(LinuxEssentialsTab);
            tabSpec.setContent(new FakeContent(getApplicationContext()));
            tabHost.addTab(tabSpec);
        }
        tabHost.setOnTabChangedListener(this);
    }

    @Override
    public void onTabChanged(String tabId) {
        int pos = this.tabHost.getCurrentTab();
        this.viewPager.setCurrentItem(pos);

        HorizontalScrollView hScrollView = (HorizontalScrollView) findViewById(R.id.hScrollView);
        View tabView = tabHost.getCurrentTabView();
        assert hScrollView != null;
        int scrollPos = tabView.getLeft()
                - (hScrollView.getWidth() - tabView.getWidth()) / 2;
        hScrollView.smoothScrollTo(scrollPos, 0);

    }

    @Override
    public void onPageScrollStateChanged(int arg0) {
    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {
    }

    @Override
    public void onPageSelected(int position) {
        this.tabHost.setCurrentTab(position);
    }

}
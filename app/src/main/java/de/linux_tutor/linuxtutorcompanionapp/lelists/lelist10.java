package de.linux_tutor.linuxtutorcompanionapp.lelists;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import de.linux_tutor.linuxtutorcompanionapp.R;

public class lelist10 extends AppCompatActivity {
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lelist10);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("le0tab1");
        tabSpec.setContent(R.id.le0tab1);
        tabSpec.setIndicator("1");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le10tab2");
        tabSpec.setContent(R.id.le10tab2);
        tabSpec.setIndicator("2");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le10tab3");
        tabSpec.setContent(R.id.le10tab3);
        tabSpec.setIndicator("3");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le10tab4");
        tabSpec.setContent(R.id.le10tab4);
        tabSpec.setIndicator("4");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le10tab5");
        tabSpec.setContent(R.id.le10tab5);
        tabSpec.setIndicator("5");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le10tab6");
        tabSpec.setContent(R.id.le10tab6);
        tabSpec.setIndicator("6");
        tabHost.addTab(tabSpec);
    }
}

package de.linux_tutor.linuxtutorcompanionapp.lelists;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import de.linux_tutor.linuxtutorcompanionapp.R;

public class lelist8 extends AppCompatActivity {
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lelist8);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("le8tab1");
        tabSpec.setContent(R.id.le8tab1);
        tabSpec.setIndicator("1");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le8tab2");
        tabSpec.setContent(R.id.le8tab2);
        tabSpec.setIndicator("2");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le8tab3");
        tabSpec.setContent(R.id.le8tab3);
        tabSpec.setIndicator("3");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le8tab4");
        tabSpec.setContent(R.id.le8tab4);
        tabSpec.setIndicator("4");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le8tab5");
        tabSpec.setContent(R.id.le8tab5);
        tabSpec.setIndicator("5");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("le8tab6");
        tabSpec.setContent(R.id.le8tab6);
        tabSpec.setIndicator("6");
        tabHost.addTab(tabSpec);
    }
}

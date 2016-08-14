package de.linux_tutor.linuxtutorcompanionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class display_manual extends AppCompatActivity {
    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_manual);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("manualtab1");
        tabSpec.setContent(R.id.manualtab1);
        tabSpec.setIndicator("Step 1");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("manualtab2");
        tabSpec.setContent(R.id.manualtab2);
        tabSpec.setIndicator("Step 2");
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("manualtab3");
        tabSpec.setContent(R.id.manualtab3);
        tabSpec.setIndicator("Step 3");
        tabHost.addTab(tabSpec);

    }
}
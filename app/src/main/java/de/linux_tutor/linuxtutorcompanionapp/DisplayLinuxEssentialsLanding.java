package de.linux_tutor.linuxtutorcompanionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist0;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist1;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist10;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist11;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist12;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist13;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist14;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist15;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist2;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist3;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist4;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist5;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist6;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist7;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist8;
import de.linux_tutor.linuxtutorcompanionapp.lelists.lelist9;

public class DisplayLinuxEssentialsLanding extends AppCompatActivity {
Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_linux_essentials_landing);

       String[] LinuxEssentialsLandinglist = getResources().getStringArray(R.array.LinuxEssentialsLandinglist);
        ListAdapter LinuxEssentialsLandingAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, LinuxEssentialsLandinglist);
        ListView LinuxEssentialsLandinglistListView = (ListView) findViewById(R.id.LinuxEssentialsLandinglistListView);
        LinuxEssentialsLandinglistListView.setAdapter(LinuxEssentialsLandingAdapter);

        LinuxEssentialsLandinglistListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
                if (position == 0)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist0.class);
                    startActivity(intent);
                }
                if (position == 1)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist1.class);
                    startActivity(intent);
                }
                if (position == 2)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist2.class);
                    startActivity(intent);
                }
                if (position == 3)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist3.class);
                    startActivity(intent);
                }
                if (position == 4)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist4.class);
                    startActivity(intent);
                }
                if (position == 5)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist5.class);
                    startActivity(intent);
                }
                if (position == 6)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist6.class);
                    startActivity(intent);
                }
                if (position == 7)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist7.class);
                    startActivity(intent);
                }
                if (position == 8)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist8.class);
                    startActivity(intent);
                }
                if (position == 9)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist9.class);
                    startActivity(intent);
                }
                if (position == 10)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist10.class);
                    startActivity(intent);
                }
                if (position == 11)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist11.class);
                    startActivity(intent);
                }
                if (position == 12)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist12.class);
                    startActivity(intent);
                }
                if (position == 13)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist13.class);
                    startActivity(intent);
                }
                if (position == 14)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist14.class);
                    startActivity(intent);
                }
                if (position == 15)
                {
                    Intent intent = new Intent(getApplicationContext(), lelist15.class);
                    startActivity(intent);
                }
            }
        });
      }
}
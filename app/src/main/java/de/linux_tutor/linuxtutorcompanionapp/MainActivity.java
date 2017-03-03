package de.linux_tutor.linuxtutorcompanionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Log.d("ACTION", "Button Settings clicked");
            Intent intent = new Intent(this,About.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void linuxessentials_start (View view)
    {
        if (view.getId()==R.id.linuxessentialsbutton) {
            Log.d("ACTION", "Button Linux Essentials clicked");
            Intent intent = new Intent(this,DisplayLinuxEssentialsLanding.class);
            startActivity(intent);
        }
    }
    public void lpic1101_start (View view)
    {
        if (view.getId()==R.id.lpic1101button) {
            Log.d("ACTION", "Button LPIC-1 101 clicked");
            Intent intent = new Intent(this,DisplayLPIC1101Landing.class);
            startActivity(intent);
        }
    }
    public void lpic1102_start (View view)
    {
        if (view.getId()==R.id.lpic1102button) {
            Log.d("ACTION", "Button LPIC-1 102 clicked");
            Intent intent = new Intent(this,DisplayLPIC1102Landing.class);
            startActivity(intent);
        }
    }
    public void manualstart (View view)
    {
        if (view.getId()==R.id.manualbutton) {
            Log.d("ACTION", "Button Manual clicked");
            Intent intent = new Intent(this,display_manual_frgmt.class);
            startActivity(intent);
        }
    }
}

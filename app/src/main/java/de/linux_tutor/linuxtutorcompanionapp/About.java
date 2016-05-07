package de.linux_tutor.linuxtutorcompanionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class About extends AppCompatActivity {
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void gplv30license (View view)
    {
        if (view.getId()==R.id.GPLbutton)
        {
            Log.d("ACTION", "Button GPL License clicked");
            Intent intent = new Intent(this,gpllicense.class);
            startActivity(intent);
        }
    }
}

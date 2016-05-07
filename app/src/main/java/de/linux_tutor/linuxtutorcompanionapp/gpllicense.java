package de.linux_tutor.linuxtutorcompanionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.ScrollerCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Niclas on 07.05.2016.
 */
public class gpllicense extends AppCompatActivity{
    Intent intent = getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpllicense);
    }
}

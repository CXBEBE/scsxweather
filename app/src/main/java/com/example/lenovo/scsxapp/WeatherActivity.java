package com.example.lenovo.scsxapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather",null)!=null){
            Intent intent=new Intent(this,Weather2Activity.class);
            startActivity(intent);
            finish();
        }


    }
}

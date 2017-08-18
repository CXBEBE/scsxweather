package com.example.lenovo.scsxapp;

import android.content.ClipData;
import android.content.Intent;
import android.sax.StartElementListener;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);

        NavigationView navView=(NavigationView)findViewById(R.id.nav_view);

        ActionBar actionBar=getSupportActionBar();
        if (actionBar!=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_action_database);
        }

        navView.setCheckedItem(R.id.nav_home);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                mDrawerLayout.closeDrawers();
                switch(item.getItemId()){
                    case R.id.nav_home:
                        Intent intent_home=new Intent(MainActivity.this,MainActivity.class);
                        startActivity(intent_home);
                        break;
                    case R.id.nav_music:
                        Intent intent_music=new Intent(MainActivity.this,MusicActivity.class);
                        startActivity(intent_music);
                        break;
                    case R.id.nav_lbs:
                        Intent intent_lbs=new Intent(MainActivity.this,LBSActivity.class);
                        startActivity(intent_lbs);
                        break;
                    case R.id.nav_weather:
                        Intent intent_weather=new Intent(MainActivity.this,WeatherActivity.class);
                        startActivity(intent_weather);
                        break;

                    default:
                }
                return true;
            }
        });

        FloatingActionButton fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this,"FAB clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.search:
                Toast.makeText(this,"You clicked Search",Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this,"You clicked Delete",Toast.LENGTH_SHORT).show();
                break;
            case R.id.more:
                Toast.makeText(this,"You clicked More",Toast.LENGTH_SHORT).show();
                break;
            case R.id.list:
                Toast.makeText(this,"You clicked List",Toast.LENGTH_SHORT).show();
                break;
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                break;
            default:
        }
        return true;
    }
}

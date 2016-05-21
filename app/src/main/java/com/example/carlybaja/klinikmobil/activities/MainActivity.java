package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.carlybaja.klinikmobil.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void onKonsey(View v){
        Intent i = new Intent(MainActivity.this, KonseyActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
    }
    public void onFanmAnsent(View v){
        Intent i = new Intent(MainActivity.this, LoginGenActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
    }
    public void onMatron(View v){
        Intent i = new Intent(MainActivity.this, LoginMatronActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
    }
    public void onTimoun(View v){
        Intent i = new Intent(MainActivity.this, LoginGenActivity.class);
        startActivity(i);
        overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
    }
   public void onEstatistik(View v){
       Intent i = new Intent(MainActivity.this, EstatistikActivity.class);
       startActivity(i);
       overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
   }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_enstitisyon) {
            // Handle the camera action
           Intent i = new Intent(MainActivity.this,LoginEnterpriseActivity.class);
             startActivity(i);

        } else if (id == R.id.nav_ed) {
            Intent i = new Intent(MainActivity.this,ed.class);
            startActivity(i);

        } else if (id == R.id.nav_detay) {
            Intent i = new Intent(MainActivity.this,detay.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

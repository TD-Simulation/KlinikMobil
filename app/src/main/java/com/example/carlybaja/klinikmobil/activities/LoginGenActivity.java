package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.carlybaja.klinikmobil.ListFanmAnsentActivityEnt;
import com.example.carlybaja.klinikmobil.R;

public class LoginGenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_gen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onKonekteFanm(View v){
        Intent i = new Intent(LoginGenActivity.this, ListFanmAnsentActivityEnt.class);
        startActivity(i);
    }

}

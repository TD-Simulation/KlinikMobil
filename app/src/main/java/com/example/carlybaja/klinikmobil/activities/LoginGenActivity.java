package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.carlybaja.klinikmobil.R;

/**
 * Created by carlybaja on 5/21/16.
 */

public class LoginGenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_gen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void onKreye(View v){
        Intent i = new Intent(LoginGenActivity.this,ed.class);
        startActivity(i);

    }

}

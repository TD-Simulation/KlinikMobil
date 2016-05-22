package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.carlybaja.klinikmobil.R;

public class LoginEnterpriseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_enterprise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    public void onLogEntreprise(View v){
        Intent j = new Intent(LoginEnterpriseActivity.this, ListEntrepriseActivity.class);
        startActivity(j);
    }

    public void onKreyeEntreprise(View v){
          Intent j = new Intent(LoginEnterpriseActivity.this, SaveEnterpriseActivity.class);
          startActivity(j);
        }

}

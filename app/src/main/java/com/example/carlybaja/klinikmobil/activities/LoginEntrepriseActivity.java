package com.example.carlybaja.klinikmobil.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.carlybaja.klinikmobil.R;

public class LoginEntrepriseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_entreprise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

   // public void onLogEntreprise (View v){
     //   Intent i = new Intent(LoginEntrepriseActivity.this,);
       // startActivity(i);
    //}

    //public void onEnstitisyon(View v){
        //Intent i = new Intent(LoginEntrepriseActivity.this,);
      //  startActivity(i);
    //}

}

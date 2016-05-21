package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;

public class LoginMatronActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_matron);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
//boutton login matron
    public void onKonekt(View v){
        Intent konektMatron = new Intent(LoginMatronActivity.this, ListFanmMatronActivity.class);
        startActivity(konektMatron);
    }
//boutton kreye kont matron
    public void onKreye(View v){
//        Intent kreyeMatron = new Intent(LoginMatronActivity.this, KreyeKontMatronActivity.class);
//        startActivity(kreyeMatron);
        Toast.makeText(getApplicationContext(),"Nap kontakte nan on ti moman",Toast.LENGTH_LONG).show();
    }
}

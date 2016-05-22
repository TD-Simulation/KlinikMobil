package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;

public class LoginMatronActivity extends AppCompatActivity {
    private EditText editkodMatron;
    private String kodMatron;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_matron);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
//boutton login matron
    public void onKonekt(View v){
        editkodMatron=(EditText) findViewById(R.id.inputKodMatron);
        kodMatron= editkodMatron.getText().toString();
        if(kodMatron.equals("")){
            Toast.makeText(getApplicationContext(),"antre nimewo telefon ou pou aksede a sistem nan",Toast.LENGTH_LONG).show();
        }else if(kodMatron.equals("21202516")){
            Intent konektMatron = new Intent(LoginMatronActivity.this, ListFanmMatronActivity.class);
            startActivity(konektMatron);
        }else{
            Toast.makeText(getApplicationContext(),"nimewo sa pa anrejistre nan sistem nan",Toast.LENGTH_LONG).show();
        }

    }
//boutton kreye kont matron
    public void onKreye(View v){
            Toast.makeText(getApplicationContext(), "pase nan yon enstitisyon pouw k anrejistre nan sistem nan", Toast.LENGTH_LONG).show();
            //Intent kreyeMatron = new Intent(LoginMatronActivity.this, KreyeKontMatronActivity.class);
            //startActivity(kreyeMatron);
    }

    public void onOubliMatron(View v){
        editkodMatron=(EditText) findViewById(R.id.inputKodMatron);
        kodMatron= editkodMatron.getText().toString();
        if(kodMatron.equals("21202516")){
            Toast.makeText(getApplicationContext(), "nap kontakte u pouw k chanje nimewo a", Toast.LENGTH_LONG).show();
        }else if(kodMatron.equals("")){
            Toast.makeText(getApplicationContext(), "ou pa antre infomasyon pou chanje nimewo a", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "nimewo sa pat anrejistre nan sytem nan", Toast.LENGTH_LONG).show();

        }
    }
}

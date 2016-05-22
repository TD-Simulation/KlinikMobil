package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;

public class LoginEnterpriseActivity extends AppCompatActivity {
   private EditText userEntreprise;
   private EditText passEntreprise;
   private String userInput;
   private String passInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_enterprise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    public void onLogEntreprise(View v) {
        userEntreprise = (EditText) findViewById(R.id.inputUser);
        passEntreprise = (EditText) findViewById(R.id.inputPass);
        userInput = userEntreprise.getText().toString();
        passInput = passEntreprise.getText().toString();
        if (userInput.equals("") || passInput.equals("")) {
            Toast.makeText(getApplicationContext(), "chan yo vid", Toast.LENGTH_LONG).show();
        } else if (userInput.equals("hopital") || passInput.equals("hsfs")) {
            Intent j = new Intent(LoginEnterpriseActivity.this, ListEntrepriseActivity.class);
            startActivity(j);
        } else {
            Toast.makeText(getApplicationContext(), "non sa yo pa nan sistem nan", Toast.LENGTH_LONG).show();
        }
    }
    public void onKreyeEntreprise(View v){
       // Intent j = new Intent(LoginEnterpriseActivity.this, KreyeEntrepriz.class);
       // startActivity(j);
        Toast.makeText(getApplicationContext(),"modil sa pa disponib", Toast.LENGTH_LONG).show();
    }
    public void onBliye(View v){
        userEntreprise = (EditText) findViewById(R.id.inputUser);
        userInput = userEntreprise.getText().toString();
        if(userInput.equals("")){
            Toast.makeText(getApplicationContext(),"antre nom institisyon wap chanje modpass li a", Toast.LENGTH_LONG).show();
        }else if(userInput.equals("hopital")){
            Toast.makeText(getApplicationContext(),"nap kontakte ou pou swit reket ou a", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"kliye sou kreye pouw kreye kont paw la", Toast.LENGTH_LONG).show();
        }
    }

   // public void onKreyeEntreprise(View v){
          //Intent j = new Intent(LoginEnterpriseActivity.this,);
     //     startActivity(j);
     //   }

}

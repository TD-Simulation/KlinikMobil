package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.ListFanmAnsentActivityEnt;
import com.example.carlybaja.klinikmobil.R;

public class LoginGenActivity extends AppCompatActivity {

    private String nomUserE;
    private String passuserE;
    EditText editUser;
    EditText editPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_gen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editUser = (EditText) findViewById(R.id.nomUser);
        editPass = (EditText) findViewById(R.id.passUser);
    }
//on click boutton konekt
    public void onKonektGen (View v){
        nomUserE = editUser.getText().toString();
        passuserE = editPass.getText().toString();
        if(nomUserE.equals("") && passuserE.equals("")){
            Toast.makeText(getApplicationContext(),"chanp ou yo vid", Toast.LENGTH_LONG).show();
        }else if(nomUserE.equals("entre") && passuserE.equals("entre")){
            Toast.makeText(LoginGenActivity.this, "Bonjour " + nomUserE + " !", Toast.LENGTH_LONG).show();
            Intent KonektGen= new Intent(LoginGenActivity.this, ListFanmAnsentActivityEnt.class);
            startActivity(KonektGen);
        }else{
            Toast.makeText(getApplicationContext(),"nou pa gen nom sa nan systeme nan", Toast.LENGTH_LONG).show();
        }

    }

//on click boutton kreye kont
public void onKreateK (View v){
    Intent KreateK= new Intent(LoginGenActivity.this, ed.class);
    startActivity(KreateK);
}

//on click boutton oublier mot de pass
    public void onOubliPass (View v){
        nomUserE = editUser.getText().toString();
        if(nomUserE.equals("")){
            Toast.makeText(getApplicationContext(),"antre nom itilizate ou nan chanp an", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(LoginGenActivity.this,  nomUserE +" ,nap send ou yon mesaj nan yon ti moman !", Toast.LENGTH_LONG).show();
        }
    }



}

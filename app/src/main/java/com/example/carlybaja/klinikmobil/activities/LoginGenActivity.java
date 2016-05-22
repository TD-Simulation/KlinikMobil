package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;

public class LoginGenActivity extends AppCompatActivity {
    private EditText editUser;
    private EditText editPass;
    private String inputUser;
    private String inputPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_gen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void onKonektGen(View v){
        editUser=(EditText) findViewById(R.id.userInput);
        editPass=(EditText) findViewById(R.id.passInput);
        inputUser= editUser.getText().toString();
        inputPass= editPass.getText().toString();
        if(inputUser.equals("") && inputPass.equals("")){
            Toast.makeText(getApplicationContext(),"ou pa antre information yo",Toast.LENGTH_LONG).show();
        }else if(inputUser.equals("medecin") && inputPass.equals("1234")){
            Intent konektGen = new Intent(LoginGenActivity.this, ListFanmAnsentActivityEnt.class);
            startActivity(konektGen);
        }else if(inputUser.equals("pediatre") && inputPass.equals("4321")){
            //Toast.makeText(getApplicationContext(),"information timoun yo",Toast.LENGTH_LONG).show();
           Intent konektGen = new Intent(LoginGenActivity.this, LisTimounActivityEnt.class);
            startActivity(konektGen);
        }else{
            Toast.makeText(getApplicationContext(),"sisteme nan pa rekonet information sa",Toast.LENGTH_LONG).show();
        }



    }
    public void onOubli(View v){
        editUser=(EditText) findViewById(R.id.userInput);
        inputUser= editUser.getText().toString();
        if(inputUser.equals("")){
            Toast.makeText(getApplicationContext(),"ranpli chan nom itilizate a",Toast.LENGTH_LONG).show();
        }else if(inputUser.equals("timoun") || inputUser.equals("fanm")){
            Toast.makeText(getApplicationContext(),"nap kontakte nan yon ti moman",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"information sa pa korek",Toast.LENGTH_LONG).show();
        }
    }

    public void onKreye(View v){
        Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
    }

}

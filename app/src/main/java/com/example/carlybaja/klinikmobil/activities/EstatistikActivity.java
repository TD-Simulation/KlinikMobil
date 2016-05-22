package com.example.carlybaja.klinikmobil.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;


import com.example.carlybaja.klinikmobil.R;
import com.example.carlybaja.klinikmobil.adapters.StatistiksAdapter;
import com.example.carlybaja.klinikmobil.models.Statistik;

import java.util.ArrayList;

public class EstatistikActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estatistik);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Statistik> statistiks = Statistik.getFakeTab();
        // Created the adapter
        StatistiksAdapter adapter = new StatistiksAdapter(this, statistiks);
        // Find the listview
        ListView lvEstatistik = (ListView) findViewById(R.id.lvEstatistik);
        // Attached the adapter to the listview
        lvEstatistik.setAdapter(adapter);
    }

}

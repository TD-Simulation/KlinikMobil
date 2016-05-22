package com.example.carlybaja.klinikmobil.activities;

import android.app.SearchManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.example.carlybaja.klinikmobil.R;
import com.example.carlybaja.klinikmobil.adapters.EnrolmentWAdapter;
import com.example.carlybaja.klinikmobil.adapters.EnterprisesAdapter;
import com.example.carlybaja.klinikmobil.models.EnrolmentW;
import com.example.carlybaja.klinikmobil.models.Enterprise;

import java.util.ArrayList;

public class ListEntrepriseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_entreprise);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<Enterprise> enterprises = Enterprise.getFakeEntreprise();
        // Created the adapter
        EnterprisesAdapter adapter = new EnterprisesAdapter(this, enterprises);
        // Find the listview
        ListView lvEnterprise = (ListView) findViewById(R.id.lvEnterprise);
        // Attached the adapter to the listview
        lvEnterprise.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list_enterprise_activity, menu);
        // Retrieve the SearchView and plug it into SearchManager
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(R.id.action_search));
        SearchManager searchManager = (SearchManager) getSystemService(SEARCH_SERVICE);
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return true;
    }


}

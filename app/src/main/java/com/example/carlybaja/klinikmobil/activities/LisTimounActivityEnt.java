package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;

public class LisTimounActivityEnt extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView listViewFanm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lis_timoun_activity_ent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ajouter timoun", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent newFanm= new Intent(LisTimounActivityEnt.this, NewTimounActivity.class);
                startActivity(newFanm);
                Toast.makeText(getApplicationContext(),"Ajoute nouvo timoun", Toast.LENGTH_LONG).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Get ListView object
        listViewFanm = (ListView)findViewById(R.id.listFanmAnsentEntActivity);

        //Defined array to show in listview
        String[] values= new String[]{
                "1-\nNom\t\t\t\t\t\t\t:\tTheolien Marc \nLi fet\t\t\t\t\t\t\t:\t29 mas 2016\nNom manman:\tMe Mona Augustin\nNan lopital\t\t\t:\tHopital St francois(HSF)",
                "2-\nNom\t\t\t\t\t\t\t:\tJean Thierry \nLi fet\t\t\t\t\t\t\t:\t20 avril 2016\nNom manman:\tMe Izma Jean\nNan lopital\t\t\t:\tHopital St francois(HSF)",
                "3-\nNom\t\t\t\t\t\t\t:\tDjason Augustin \nLi fet\t\t\t\t\t\t\t:\t05 mai 2015\nNom manman:\tMe Anne Myrlin\nNan lopital\t\t\t:\tHopital St francois(HSF)",
                "3-\nNom\t\t\t\t\t\t\t:\tBaja Marc \nLi fet\t\t\t\t\t\t\t:\t03 Janvier 2015\nNom manman:\tMe Mirline Jean\nNan lopital\t\t\t:\tHopital St francois(HSF)",
                "3-\nNom\t\t\t\t\t\t\t:\tBaja Marc \nLi fet\t\t\t\t\t\t\t:\t04 fevrier 2016\nNom manman:\tMe Mirline Jean\nNan lopital\t\t\t:\tHopital St francois(HSF)",

        };

        //Define A new Adapter
        //parameter
        //context- Layout for the row- ID of the textview-array of data
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        //Assign adapter to listview
        listViewFanm.setAdapter(adapter);

        //ListView item click listener
        listViewFanm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ListView Clicked item index
                int itemPos = position;

                //Listview Clicked item =Value
                String itemValue= (String) listViewFanm.getItemAtPosition(position);

                //show Alert

                Toast.makeText(getApplicationContext(),
                        "Position:"+itemPos+" ListItem:"+itemValue, Toast.LENGTH_LONG).show();

               // Intent viewFanm = new Intent(LisTimounActivityEnt.this, NewTimounActivity.class);
               // startActivity(viewFanm);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.list_fanm_ansent_activity_ent, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.m_matron){
            Toast.makeText(getApplicationContext(),"matron", Toast.LENGTH_LONG).show();
        }else if(id == R.id.m_timoun){
            Toast.makeText(getApplicationContext(),"timoun", Toast.LENGTH_LONG).show();
        }else if(id == R.id.m_rechech){
            Toast.makeText(getApplicationContext(),"recherch", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_parametre) {
            //Intent parametre= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(parametre);
            Toast.makeText(getApplicationContext(),"Paramt", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_jere_itilizate) {
            //Intent jere_itiliate= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(jere_itiliate);
            Toast.makeText(getApplicationContext(),"Jere itilizatè", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_list_visit) {
            //Intent list_visit= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(list_visit);
            Toast.makeText(getApplicationContext(),"Lis vizit", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_list_acouchman_prevu) {
            //Intent acouchman_prevu= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(acouchman_prevu);
            Toast.makeText(getApplicationContext(),"Kalandriye vaksinasyon", Toast.LENGTH_LONG).show();
        }else if (id == R.id.nav_list_vizit_par_matron) {
            //Intent vizit_par_matron= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(vizit_par_matron);
            Toast.makeText(getApplicationContext(),"Fanm ansent", Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
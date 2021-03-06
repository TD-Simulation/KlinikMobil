package com.example.carlybaja.klinikmobil.activities;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;
import com.example.carlybaja.klinikmobil.adapters.EnrolmentWAdapter;
import com.example.carlybaja.klinikmobil.models.EnrolmentW;

import java.util.ArrayList;

public class ListFanmAnsentActivityEnt extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fanm_ansent_activity_ent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<EnrolmentW> enrolmentWs = EnrolmentW.getFakeWomen();
        // Created the adapter
        EnrolmentWAdapter adapter = new EnrolmentWAdapter(this,enrolmentWs);
        // Find the listview
        ListView listViewFanm = (ListView)findViewById(R.id.listFanmAnsentEntActivity);
        // Attached the adapter to the listview
        listViewFanm.setAdapter(adapter);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ajouter fanm ansent", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Intent newFanm= new Intent(ListFanmAnsentActivityEnt.this, NewFanmActivityEnt.class);
                startActivity(newFanm);
                Toast.makeText(getApplicationContext(),"ajouter fanm ansent", Toast.LENGTH_LONG).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void onIm(View v){
        TextView tvPhone= (TextView)findViewById(R.id.tvPhone);
        assert tvPhone != null;
        String t= tvPhone.getText().toString();
        //make a call
           Intent callIntent = new Intent((Intent.ACTION_DIAL));
           callIntent.setData(Uri.parse("tel:"+t));
           if(callIntent.resolveActivity(getPackageManager()) != null){
             startActivity(callIntent);
        }
        //for sms
        /*Uri uri = Uri.parse("smsto:"+t);
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", "The SMS text");
        startActivity(it);

        */
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
            Toast.makeText(getApplicationContext(),"parametre", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_jere_itilizate) {
            //Intent jere_itiliate= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(jere_itiliate);
            Toast.makeText(getApplicationContext(),"jere itilizate", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_list_visit) {
            //Intent list_visit= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(list_visit);
            Toast.makeText(getApplicationContext(),"list vizit", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_list_acouchman_prevu) {
            //Intent acouchman_prevu= new Intent(ListFanmAnsentActivityEnt.this, );
            //startActivity(acouchman_prevu);
            Toast.makeText(getApplicationContext(),"acouchman prevu", Toast.LENGTH_LONG).show();
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
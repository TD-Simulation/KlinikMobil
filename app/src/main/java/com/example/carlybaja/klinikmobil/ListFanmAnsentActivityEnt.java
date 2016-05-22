package com.example.carlybaja.klinikmobil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.telephony.SmsManager;
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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class ListFanmAnsentActivityEnt extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ListView listViewFanm;
    //ListView listViewFanmN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fanm_ansent_activity_ent);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

        //Get ListView object
        listViewFanm = (ListView)findViewById(R.id.listFanmAnsentEntActivity);
        //listViewFanmN = (ListView)findViewById(R.id.list);
        ImageView ivPhone = (ImageView)findViewById(R.id.imageView);
       // ivPhone.setImageResource(R.drawable.ic_about);
        //Defined array to show in listview
        String[] values= new String[]{
                "1-\nNom\t\t\t\t\t\t\t:\tMarie Mona \nAdr\t\t\t\t\t\t\t\t:\t2 nazon, P-A-P, \nTel\t\t\t\t\t\t\t\t:\t+509 32 32 20 24\n",
                "2-\nNom\t\t\t\t\t\t\t:\tMistafa Jean \nAdr\t\t\t\t\t\t\t\t:\t3 Mariani, Carrefour, \nTel\t\t\t\t\t\t\t\t:\t+509 31 33 24 20\n",
                "3-\nNom\t\t\t\t\t\t\t:\tAlice Jeanne \nAdr\t\t\t\t\t\t\t\t:\t20 Rte Turgeau, P-A-P, \nTel\t\t\t\t\t\t\t\t:\t+509 41 24 43 25\n",
                "4-\nNom\t\t\t\t\t\t\t:\tEliza Augustin \nAdr\t\t\t\t\t\t\t\t:\t12 Carrefour-feuille, \nTel\t\t\t\t\t\t\t\t:\t+509 75 23 10 21\n",
                "5-\nNom\t\t\t\t\t\t\t:\tRitha Joseph-Jeanne \nAdr\t\t\t\t\t\t\t\t:\t32 Bicentenaire, \nTel\t\t\t\t\t\t\t\t:\t+509 81 20 32 45\n",
                "6-\nNom\t\t\t\t\t\t\t:\tMarie Mona \nAdr\t\t\t\t\t\t\t\t:\t2 nazon, P-A-P, \nTel\t\t\t\t\t\t\t\t:\t+509 32 32 20 24\n",
                "7-\nNom\t\t\t\t\t\t\t:\tMistafa Jean \nAdr\t\t\t\t\t\t\t\t:\t3 Mariani, Carrefour, \nTel\t\t\t\t\t\t\t\t:\t+509 31 33 24 20\n",
                "8-\nNom\t\t\t\t\t\t\t:\tAlice Jeanne \nAdr\t\t\t\t\t\t\t\t:\t20 Rte Turgeau, P-A-P, \nTel\t\t\t\t\t\t\t\t:\t+509 41 24 43 25\n",
                "9-\nNom\t\t\t\t\t\t\t:\tEliza Augustin \nAdr\t\t\t\t\t\t\t\t:\t12 Carrefour-feuille, \nTel\t\t\t\t\t\t\t\t:\t+509 75 23 10 21\n",
                "10-\nNom\t\t\t\t\t\t\t:\tRitha Joseph-Jeanne \nAdr\t\t\t\t\t\t\t\t:\t32 Bicentenaire, \nTel\t\t\t\t\t\t\t\t:\t+509 81 20 32 45\n"

        };
        String[] numL= new String[]{
                "\n\n\n+50932322024","\n\n\n50931332420","\n\n\n+50941244325",
                "\n\n\n+50975231021","\n\n\n+50981203245","\n\n\n+50932322024",
                "\n\n\n+50931332420","\n\n\n+50941244325","\n\n\n+50975231021","\n\n\n+50981203245"

        };

        //Define A new Adapter
        //parameter
        //context- Layout for the row- ID of the textview-array of data
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);
        //ArrayAdapter<String> adapterN=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text2, numL);

        //Assign adapter to listview
        listViewFanm.setAdapter(adapter);
        //listViewFanmN.setAdapter(adapterN);

        //ListView item click listener
        listViewFanm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ListView Clicked item index
                 int itemPos = position;

                //Listview Clicked item =Value
                String itemValue= (String) listViewFanm.getItemAtPosition(position);

                //show Alert

                //Toast.makeText(getApplicationContext(),
                 //       "Position:"+itemPos+" ListItem:"+itemValue, Toast.LENGTH_LONG).show();

                //Intent viewFanm = new Intent(ListFanmAnsentActivityEnt.this, NewFanmActivityEnt.class);
                //startActivity(viewFanm);
                Intent callIntent = new Intent((Intent.ACTION_CALL));
                callIntent.setData(Uri.parse("tel:32323232"));
                if(callIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(callIntent);
                }
                /*Uri smsUri = Uri.parse("tel:32322024");
                Intent intent = new Intent(Intent.ACTION_VIEW, smsUri);
                intent.putExtra("sms_body", "ou gen yon randevou nan lopital la jou ki ap 30 juin 2016 la");
                intent.setType("vnd.android-dir/mms-sms");
                startActivity(intent); */
                //Uri uri = Uri.parse("tel:32322024");
                //Intent intent = new Intent (Intent.Act, uri);
                //StartActivity (intent);
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
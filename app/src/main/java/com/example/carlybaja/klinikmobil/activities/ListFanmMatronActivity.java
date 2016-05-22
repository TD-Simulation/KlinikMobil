package com.example.carlybaja.klinikmobil.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;

public class ListFanmMatronActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fanm_matron);


        //Get ListView object
        listView = (ListView)findViewById(R.id.listFanmAnsent);

        //Defined array to show in listview
        String[] values= new String[]{
                "1-\nNom\t\t\t\t\t\t\t:\tMarie Mona \nAdr\t\t\t\t\t\t\t\t:\t2 nazon, P-A-P, \nTel\t\t\t\t\t\t\t\t:\t+509 32 32 20 24\n",
                "2-\nNom\t\t\t\t\t\t\t:\tMistafa Jean \nAdr\t\t\t\t\t\t\t\t:\t3 Mariani, Carrefour, \nTel\t\t\t\t\t\t\t\t:\t509 31 33 24 20\n",
                "3-\nNom\t\t\t\t\t\t\t:\tAlice Jeanne \nAdr\t\t\t\t\t\t\t\t:\t20 Rte Turgeau, P-A-P, \nTel\t\t\t\t\t\t\t\t:\t+509 41 24 43 25\n",
                "4-\nNom\t\t\t\t\t\t\t:\tEliza Augustin \nAdr\t\t\t\t\t\t\t\t:\t12 Carrefour-feuille, \nTel\t\t\t\t\t\t\t\t:\t+509 75 23 10 21\n",
                "5-\nNom\t\t\t\t\t\t\t:\tRitha Joseph-Jeanne \nAdr\t\t\t\t\t\t\t\t:\t32 Bicentenaire, \nTel\t\t\t\t\t\t\t\t:\t+509 81 20 32 45\n"
        };

        //Define A new Adapter
        //parameter
        //context- Layout for the row- ID of the textview-array of data
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        //Assign adapter to listview
        listView.setAdapter(adapter);

        //ListView item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //ListView Clicked item index
                int itemPos = position;

                //Listview Clicked item =Value
                String itemValue= (String) listView.getItemAtPosition(position);

                //show Alert

                Toast.makeText(getApplicationContext(),
                        "Position:"+itemPos+" ListItem:"+itemValue, Toast.LENGTH_LONG).show();
            }
        });
    }
}

package com.example.carlybaja.klinikmobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
                "1- Marie Mona",
                "2- Mistafa Jean", "3-  Alice Jeanne",
                "4- Eliza Augustin", "5-Ritha Joseph-Jeanne"
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

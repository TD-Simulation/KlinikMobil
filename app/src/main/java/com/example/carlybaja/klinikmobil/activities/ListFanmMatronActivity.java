package com.example.carlybaja.klinikmobil.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carlybaja.klinikmobil.R;
import com.example.carlybaja.klinikmobil.adapters.EnrolmentWAdapter;
import com.example.carlybaja.klinikmobil.models.EnrolmentW;

import java.util.ArrayList;

public class ListFanmMatronActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_fanm_matron);


        ArrayList<EnrolmentW> enrolmentWs = EnrolmentW.getFakeWomenByMatron();
        // Created the adapter
        EnrolmentWAdapter adapter = new EnrolmentWAdapter(this, enrolmentWs);
        // Find the listview
        ListView listViewFanm = (ListView) findViewById(R.id.listFanmAnsent);
        // Attached the adapter to the listview
        listViewFanm.setAdapter(adapter);


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
        startActivity(it);*/
    }
}

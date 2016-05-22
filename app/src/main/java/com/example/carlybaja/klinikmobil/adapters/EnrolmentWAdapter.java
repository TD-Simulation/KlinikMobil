package com.example.carlybaja.klinikmobil.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carlybaja.klinikmobil.R;
import com.example.carlybaja.klinikmobil.models.EnrolmentW;

import java.util.ArrayList;

/**
 * Created by carlybaja on 5/22/16.
 */
public class EnrolmentWAdapter extends  ArrayAdapter<EnrolmentW> {

    public EnrolmentWAdapter(Context context, ArrayList<EnrolmentW> enrolmentWs) {
        super(context, 0, enrolmentWs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        EnrolmentW enrolmentW = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_enrolment_w, parent, false);
        }
        // Lookup view for data population
       // ImageView ivPoster = (ImageView) convertView.findViewById(R.id.ivPoster);
        TextView tvFirstname = (TextView) convertView.findViewById(R.id.tvFirstname);
        TextView tvLastname = (TextView) convertView.findViewById(R.id.tvLastname);
        TextView tvPhone = (TextView)convertView.findViewById(R.id.tvPhone);
        // Populate the data into the template view using the data object

        // ivPoster.setImageURI(movye.posterUrl.);
        tvFirstname.setText(enrolmentW.getFirstname());
        tvLastname.setText(enrolmentW.getLastname());
        tvPhone.setText(enrolmentW.getPhone());
        // Return the completed view to render on screen
        return convertView;

    }
}


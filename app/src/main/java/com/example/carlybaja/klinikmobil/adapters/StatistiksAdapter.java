package com.example.carlybaja.klinikmobil.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carlybaja.klinikmobil.R;
import com.example.carlybaja.klinikmobil.models.Enterprise;
import com.example.carlybaja.klinikmobil.models.Statistik;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by carlybaja on 5/22/16.
 */
public class StatistiksAdapter extends ArrayAdapter<Statistik> {

    public StatistiksAdapter(Context context, ArrayList<Statistik> statistiks) {
        super(context, 0, statistiks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Statistik statistik = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_statistiks, parent, false);
        }
        // Lookup view for data population
        ImageView ivLogo = (ImageView) convertView.findViewById(R.id.ivContent);

        // Populate the data into the template view using the data object

        Picasso.with(getContext()).load(statistik.getUrlTab()).
                placeholder(R.mipmap.ic_placeholder).
                into(ivLogo);

        // Return the completed view to render on screen
        return convertView;

    }


}

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
import com.example.carlybaja.klinikmobil.models.Enterprise;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by carlybaja on 5/22/16.
 */
public class EnterprisesAdapter extends ArrayAdapter<Enterprise> {

    public EnterprisesAdapter(Context context, ArrayList<Enterprise> enterprises) {
        super(context, 0, enterprises);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Enterprise enterprise = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_enterprise, parent, false);
        }
        // Lookup view for data population
        ImageView ivLogo = (ImageView) convertView.findViewById(R.id.ivLogo);
        TextView tvEnterprise = (TextView) convertView.findViewById(R.id.tvEnterpriseName);
        TextView tvPhone = (TextView) convertView.findViewById(R.id.tvPhone);
        TextView tvContactName = (TextView)convertView.findViewById(R.id.tvContactName);
        TextView tvContactPhone = (TextView)convertView.findViewById(R.id.tvContactPhone);
        TextView tvContactEmail = (TextView)convertView.findViewById(R.id.tvContactEmail);
        // Populate the data into the template view using the data object

        Picasso.with(getContext()).load(enterprise.getUrlEntrepriseLogo()).
                placeholder(R.mipmap.ic_placeholder).
                into(ivLogo);
        tvEnterprise.setText(enterprise.getEnterpriseName());
        tvPhone.setText(enterprise.getPhone());
        tvContactName.setText(enterprise.getPersonContact());
        tvContactPhone.setText(enterprise.getPersonContactPhone());
        tvContactEmail.setText(enterprise.getPersonContactEmail());
        // Return the completed view to render on screen
        return convertView;

    }
}

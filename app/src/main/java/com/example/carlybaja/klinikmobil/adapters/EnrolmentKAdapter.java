package com.example.carlybaja.klinikmobil.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.carlybaja.klinikmobil.models.EnrolmentK;
import com.example.carlybaja.klinikmobil.models.EnrolmentW;

import java.util.ArrayList;

/**
 * Created by carlybaja on 5/22/16.
 */
public class EnrolmentKAdapter extends ArrayAdapter<EnrolmentK> {

    public EnrolmentKAdapter(Context context, ArrayList<EnrolmentK> enrolmentKs) {
        super(context, 0, enrolmentKs);
    }


}

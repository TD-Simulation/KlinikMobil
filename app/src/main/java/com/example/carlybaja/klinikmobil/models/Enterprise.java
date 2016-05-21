package com.example.carlybaja.klinikmobil.models;

import android.media.Image;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by carlybaja on 5/21/16.
 */
@Parcel
public class Enterprise {

    String enterpriseId;
    String urlEntrepriseLogo;
    String enterpriseName;
    List<Department> departments;
    List<Commune> communes;
    String adress;
    String phone;
    String email;
    String personContact;
    String personContactPhone;
    String personContactEmail;
    List<User> users;


}

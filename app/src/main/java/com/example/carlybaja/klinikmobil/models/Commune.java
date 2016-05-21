package com.example.carlybaja.klinikmobil.models;

import org.parceler.Parcel;

import java.net.CookieHandler;
import java.util.ArrayList;

/**
 * Created by carlybaja on 5/21/16.
 */
@Parcel
public class Commune {

    String communeId;
    String communeDesc;

    public Commune(){
    }

    public Commune(String communeId, String communeDesc) {
        this.communeId = communeId;
        this.communeDesc = communeDesc;
    }

    public String getCommuneId() {
        return communeId;
    }

    public void setCommuneId(String communeId) {
        this.communeId = communeId;
    }

    public String getCommuneDesc() {
        return communeDesc;
    }

    public void setCommuneDesc(String communeDesc) {
        this.communeDesc = communeDesc;
    }

    // get  commune objects
    public static ArrayList<Commune> getCommunes(){
        ArrayList<Commune> communes = new ArrayList<>();
        communes.add(new Commune("PV","Petyon vil"));
        communes.add(new Commune("DEL","Delma"));
        communes.add(new Commune("CA","Kafou"));
        return communes;
    }
}

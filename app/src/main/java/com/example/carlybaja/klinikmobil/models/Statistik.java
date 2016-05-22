package com.example.carlybaja.klinikmobil.models;

import java.util.ArrayList;

/**
 * Created by carlybaja on 5/22/16.
 */
public class Statistik {

    String urlTab;

    public Statistik(String urlTab) {
        this.urlTab = urlTab;
    }

    public String getUrlTab() {
        return urlTab;
    }

    public static ArrayList<Statistik> getFakeTab(){
        ArrayList<Statistik> statistiks = new ArrayList<>();
        statistiks.add(new Statistik("https://dl.dropboxusercontent.com/u/162942285/src_grafik_deux.png"));
        statistiks.add(new Statistik("https://dl.dropboxusercontent.com/u/162942285/src_grafik_km.png"));
        statistiks.add(new Statistik("https://dl.dropboxusercontent.com/u/162942285/src_grafik_one.png"));
        statistiks.add(new Statistik("https://dl.dropboxusercontent.com/u/162942285/src_grafik_pr.png"));
        statistiks.add(new Statistik("https://dl.dropboxusercontent.com/u/162942285/src_grafik_tr.png"));

        return statistiks;
    }
}

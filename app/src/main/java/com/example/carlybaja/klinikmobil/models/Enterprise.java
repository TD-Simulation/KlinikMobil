package com.example.carlybaja.klinikmobil.models;

import android.media.Image;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlybaja on 5/21/16.
 */
@Parcel
public class Enterprise {

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getUrlEntrepriseLogo() {
        return urlEntrepriseLogo;
    }

    public void setUrlEntrepriseLogo(String urlEntrepriseLogo) {
        this.urlEntrepriseLogo = urlEntrepriseLogo;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonContactEmail() {
        return personContactEmail;
    }

    public void setPersonContactEmail(String personContactEmail) {
        this.personContactEmail = personContactEmail;
    }

    public String getPersonContactPhone() {
        return personContactPhone;
    }

    public void setPersonContactPhone(String personContactPhone) {
        this.personContactPhone = personContactPhone;
    }

    public String getPersonContact() {
        return personContact;
    }

    public void setPersonContact(String personContact) {
        this.personContact = personContact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String enterpriseId;
    String urlEntrepriseLogo;
    String enterpriseName;

    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public String getCommuneDesc() {
        return communeDesc;
    }

    String departmentDesc;
    String communeDesc;
   // List<Department> departments;
  //  List<Commune> communes;
    String adress;
    String phone;
    String email;
    String personContact;
    String personContactPhone;
    String personContactEmail;
    List<User> users;

    public Enterprise(){
    }

    public Enterprise(String enterpriseId, String urlEntrepriseLogo, String enterpriseName, String departmentDesc, String communeDesc, String adress, String phone, String email, String personContact, String personContactPhone, String personContactEmail) {
        this.enterpriseId = enterpriseId;
        this.urlEntrepriseLogo = urlEntrepriseLogo;
        this.enterpriseName = enterpriseName;
        this.departmentDesc = departmentDesc;
        this.communeDesc = communeDesc;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.personContact = personContact;
        this.personContactPhone = personContactPhone;
        this.personContactEmail = personContactEmail;
    }


    public static ArrayList<Enterprise> getFakeEntreprise(){
        ArrayList<Enterprise> enterprises = new ArrayList<>();
        enterprises.add(new Enterprise("E-001","https://sp.yimg.com/ib/th?id=OIP.Maaecd6d4f4cacd9137636ed4c1c6a93do0&pid=15.1","Zanmi Lasante","Centre","Mirebalais","N/A","+509-2223-4545","zanmilasante@gmail.com","Pierre Louis", "N/A","djason"));
        enterprises.add(new Enterprise("E-001","http://www.gheskio.org/img/logo.png","Les Centres GHESKIO","Ouest","Port-au-Prince","N/A","+509-2223-4545","zanmilasante@gmail.com","Pierre Louis", "N/A","djason"));
        //     enterprises.add(new Enterprise("W-005","Pierre","Jules","+509466567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));
        //     enterprises.add(new Enterprise("W-005","Pierre","Jules","+509466567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));

        return enterprises;
    }
}

package com.example.carlybaja.klinikmobil.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlybaja on 5/21/16.
 */

@Parcel
public class EnrolmentW {

    String womanId;
    String firstname;
    String lastname;
    String phone;
    int menarcheAge;
    int ageOfFirstSexualRelation;
    Boolean dysmenorrhea;
    Boolean infertilite;
    String DDR;
    String pregnancyTest;
    String DPA;
    Boolean multiplePregnancy;
    Boolean preEclampsia;
    Boolean pregnancyBleeding;
    List<EnrolmentK> enrolmentKs;
    String notes;
    String userdID;

    public EnrolmentW(){

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EnrolmentW(String womanId, String firstname, String lastname, String phone , int menarcheAge, int ageOfFirstSexualRelation, Boolean dysmenorrhea, Boolean infertilite, String DDR, String pregnancyTest, String DPA, Boolean multiplePregnancy, Boolean preEclampsia, Boolean pregnancyBleeding, String notes, String userdID) {
        this.womanId = womanId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.menarcheAge = menarcheAge;
        this.ageOfFirstSexualRelation = ageOfFirstSexualRelation;
        this.dysmenorrhea = dysmenorrhea;
        this.infertilite = infertilite;
        this.DDR = DDR;
        this.pregnancyTest = pregnancyTest;
        this.DPA = DPA;
        this.multiplePregnancy = multiplePregnancy;
        this.preEclampsia = preEclampsia;
        this.pregnancyBleeding = pregnancyBleeding;
        this.notes = notes;
        this.userdID = userdID;
    }

    public String getWomanId() {
        return womanId;
    }

    public void setWomanId(String womanId) {
        this.womanId = womanId;
    }

    public int getMenarcheAge() {
        return menarcheAge;
    }

    public void setMenarcheAge(int menarcheAge) {
        this.menarcheAge = menarcheAge;
    }

    public int getAgeOfFirstSexualRelation() {
        return ageOfFirstSexualRelation;
    }

    public void setAgeOfFirstSexualRelation(int ageOfFirstSexualRelation) {
        this.ageOfFirstSexualRelation = ageOfFirstSexualRelation;
    }

    public Boolean getDysmenorrhea() {
        return dysmenorrhea;
    }

    public void setDysmenorrhea(Boolean dysmenorrhea) {
        this.dysmenorrhea = dysmenorrhea;
    }

    public Boolean getInfertilite() {
        return infertilite;
    }

    public void setInfertilite(Boolean infertilite) {
        this.infertilite = infertilite;
    }

    public String getDDR() {
        return DDR;
    }

    public void setDDR(String DDR) {
        this.DDR = DDR;
    }

    public String getPregnancyTest() {
        return pregnancyTest;
    }

    public void setPregnancyTest(String pregnancyTest) {
        this.pregnancyTest = pregnancyTest;
    }

    public String getDPA() {
        return DPA;
    }

    public void setDPA(String DPA) {
        this.DPA = DPA;
    }

    public Boolean getMultiplePregnancy() {
        return multiplePregnancy;
    }

    public void setMultiplePregnancy(Boolean multiplePregnancy) {
        this.multiplePregnancy = multiplePregnancy;
    }

    public Boolean getPreEclampsia() {
        return preEclampsia;
    }

    public void setPreEclampsia(Boolean preEclampsia) {
        this.preEclampsia = preEclampsia;
    }

    public Boolean getPregnancyBleeding() {
        return pregnancyBleeding;
    }

    public void setPregnancyBleeding(Boolean pregnancyBleeding) {
        this.pregnancyBleeding = pregnancyBleeding;
    }


    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUserdID() {
        return userdID;
    }

    public void setUserdID(String userdID) {
        this.userdID = userdID;
    }

    public static ArrayList<EnrolmentW> getFakeWomen(){
        ArrayList<EnrolmentW> women = new ArrayList<>();
        women.add(new EnrolmentW("W-001","Mona","Augustin","+509434567",12,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));
        women.add(new EnrolmentW("W-002","Pierre","Augustin","+509434567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));
        women.add(new EnrolmentW("W-004","Pierre","Therese","+509464567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));
        women.add(new EnrolmentW("W-005","Pierre","Jules","+509466567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));
        women.add(new EnrolmentW("W-007","Walter","Augustin","+5094364567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));

        return women;
    }


    public static ArrayList<EnrolmentW> getFakeWomenByMatron(){
        ArrayList<EnrolmentW> women = new ArrayList<>();
        women.add(new EnrolmentW("W-001","Mona","Augustin","+509434567",12,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));
        women.add(new EnrolmentW("W-005","Pierre","Jules","+509466567",14,16,false,false,"04-10-2016","04-17-2016","04-22-2016",false, false, false,"N/A","djason"));

        return women;
    }
}

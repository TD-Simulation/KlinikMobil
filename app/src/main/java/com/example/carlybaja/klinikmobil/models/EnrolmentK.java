package com.example.carlybaja.klinikmobil.models;

import org.parceler.Parcel;

import java.util.ArrayList;

/**
 * Created by carlybaja on 5/21/16.
 */

@Parcel
public class EnrolmentK {

    String enfantID;
    String enterpriseId;
    String enrollmentDate;
    String enfantFirstName;
    String enfantLastName;
    String motherID;
    String enfantBirthdate;
    String enfantBirthplace;
    Boolean motherDelivery;
    String notes;
    String nextVisit;
    String userID;


    public EnrolmentK() {}

    public EnrolmentK(String enfantID, String enterpriseId,String enrollmentDate,String enfantFirstName, String enfantLastName, String motherID, String enfantBirthdate, String enfantBirthplace, Boolean motherDelivery, String notes, String nextVisit, String userID) {
        this.enfantID = enfantID;
        this.enterpriseId = enterpriseId;
        this.enrollmentDate = enrollmentDate;
        this.enfantFirstName = enfantFirstName;
        this.enfantLastName = enfantLastName;
        this.motherID = motherID;
        this.enfantBirthdate = enfantBirthdate;
        this.enfantBirthplace = enfantBirthplace;
        this.motherDelivery = motherDelivery;
        this.notes = notes;
        this.nextVisit = nextVisit;
        this.userID = userID;
    }

    public String getEnfantID() {
        return enfantID;
    }

    public void setEnfantID(String enfantID) {
        this.enfantID = enfantID;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getEnfantFirstName() {
        return enfantFirstName;
    }

    public void setEnfantFirstName(String enfantFirstName) {
        this.enfantFirstName = enfantFirstName;
    }

    public String getEnfantLastName() {
        return enfantLastName;
    }

    public void setEnfantLastName(String enfantLastName) {
        this.enfantLastName = enfantLastName;
    }

    public String getMotherID() {
        return motherID;
    }

    public void setMotherID(String motherID) {
        this.motherID = motherID;
    }

    public String getEnfantBirthdate() {
        return enfantBirthdate;
    }

    public void setEnfantBirthdate(String enfantBirthdate) {
        this.enfantBirthdate = enfantBirthdate;
    }

    public String getEnfantBirthplace() {
        return enfantBirthplace;
    }

    public void setEnfantBirthplace(String enfantBirthplace) {
        this.enfantBirthplace = enfantBirthplace;
    }

    public Boolean getMotherDelivery() {
        return motherDelivery;
    }

    public void setMotherDelivery(Boolean motherDelivery) {
        this.motherDelivery = motherDelivery;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(String nextVisit) {
        this.nextVisit = nextVisit;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    // Return two fake objects
    public static ArrayList<EnrolmentK> getFakeKids(){
        ArrayList<EnrolmentK> kids = new ArrayList<>();
        kids.add(new EnrolmentK("K-001","I-295","15-10-2012","Malaika","Marcelin","M-680","10-10-2012","Port-au-Prince", true,"N/A","25-05-2016","carly"));
        kids.add(new EnrolmentK("K-002","I-300","10-06-2014","Ritchy","Joseph","M-710","22-07-2014","Port-au-Prince", true,"N/A","31-05-2016","thierry"));
        return kids;
    }
}



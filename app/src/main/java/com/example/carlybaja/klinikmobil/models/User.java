package com.example.carlybaja.klinikmobil.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlybaja on 5/21/16.
 */
@Parcel
public class User {

    String userId;
    String userPass;
    String userCategory;
    String userFirstname;
    String userLastname;
    String userSex;
    String userPhone;
    String userEmail;
    List<Enterprise> enterprises;

    public User(){
    }

    public User(String userId, String userPass, String userCategory, String userFirstname, String userLastname,String userSex ,String userPhone, String userEmail) {
        this.userId = userId;
        this.userPass = userPass;
        this.userCategory = userCategory;
        this.userFirstname = userFirstname;
        this.userLastname = userLastname;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }

    public User(String userId, String userPass){
        this.userId = userId;
        this.userPass = userPass;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    // All list for details screens
    public String getUserSexFullName() {

        switch (userSex) {
            case "G" : return "Gason";
            case "F" : return "Ti fi";
        }
        return "";
    }

    public String getUserCategoryFullName(){

        switch (userCategory) {
            case "MED": return "Dokte";
            case "INF": return "Infimye";
            case "ADM": return "Administwate";
            case "MAT": return "Matron";
        }
        return "";
    }


    // Return 5 fake objects
    public static ArrayList<User> getFakeUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("marc","papa1"));
        users.add(new User("djason","papa2"));
        users.add(new User("mona","papa3"));
        users.add(new User("thierry","papa4"));
        users.add(new User("carly","papa5"));
        return users;
    }


}

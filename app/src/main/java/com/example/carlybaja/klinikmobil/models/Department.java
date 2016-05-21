package com.example.carlybaja.klinikmobil.models;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlybaja on 5/21/16.
 */
@Parcel
public class Department {

    String departmentId;
    String departmentDesc;
    List <Commune> communes;

    public Department(){
    }

    public Department(String departmentDesc, String departmentId) {
        this.departmentDesc = departmentDesc;
        this.departmentId = departmentId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentDesc() {
        return departmentDesc;
    }

    public void setDepartmentDesc(String departmentDesc) {
        this.departmentDesc = departmentDesc;
    }

    // get fake department object
    public static ArrayList<Department> getDepartments(){
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(new Department("Ouest","O"));
        return departments;
    }
}

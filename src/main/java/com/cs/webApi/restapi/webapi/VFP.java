package com.cs.webApi.restapi.webapi;

public class VFP {
    protected Integer id;
    protected String firstName;
    protected String lastName;
    protected Integer Age;
    protected Boolean Employed;

    public VFP(Integer id, String firstName,String lastName, Integer age, Boolean employed) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        Employed = employed;
    }
    public String toString(){
        return "Employee [id="
                + id + ", firstName="
                + firstName + ", lastName="
                + lastName + ", Age= " + Age + ", Employed="
                + Employed+ "]";

    }
}

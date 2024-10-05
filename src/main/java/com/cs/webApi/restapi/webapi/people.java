package com.cs.webApi.restapi.webapi;

import org.jetbrains.annotations.NotNull;

public class people extends VFP implements peopleinterf{
    public people(Integer id, String firstName, String firstName1, String lastName, Integer age, Boolean employed) {
        super(id, firstName, lastName, age, employed);
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
          this.id = id;
    }

    @NotNull
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(@NotNull String firstname) {
           this.firstName = firstname;
    }

    @NotNull
    @Override
    public String getlastname() {
        return lastName;
    }

    @Override
    public void setlastname(@NotNull String lastname) {
        this.lastName = lastname;
    }

    @Override
    public int getage() {
        return Age;
    }

    @Override
    public void setage(int age) {
        this.Age = age;
    }

    @Override
    public boolean getemployed() {
        return Employed;
    }

    @Override
    public void setEmployed(boolean employed) {
         this.Employed = employed;
    }
}

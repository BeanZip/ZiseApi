package com.cs.webApi.restapi.webapi;

import java.util.ArrayList;
import java.util.List;

public class Populus {

    private List<People> peopleList;
    public List<People> getPeopleList(){

        if (peopleList == null){
            peopleList = new ArrayList<>();
        }
        return peopleList;
    }
    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }
}

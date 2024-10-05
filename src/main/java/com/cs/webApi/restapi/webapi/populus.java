package com.cs.webApi.restapi.webapi;

import java.util.ArrayList;
import java.util.List;

public class populus {

    private List<people> peopleList;
    public List<people> getPeopleList(){

        if (peopleList == null){
            peopleList = new ArrayList<>();
        }
        return peopleList;
    }
    public void setPeopleList(List<people> peopleList) {
        this.peopleList = peopleList;
    }
}

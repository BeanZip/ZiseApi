package com.cs.webApi.restapi.webapi

import org.springframework.stereotype.Repository

@Repository
object peopledao {
    private val list = populus()

    init {
        list.peopleList.add(people(1, "John", "null", "Doe", 2, false))
        list.peopleList.add(people(2,"Jane","null,","Doe",24,true))
        list.peopleList.add(people(3,"Oliver","null","Pelso",34,true))
    }

    fun getAllEPeople(): populus {
        return list
    }

    fun addperson(people: people) {
        list.peopleList.add(people)
    }
}
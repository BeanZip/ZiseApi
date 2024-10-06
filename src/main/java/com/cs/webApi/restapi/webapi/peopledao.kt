package com.cs.webApi.restapi.webapi

import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping

@Repository
object PeopleDao{
    private val list = Populus()

    /**
     * Just add a PeopleList, with
     *  list.peopleList.add(People(id,firstname,null,lastname,age,employed)
     **/
    init {
        list.peopleList.add(People(1, "John", "null", "Doe", 2, false))
        list.peopleList.add(People(2, "Jane", "null,", "Doe", 24, true))
        list.peopleList.add(
            People(
                3,
                "Oliver",
                "null",
                "Pelso",
                34,
                true
            )
        )
        list.peopleList.add(
            People(
                4,
                "William",
                "null",
                "Scolos",
                21,
                false
            )
        )
            list.peopleList.add(People(5, "P", "null", "Diddy", 43, true))
            list.peopleList.add(People(6,"Mario","null","Mario",27,true))
    }
    fun getAllEPeople(): Populus {
        return list
    }

    fun addperson(people: People) {
        list.peopleList.add(people)
    }
}
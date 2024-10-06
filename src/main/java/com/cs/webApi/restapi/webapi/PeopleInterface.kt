package com.cs.webApi.restapi.webapi

interface PeopleInterface {

    /** get/set interface so i dont suffer from coding brainrot
     */
    fun getID(): Int
    fun setID(id: Int)
    fun getFirstName(): String
    fun setFirstName(firstname: String)
    fun getlastname(): String
    fun setlastname(lastname: String)
    fun getage(): Int
    fun setage(age: Int)
    fun getemployed(): Boolean
    fun setEmployed(employed: Boolean)
}
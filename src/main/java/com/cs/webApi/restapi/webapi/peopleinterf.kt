package com.cs.webApi.restapi.webapi

interface peopleinterf {
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
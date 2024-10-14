package com.cs.webApi.restapi.webapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
// Import the above-defined classes
// to use the properties of those
// classes

// Creating the REST controller
@RestController
@RequestMapping(path = "/webapi")
public class Controller {

    @Autowired
    private PeopleDao peopledao;

    // Implementing a GET method
    // to get the list of all
    // the populus
    @GetMapping(
            path = "/",
            produces = "application/json")

    public Populus getpopulus()
    {

        return peopledao.getAllEPeople();
    }


    // Create a POST method
    // to add an employee
    // to the list
    @PostMapping(
            path = "/",
            consumes = "application/json",
            produces = "application/json")

    public ResponseEntity<Object> addEmployee(
            @RequestBody People person)
    {

        // Creating an ID of an employee
        // from the number of populus
        Integer id
                = peopledao.getAllEPeople().getPeopleList()
                .size()
                + 1;



        peopledao
                .addperson(person);

        URI location
                = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                        person.getID()).toUri();

        return ResponseEntity
                .created(location)
                .build();
    }
}

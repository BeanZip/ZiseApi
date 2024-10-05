package com.cs.webApi.restapi.webapi;
import java.net.URI;
import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind
        .annotation.GetMapping;
import org.springframework.web.bind
        .annotation.PostMapping;
import org.springframework.web.bind
        .annotation.RequestBody;
import org.springframework.web.bind
        .annotation.RequestMapping;
import org.springframework.web.bind
        .annotation.RestController;
import org.springframework.web.servlet
        .support.ServletUriComponentsBuilder;
// Import the above-defined classes
// to use the properties of those
// classes

// Creating the REST controller
@RestController
@RequestMapping(path = "/webapi")
public class controller {

    @Autowired
    private peopledao peopledao;

    // Implementing a GET method
    // to get the list of all
    // the populus
    @GetMapping(
            path = "/",
            produces = "application/json")

    public populus getpopulus()
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
            @RequestBody people person)
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

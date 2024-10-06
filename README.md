# Overview

## What is This?
This is a Web Api Designed for My Computer Science Club at CAIT Using Spring Framework.

## Purpose

Python wouldn't work on my Laptop So I had to "Improvise"
## Where Can I learn this

You can learn how to use the Spring API <a href="https://spring.io/guides/gs/rest-service#scratch"> Here!</a> It is very cool and fun to experiment with.

## I initialized it now where do I go.
Simple You Press <a href="http://localhost:8080/webapi/"> This </a> Or "http://localhost:8080/webapi/" to initalize it.
There is also a secret html file if you can activate it ;)

## What is the code comprised of
This Code uses some Html, but uses Kotlin/Java To Activate it using the SpringBoot Framework after 5 hours of doing thing stuff.

```java
import org.springframework.web.bind.annotation.RestController;

/*
        Do Not Forget @RestController this allows the resapi to work
        or something like that.
 */
@RestController
public class WebApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
    }
}
```
And How The Kotlin Code Works

```kotlin
// examples from PeopleDao.kt //

list.peopleList.add(People(1, "John", "null", "Doe", 2, false))

/* How To Add Values To The Json */
```

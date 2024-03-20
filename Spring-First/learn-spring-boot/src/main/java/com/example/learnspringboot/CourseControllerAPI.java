 package com.example.learnspringboot;

import java.util.*;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//localhost:8080/courses

@RestController
public class CourseControllerAPI {

    @RequestMapping("/courses")
    public String requestMethodName(@RequestParam String param) {
        return new String();
    }
    
    public List<Coursess> retrieveAllCoureses(){
        return Arrays.asList(
             new Coursess(1,"Learn AWS","in28minutes"),
             new Coursess(2,"Learn DevOps","SurajSingh")
        );
    }
}

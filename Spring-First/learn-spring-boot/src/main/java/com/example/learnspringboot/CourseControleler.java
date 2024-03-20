package com.example.learnspringboot;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseControleler {

    @RequestMapping("/courses")
    public List<Coursess> retrieveAllCoureses(){
        return Arrays.asList(
            new Coursess(1,"Learn AWS" , "Suraj"),
            new Coursess(2,"Learn DevOps" , "Suraj"),
            new Coursess(3,"Learn Full Stack Development" , "Suraj")
        );
    }

}

package com.example.learnspringboot;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCoureses(){
        return Arrays.asList(
            new Course(1,"Learn AWS" , "Suraj"),
            new Course(2,"Learn DevOps" , "Suraj"),
            new Course(3,"Learn Full Stack Development" , "Suraj")
        );
    }

}

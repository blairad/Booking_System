package com.example.BookingSystem.controllers;


import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

}

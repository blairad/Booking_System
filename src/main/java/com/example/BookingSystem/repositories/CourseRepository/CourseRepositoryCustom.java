package com.example.BookingSystem.repositories.CourseRepository;

import com.example.BookingSystem.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesByRating(int rating);
}

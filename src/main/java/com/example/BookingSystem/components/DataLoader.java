package com.example.BookingSystem.components;

import com.example.BookingSystem.models.Booking;
import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import com.example.BookingSystem.repositories.BookingRepository.BookingRepository;
import com.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Customer customer = new Customer("Bill", "Tobermory", 72);
        customerRepository.save(customer);
        Customer customer1 = new Customer("Ted", "Lochranza", 30);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Deb", "Applecross", 50);
        customerRepository.save(customer2);


        Course course = new Course("Java", "Ayr", 4);
        courseRepository.save(course);
        Course course1 = new Course("JavaScript", "Balamory", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Ruby", "Dunoon", 5);
        courseRepository.save(course2);


        Booking booking = new Booking("21-06-19", course, customer );
        bookingRepository.save(booking);
        Booking booking1 = new Booking("22-06-19", course1, customer1 );
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("21-06-18", course2, customer2 );
        bookingRepository.save(booking2);

    }




}

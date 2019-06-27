package com.example.BookingSystem;

import com.example.BookingSystem.repositories.CourseRepository.CourseRepository;
import com.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){

	}

}

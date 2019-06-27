package com.example.BookingSystem.repositories.CustomerRepository;

import com.example.BookingSystem.models.Course;
import com.example.BookingSystem.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findAllCustomersByCourse(Long id) {

        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);
        Criteria cr = session.createCriteria(Customer.class);
        cr.createAlias("booking", "bookingAlias");
        cr.add(Restrictions.eq("bookingAlias.course.id", id));
        result = cr.list();
        return result;
    }


}

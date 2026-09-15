package com.learning.simpleBank.service;

import com.learning.simpleBank.exception.CustomerAlreadyExistsException;
import com.learning.simpleBank.exception.CustomerNotFoundException;
import com.learning.simpleBank.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {

    private final Map<Long, Customer> customers =  new HashMap<>();
    private Long nextId = 1L;


//    to create and to save the customer in the HashMap,
//    technically to accept the deserialized Java Object

    public Customer createCustomer(Customer customer) {

//      first map each customer to existingCustomer variable
        for(Customer existingCustomer : customers.values()) {
            if(existingCustomer.getEmail().equalsIgnoreCase(customer.getEmail())) {
                throw new CustomerAlreadyExistsException("This customer already exists");
            }
        }

        Long id = nextId;
        nextId++;
        Customer customerWithId = new Customer(id, customer.getName(), customer.getEmail());
        customers.put(id, customerWithId);
        return customerWithId;

    }

    public Customer findCustomerById(Long id) {
        Customer customer = customers.get(id);

        if(customer == null) {
            throw new CustomerNotFoundException("Customer with ID:" + id + " is null");
        }
        return customer;
    }

//  GET ALL USERS

    public Map<Long, Customer> getCustomers() {
        return customers;
    }


//    UPDATES: PUT AND PATCH

//    PUT

    public Customer updateCustomer(Long id, Customer customer) {

        Customer existingCustomer = customers.get(id);
        if(existingCustomer == null) {
            throw new CustomerNotFoundException("Customer with ID:" + id + " does not exist..");
        }

        customer.setId(id);
        customers.put(id, customer);
        return customer;
    }

//    PATCH

    public Customer partialUpdate(Long id, Customer customer) {
        Customer existingCustomer = customers.get(id);
        if (existingCustomer == null) {
            throw new CustomerNotFoundException("Customer with ID: " + id + " does not exist...");
        }

        if (customer.getEmail() != null) {
            existingCustomer.setEmail(customer.getEmail());
        }

        if (customer.getName() != null) {
            existingCustomer.setName(customer.getName());
        }

        return existingCustomer;
    }

//  DELETE USER

    public void deleteCustomer(Long id) {
        Customer customer = customers.get(id);

        if(customer == null) {
            throw new CustomerNotFoundException("Customer with ID:" + id + " is null");
        }

        customers.remove(id);
    }

//    DELETE ALL USERS

    public void deleteAllCustomers() {
        customers.clear();
    }

}

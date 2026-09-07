package com.learning.simpleBank.service;

import com.learning.simpleBank.exception.CustomerNotFoundException;
import com.learning.simpleBank.model.Customer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CustomerService {

    private Map<Long, Customer> customers =  new HashMap<>();
    private Long nextId = 1L;



    public Map<Long, Customer> getCustomers() {
        return customers;
    }


//    to create and to save the customer in the HashMap,
//    technically to accept the deserialized Java Object

    public Customer createCustomer(Customer customer) {
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

    public void deleteCustomer(Long id) {
        Customer customer = customers.get(id);

        if(customer == null) {
            throw new CustomerNotFoundException("Customer with ID:" + id + " is null");
        }

        customers.remove(id);
    }

    public void deleteAllCustomers() {
        customers.clear();
    }

}

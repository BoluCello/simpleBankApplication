package com.learning.simpleBank.controller;


import com.learning.simpleBank.model.Customer;
import com.learning.simpleBank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    public CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer postCustomers(@RequestBody Customer customer) {
      return customerService.createCustomer(customer);
    }

    @GetMapping
    public Map<Long, Customer> getAllCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping
    public void deleteAllCustomers() {
        customerService.deleteAllCustomers();
    }


}

package com.ari.compras.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * CustomerGraphql
 */
@Component
public class CustomerGraphql implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private CustomerService customerService;

  public Customer customer(Long id) {
    return customerService.findById(id);
  }

  public List<Customer> customers() {
    return customerService.findAll();
  }

  public Customer saveCustomer(Long id, String name, String email) {
    Customer customer = new Customer(id, name, email);
    return customerService.save(customer);
  }

  public Boolean removeCustomer(Long id) {
    return customerService.deleteById(id);
  }
}

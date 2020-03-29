package com.ari.compras.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.modelmapper.ModelMapper;
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

  public Customer saveCustomer(CustomerInput input) {
    // Customer customer = new Customer();
    // customer.setId(input.getId());
    // customer.setEmail(input.getEmail());
    // customer.setName(input.getName());

    ModelMapper modelMaper = new ModelMapper();
    Customer customer = modelMaper.map(input, Customer.class);
    return customerService.save(customer);
  }

  public Boolean removeCustomer(Long id) {
    return customerService.deleteById(id);
  }
}

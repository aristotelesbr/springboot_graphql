package com.ari.compras.graphql;

import java.util.List;

import com.ari.compras.domain.Customer;
import com.ari.compras.domain.CustomerService;
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
  private CustomerService service;

  public Customer customer(Long id) {
    return service.findById(id);
  }

  public List<Customer> customers() {
    return service.findAll();
  }

  public Customer saveCustomer(CustomerInput input) {
    ModelMapper modelMaper = new ModelMapper();
    Customer customer = modelMaper.map(input, Customer.class);
    return service.save(customer);
  }

  public Boolean removeCustomer(Long id) {
    return service.deleteById(id);
  }
}

package com.ari.compras.graphql;

import java.util.List;

import com.ari.compras.Customer;
import com.ari.compras.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

/**
 * CustomerGraphql
 */
@Component
public class CustomerGraphql implements GraphQLQueryResolver {

  @Autowired
  private CustomerRepository repoCustomer;

  public Customer customer(Long id) {
    return repoCustomer.findById(id).orElse(null);
  }

  public List<Customer> customers() {
    return repoCustomer.findAll();
  }
}

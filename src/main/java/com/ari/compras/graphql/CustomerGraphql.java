package com.ari.compras.graphql;

import java.util.List;
import javax.transaction.Transactional;
import com.ari.compras.Customer;
import com.ari.compras.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

/**
 * CustomerGraphql
 */
@Component
public class CustomerGraphql implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private CustomerRepository repoCustomer;

  public Customer customer(Long id) {
    return repoCustomer.findById(id).orElse(null);
  }

  public List<Customer> customers() {
    return repoCustomer.findAll();
  }

  @Transactional
  public Customer saveCustomer(Long id, String name, String email) {
    Customer customer = new Customer(id, name, email);
    return repoCustomer.save(customer);
  }

  @Transactional
  public Boolean removeCustomer(Long id) {
    if (repoCustomer.findById(id).isPresent()) {
      repoCustomer.deleteById(id);
      return true;
    }
    return false;
  }
}

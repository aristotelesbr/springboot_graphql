package com.ari.compras.graphql;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * CustomerServices
 */
public class CustomerService {

  @Autowired
  private CustomerRepository repo;

  public Customer findById(Long id) {
    return repo.findById(id).orElse(null);
  }

  public List<Customer> findAll() {
    return repo.findAll();
  }

  @Transactional
  public Customer save(Customer customer) {
    return repo.save(customer);
  }

  @Transactional
  public Boolean deleteById(Long id) {
    if (repo.findById(id).isPresent()) {
      repo.deleteById(id);
      return true;
    }
    return false;
  }
}

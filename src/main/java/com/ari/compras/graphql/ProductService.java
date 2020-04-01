package com.ari.compras.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {

  @Autowired
  private ProductRepository repo;

  public List<Product> findAll() {
    return repo.findAll();
  }

  public Product findById(Long id) {
    return repo.findById(id).orElse(null);
  }
}

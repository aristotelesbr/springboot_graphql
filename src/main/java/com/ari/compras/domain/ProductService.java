package com.ari.compras.domain;

import java.util.List;
import javax.transaction.Transactional;
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

  @Transactional
  public Boolean deleteById(Long id) {
    if (repo.findById(id).isPresent()) {
      repo.deleteById(id);
      return true;
    }
    return false;
  }

  @Transactional
  public Product save(Product product) {
    return repo.save(product);
  }
}

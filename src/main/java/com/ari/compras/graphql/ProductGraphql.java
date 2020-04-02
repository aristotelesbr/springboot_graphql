package com.ari.compras.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ProductGraphql
 */
@Component
public class ProductGraphql implements GraphQLQueryResolver, GraphQLMutationResolver {

  @Autowired
  private ProductService service;

  public List<Product> products() {
    return service.findAll();
  }

  public Product product(Long id) {
    return service.findById(id);
  }

  public Boolean removeProduct(Long id) {
    return service.deleteById(id);
  }

  public Product saveProduct(ProductInput input) {
    ModelMapper modelMaper = new ModelMapper();
    Product product = modelMaper.map(input, Product.class);
    return service.save(product);
  }
}

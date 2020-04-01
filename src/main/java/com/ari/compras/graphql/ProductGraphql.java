package com.ari.compras.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

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
}

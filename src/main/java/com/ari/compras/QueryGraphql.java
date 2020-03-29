package com.ari.compras;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import org.springframework.stereotype.Component;

/**
 * QueryGraphql
 */
@Component
public class QueryGraphql implements GraphQLQueryResolver {
  public String hello() {
    return "hello from Graphql";
  }

  public int soma(int a, int b) {
    return a + b;
  }
}

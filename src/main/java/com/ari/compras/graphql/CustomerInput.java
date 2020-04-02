package com.ari.compras.graphql;

import lombok.Data;

/**
 * Customer
 */
@Data
public class CustomerInput {
  private Long id;
  private String name;
  private String email;
}

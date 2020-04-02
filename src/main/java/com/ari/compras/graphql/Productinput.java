package com.ari.compras.graphql;

import lombok.Data;

/**
 * Productinput
 */
@Data
public class ProductInput {
  private Long id;
  private String name;
  private Float price;
}

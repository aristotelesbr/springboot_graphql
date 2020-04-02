package com.ari.compras.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Productinput
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductInput {
  private Long id;
  private String name;
  private Float price;
}

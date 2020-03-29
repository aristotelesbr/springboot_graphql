package com.ari.compras.graphql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Notation @Data replaces Getters and Setters
 * Notation @AllArgsConstructor create constructor with all attributes
 * Notation @NoArgsConstructor create constructor less attributes
 */

/**
 * Customer
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInput {
  private Long id;
  private String name;
  private String email;
}

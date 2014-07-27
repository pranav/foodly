package com.pranav.foodly.core;

import io.dropwizard.hibernate.AbstractDAO;

import org.hibernate.SessionFactory;


public class SuggestionDAO extends AbstractDAO<Suggestion> {
  public SuggestionDAO(SessionFactory factory) {
    super(factory);
  }

  public Suggestion findById(Long id) {
    return this.get(id);
  }

  /* public long create(Suggestion suggestion) { */
  /*   return this.persist(suggestion).getId(); */
  /* } */

}

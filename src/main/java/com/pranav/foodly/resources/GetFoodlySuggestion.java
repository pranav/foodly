package com.pranav.foodly.resources;

import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pranav.foodly.core.Suggestion;
import com.pranav.foodly.core.SuggestionDAO;


@Path("/suggestions")
@Produces(MediaType.APPLICATION_JSON)
public class GetFoodlySuggestion {

  private SuggestionDAO sgdao;

  public GetFoodlySuggestion(String[] restaurants, SuggestionDAO sgdao) {
    this.sgdao = sgdao;
  }

  @GET
  @UnitOfWork
  public Suggestion getSuggestion() {
    return this.sgdao.findById(new Long(0));
  }
}

package com.pranav.foodly.resources;

import com.pranav.foodly.core.Suggestion;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Created by pgandhi on 7/21/14.
 */
@Path("/foodly")
@Produces(MediaType.APPLICATION_JSON)
public class GetFoodlySuggestion {

  private String[] restaurants;

  public GetFoodlySuggestion(String[] restaurants) {
    this.restaurants = restaurants;
  }

  @GET
  public Suggestion getSuggestion() {
    return new Suggestion(this.restaurants);
  }
}

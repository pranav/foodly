package com.pranav.foodly;

import io.dropwizard.Configuration;

/**
 * Created by pgandhi on 7/21/14.
 */
public class FoodlyConfiguration extends Configuration {

  private final String[] restaurants = new String[]{"Q Restaurant", "Saus"};

  public String[] getRestaurants() {
    return this.restaurants;
  }

}

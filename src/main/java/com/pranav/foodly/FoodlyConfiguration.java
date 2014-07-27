package com.pranav.foodly;

import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pgandhi on 7/21/14.
 */
public class FoodlyConfiguration extends Configuration {

  @Valid
  @NotNull
  @JsonProperty("database")
  private DataSourceFactory database = new DataSourceFactory();

  public DataSourceFactory getDataSourceFactory() {
    return this.database;
  }

  private final String[] restaurants = new String[]{"Q Restaurant", "Saus"};

  public String[] getRestaurants() {
    return this.restaurants;
  }

}

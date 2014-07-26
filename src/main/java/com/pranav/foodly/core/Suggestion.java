package com.pranav.foodly.core;

import java.util.Random;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pgandhi on 7/21/14.
 */
public class Suggestion {
    private String[] restaurants;

    public Suggestion(String[] restaurants) {
      this.restaurants = restaurants;
    }

    @JsonProperty
    public String getRestaurant() {
      int idx = new Random().nextInt(this.restaurants.length);
      return this.restaurants[idx];
    }

}

package com.pranav.foodly;

import com.pranav.foodly.resources.GetFoodlySuggestion;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by pgandhi on 7/21/14.
 */
public class FoodlyApp extends Application<FoodlyConfiguration> {
    public static void main(String[] args) throws Exception {
        new FoodlyApp().run(args);
    }

    @Override
    public String getName() {
       return "foodly";
    }

    @Override
    public void initialize(Bootstrap<FoodlyConfiguration> bootstrap) {

    }

    @Override
    public void run(FoodlyConfiguration configuration,Environment environment) {
        final GetFoodlySuggestion resource = new GetFoodlySuggestion(configuration.getRestaurants());
        environment.jersey().register(resource);
    }

}

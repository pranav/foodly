package com.pranav.foodly;

import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import com.pranav.foodly.core.Suggestion;
import com.pranav.foodly.core.SuggestionDAO;
import com.pranav.foodly.resources.GetFoodlySuggestion;


public class FoodlyApp extends Application<FoodlyConfiguration> {
  public static void main(String[] args) throws Exception {
    new FoodlyApp().run(args);
  }

  private final HibernateBundle<FoodlyConfiguration> hibernate = new HibernateBundle<FoodlyConfiguration>(Suggestion.class) {
    @Override
    public DataSourceFactory getDataSourceFactory(FoodlyConfiguration configuration) {
      return configuration.getDataSourceFactory();
    }
  };

  @Override
  public String getName() {
    return "foodly";
  }

  @Override
  public void initialize(Bootstrap<FoodlyConfiguration> bootstrap) {
    bootstrap.addBundle(this.hibernate);
  }

  @Override
  public void run(FoodlyConfiguration configuration,Environment environment) {
    SuggestionDAO sgdao = new SuggestionDAO(this.hibernate.getSessionFactory());
    GetFoodlySuggestion resource = new GetFoodlySuggestion(configuration.getRestaurants(), sgdao);
    environment.jersey().register(resource);
  }

}

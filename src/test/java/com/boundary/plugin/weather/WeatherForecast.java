package com.boundary.plugin.weather;

import com.github.fedy2.weather.*;
import com.github.fedy2.weather.data.*;
import com.github.fedy2.weather.data.unit.*;

/**
 * Example of getting a weather forecast
 */
public class WeatherForecast {

  public static void main(String[] args) throws Exception {
    YahooWeatherService service = new YahooWeatherService();
    Channel channel = service.getForecast("2502265", DegreeUnit.CELSIUS);
    System.out.println(channel.getDescription());
  }
}

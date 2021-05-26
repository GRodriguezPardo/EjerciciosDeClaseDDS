package cuartaIteracion;

import java.io.IOException;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;

public class WeatherForecastAccuWeatherAPI extends AccuWeatherAPI implements WeatherForecast {

  @Override
  public BigDecimal temperaturaDe(String ciudad) throws IOException {
    List<Map<String, Object>> temperaturas = this.getWeather(ciudad);
    return (BigDecimal) temperaturas.get(0).get("Temperature");
  }
}

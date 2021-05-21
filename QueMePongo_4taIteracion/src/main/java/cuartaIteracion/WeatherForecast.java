package cuartaIteracion;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/*
  La implementacion de esta interfaz idealmente obtendra la conexion a un servicio
  meteorologico del ServiceLocator (permitiendo modificar de donde la obtiene sin mucho problema.
 */
public interface WeatherForecast {

  BigDecimal temperaturaDe(String ciudad, LocalDate fecha) throws IOException;
}

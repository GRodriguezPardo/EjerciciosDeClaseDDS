package cuartaIteracion;

import primeraIteracion.Atuendo;
import primeraIteracion.Prenda;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guardarropa{
  private List<Prenda> prendas;
  private WeatherForecast pronosticador;
  private GeneradorSugerencias generadorSugerencias;


  public Guardarropa(WeatherForecast _pronosticador, GeneradorSugerencias generadorSugerencias) {
    this.pronosticador = _pronosticador;
    this.generadorSugerencias = generadorSugerencias;
    this.prendas = new ArrayList<>();
  }

  public List<Atuendo> generarSugerenciasPara(String ciudad, LocalDate fecha) throws IOException {
    List<Prenda> prendasAcordes = this.prendas.stream()
        .filter(prenda -> prenda.usableEnTemperatura(this.pronosticador.temperaturaDe(ciudad, fecha)));
    return this.generadorSugerencias.generarSugerenciaDesde(prendasAcordes);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }
}

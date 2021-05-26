package cuartaIteracion;

import primeraIteracion.Prenda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guardarropa{
  private List<Prenda> prendas;

  private GeneradorSugerencias generadorSugerencias;


  public Guardarropa(GeneradorSugerencias generadorSugerencias) {
    this.generadorSugerencias = generadorSugerencias;
    this.prendas = new ArrayList<>();
  }

  public List<Atuendo> generarSugerenciasPara(String ciudad) {
    List<Prenda> prendasAcordes = this.prendas.stream()
        .filter(prenda -> {
          try {
            return prenda.usableEnTemperatura(((WeatherForecast) ServiceLocator.getService("Pronosticador")).temperaturaDe(ciudad));
          } catch (IOException e) {
            throw new RuntimeException("Falla al obtener el clima de la ciudad");
          }
        }).collect(Collectors.toList());
    return this.generadorSugerencias.generarSugerenciaDesde(prendasAcordes);
  }

  public void agregarPrenda(Prenda prenda) {
    this.prendas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda) {
    this.prendas.remove(prenda);
  }

  public List<Prenda> listarPrendas() {
    return this.prendas;
  }
}

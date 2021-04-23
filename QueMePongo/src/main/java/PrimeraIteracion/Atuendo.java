package PrimeraIteracion;

import java.util.Collections;
import java.util.List;

public class Atuendo {
  private final List<Prenda> prendas;

  public Atuendo() {
    this.prendas = Collections.emptyList();
  }

  public void agregarPrenda(Prenda nuevaPrenda) {
    if (this.prendas
        .stream()
        .allMatch(prenda -> prenda.combinaCon(nuevaPrenda))
    ) {
      prendas.add(nuevaPrenda);
    } else {
      throw new PrendaNoAgregable("La prenda no combina con el resto del atuendo");
    }
  }
}

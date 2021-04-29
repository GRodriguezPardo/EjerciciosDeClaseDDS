package primeraIteracion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atuendo {
  private final List<Prenda> prendas;

  public Atuendo() {
    this.prendas = new ArrayList<Prenda>();
  }

  public void agregarPrenda(Prenda nuevaPrenda) {
    if (this.prendas
        .stream()
        .allMatch(prenda -> prenda.combinaCon(nuevaPrenda))
    ) {
      prendas.add(nuevaPrenda);
    } else {
      throw new PrendaNoCombinableException();
    }
  }

  public Atuendo clone() {
    Atuendo copia = new Atuendo();
    this.prendas.forEach(prenda -> copia.agregarPrenda(prenda));
    return copia;
  }
}

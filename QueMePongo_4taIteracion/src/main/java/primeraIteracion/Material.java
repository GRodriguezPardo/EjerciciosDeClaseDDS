package primeraIteracion;

import java.util.Arrays;
import java.util.List;

public enum Material {
    CUERO(TipoPrenda.ZAPATO, TipoPrenda.PANTALON),
    LANA(TipoPrenda.PANTALON, TipoPrenda.REMERA),
    JEAN(TipoPrenda.PANTALON, TipoPrenda.GORRA),
    SEDA(TipoPrenda.CAMISA),
    ALGODON(TipoPrenda.PANTALON, TipoPrenda.REMERA, TipoPrenda.CAMISA),
    ACETATO(TipoPrenda.PANTALON);

  private List<TipoPrenda> tiposValidos;

  Material(TipoPrenda ... tipos) {
    this.tiposValidos = Arrays.asList(tipos);
  }

  public Boolean compatibleCon(TipoPrenda tipo) { return tiposValidos.contains(tipo); }
}

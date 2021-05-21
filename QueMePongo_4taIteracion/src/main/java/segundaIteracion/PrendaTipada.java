package segundaIteracion;

import primeraIteracion.Color;
import primeraIteracion.Material;
import primeraIteracion.Prenda;
import primeraIteracion.TipoPrenda;

import java.math.BigDecimal;

public class PrendaTipada {
  private final TipoPrenda tipo;

  public PrendaTipada(TipoPrenda _tipo) {
    this.tipo = _tipo;
  }

  public Prenda finalizarPrenda(Material material,
                                PatronTela patron,
                                Color colorPrincipal,
                                Color colorSecundario, BigDecimal temperaturaMaxima) {
    return new Prenda(this.tipo, material, patron, colorPrincipal, colorSecundario, temperaturaMaxima);
  }
}

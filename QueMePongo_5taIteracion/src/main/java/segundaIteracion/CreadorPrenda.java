package segundaIteracion;

import primeraIteracion.Color;
import primeraIteracion.Material;
import primeraIteracion.Prenda;
import primeraIteracion.TipoPrenda;

import java.math.BigDecimal;

public class CreadorPrenda {
  private static final CreadorPrenda INSTANCE = new CreadorPrenda();
  private PrendaTipada prenda;

  public static CreadorPrenda instance() {
    return INSTANCE;
  }

  public void nuevaPrenda(TipoPrenda tipo) {
    this.prenda = new PrendaTipada(tipo);
  }

  public Prenda finalizarPrenda(Material material,
                                PatronTela patron,
                                Color colorPrincipal,
                                Color colorSecundario,
                                BigDecimal temperaturaMaxima) {
    return prenda.finalizarPrenda(material, patron, colorPrincipal, colorSecundario,temperaturaMaxima);
  }
}

package segundaIteracion;

import primeraIteracion.Color;
import primeraIteracion.Material;
import primeraIteracion.Prenda;
import primeraIteracion.TipoPrenda;

public class PrendaTipada {
  private final TipoPrenda tipo;

  public PrendaTipada(TipoPrenda _tipo){
    this.tipo = _tipo;
  }

  public Prenda finalizarPrenda(Material material,
                                Color colorPrincipal,
                                Color colorSecundario){
    return new Prenda(this.tipo,material,colorPrincipal,colorSecundario);
  }
}

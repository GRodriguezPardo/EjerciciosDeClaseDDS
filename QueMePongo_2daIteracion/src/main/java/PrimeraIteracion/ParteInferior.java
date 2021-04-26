package PrimeraIteracion;

public enum ParteInferior implements TipoPrenda {
  SHORTS, PANTALON, OTRA;

  public CategoriaPrenda categoria() {
    return CategoriaPrenda.PARTEINFERIOR;
  }
}

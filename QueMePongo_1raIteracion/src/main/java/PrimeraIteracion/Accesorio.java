package PrimeraIteracion;

public enum Accesorio implements TipoPrenda {
  GORRA, ANTEOJOS, OTRA;

  public CategoriaPrenda categoria() {
    return CategoriaPrenda.ACCESORIO;
  }
}

package PrimeraIteracion;

public enum Calzado implements TipoPrenda {
  ZAPATOS, ZAPATILLAS, OTRA;

  public CategoriaPrenda categoria() {
    return CategoriaPrenda.CALZADO;
  }
}

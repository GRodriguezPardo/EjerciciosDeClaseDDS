package PrimeraIteracion;

public enum ParteSuperior implements TipoPrenda {
  REMERA, CAMISA, OTRA;
  public CategoriaPrenda categoria(){
    return CategoriaPrenda.PARTESUPERIOR;
  }
}


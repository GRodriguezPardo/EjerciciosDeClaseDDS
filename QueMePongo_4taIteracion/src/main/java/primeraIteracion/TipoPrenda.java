package primeraIteracion;

public enum TipoPrenda {
  GORRA(CategoriaPrenda.ACCESORIO),
  ANTEOJOS(CategoriaPrenda.ACCESORIO),
  REMERA(CategoriaPrenda.PARTESUPERIOR),
  CAMISA(CategoriaPrenda.PARTESUPERIOR),
  SHORTS(CategoriaPrenda.PARTEINFERIOR),
  PANTALON(CategoriaPrenda.PARTEINFERIOR),
  ZAPATO(CategoriaPrenda.CALZADO),
  ZAPATILLAS(CategoriaPrenda.CALZADO);

  private CategoriaPrenda categoria;

  TipoPrenda(CategoriaPrenda _categoria){
    this.categoria = _categoria;
  }

  public CategoriaPrenda getCategoria(){
    return this.categoria;
  }
}
package PrimeraIteracion;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;



public class Prenda {
  private final TipoPrenda tipo;
  private final String material;
  private final String colorPrincipal;
  private final String colorSecundario;

  public Prenda(@NotNull TipoPrenda _tipo,
                @NotNull String _material,
                @NotNull String _colorPrincipal,
                @Nullable String _colorSecundario){
    this.tipo = _tipo;
    this.material = _material;
    this.colorPrincipal = _colorPrincipal;
    this.colorSecundario = _colorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return this.tipo.categoria();
  }
  public Boolean combinaCon(Prenda unaPrenda){
    //TODO
    return Boolean.TRUE; //Hasta saber las condiciones retornamos TRUE siempre
  }
}

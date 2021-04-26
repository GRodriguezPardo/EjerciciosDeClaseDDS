package PrimeraIteracion;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Prenda {
  private final TipoPrenda tipo;
  private final Material material;
  private final Color colorPrincipal;
  private final Color colorSecundario;

  public Prenda(@NotNull TipoPrenda _tipo,
                @NotNull Material _material,
                @NotNull Color _colorPrincipal,
                @Nullable Color _colorSecundario){
    this.tipo = _tipo;
    this.material = _material;
    this.colorPrincipal = _colorPrincipal;
    this.colorSecundario = _colorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return this.tipo.categoria();
  }
  public Boolean combinaCon(Prenda unaPrenda){
    //TODO: Se debe cambiar este return en la proxima iteracion
    return Boolean.TRUE;
  }
}

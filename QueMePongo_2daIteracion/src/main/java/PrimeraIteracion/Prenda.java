package primeraIteracion;

import com.sun.istack.internal.NotNull;
import segundaIteracion.PatronTela;

public class Prenda {
  private final TipoPrenda tipo;
  private final Material material;
  private final PatronTela patron;
  private final Color colorPrincipal;
  private final Color colorSecundario;

  public Prenda(@NotNull TipoPrenda _tipo,
                @NotNull Material _material,
                PatronTela _patron,
                @NotNull Color _colorPrincipal,
                Color _colorSecundario){
    this.tipo = _tipo;
    this.material = _material;
    if(_patron == null){
      this.patron = PatronTela.LISA;
    }else{
      this.patron = _patron;
    }
    this.colorPrincipal = _colorPrincipal;
    this.colorSecundario = _colorSecundario;
  }

  public CategoriaPrenda getCategoria() {
    return this.tipo.getCategoria();
  }
  public Boolean combinaCon(Prenda unaPrenda){
    //TODO: Se debe cambiar este return en la proxima iteracion
    return Boolean.TRUE;
  }
}

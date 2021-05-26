package primeraIteracion;

import org.jetbrains.annotations.NotNull;
import segundaIteracion.MaterialIncompatibleConTipoException;
import segundaIteracion.PatronTela;

import java.math.BigDecimal;

public class Prenda {
  private final TipoPrenda tipo;
  private final Material material;
  private final PatronTela patron;
  private final Color colorPrincipal;
  private final Color colorSecundario;
  private BigDecimal temperaturaMaxima;

  public Prenda(@NotNull TipoPrenda _tipo,
                @NotNull Material _material,
                PatronTela _patron,
                @NotNull Color _colorPrincipal,
                @NotNull Color _colorSecundario, BigDecimal temperaturaMaxima) {
    this.tipo = _tipo;
    if (_material.compatibleCon(this.tipo)) {
      this.material = _material;
    } else {
      throw new MaterialIncompatibleConTipoException(
          "El material "
          + _material
          + " no puede aplicarse a una prenda de tipo "
          + this.tipo);
    }
    if (_patron == null) {
      this.patron = PatronTela.LISA;
    } else {
      this.patron = _patron;
    }
    this.colorPrincipal = _colorPrincipal;
    this.colorSecundario = _colorSecundario;
    this.temperaturaMaxima = temperaturaMaxima;
  }

  public CategoriaPrenda getCategoria() {
    return this.tipo.getCategoria();
  }

  public Boolean combinaCon(Prenda unaPrenda) {
    //TODO: Se debe cambiar este return en la proxima iteracion
    return Boolean.TRUE;
  }

  public Boolean usableEnTemperatura(BigDecimal temperatura) {
    return temperatura.compareTo(this.temperaturaMaxima) <= 0;
  }
}

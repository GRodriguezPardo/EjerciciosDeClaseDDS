package segundaIteracion;

import primeraIteracion.Atuendo;
import primeraIteracion.CategoriaPrenda;
import primeraIteracion.Prenda;

import java.util.List;

public class Uniforme {
  private final String institucion;
  private final Atuendo atuendo;

  public Uniforme(String _institucion,
                  Prenda prendaSuperior,
                  Prenda prendaInferior,
                  Prenda calzado) {
    super();
    this.institucion = _institucion;
    this.atuendo = new Atuendo();
    if( prendaSuperior.getCategoria() != CategoriaPrenda.PARTESUPERIOR
        || prendaInferior.getCategoria() != CategoriaPrenda.PARTEINFERIOR
        || calzado.getCategoria() != CategoriaPrenda.CALZADO){
      throw new ParametrosUniformeIncorrectoException(
          "El segundo parametro debe ser una prenda superior, el tercero una prenda inferior y el cuarto un calzado.");
    }
    atuendo.agregarPrenda(prendaInferior);
    atuendo.agregarPrenda(prendaInferior);
    atuendo.agregarPrenda(calzado);
  }

  public Atuendo verUniforme(){
    return this.atuendo.clone();
  }
}

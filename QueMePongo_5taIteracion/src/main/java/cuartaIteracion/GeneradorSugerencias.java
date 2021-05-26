package cuartaIteracion;

import primeraIteracion.Prenda;

import java.util.List;

public interface GeneradorSugerencias {
  List<Atuendo> generarSugerenciaDesde(List<Prenda> prendasAptas);
}

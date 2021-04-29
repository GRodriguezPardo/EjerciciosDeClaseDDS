package segundaIteracion;

import primeraIteracion.Atuendo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RepositorioUniformes {
  private List<Uniforme> uniformes;
  private static final RepositorioUniformes INSTANCE = new RepositorioUniformes();

  private RepositorioUniformes() {
    this.uniformes = new ArrayList<Uniforme>();
  }

  public static RepositorioUniformes getInstance() {
    return INSTANCE;
  }

  public void nuevoUniforme(Uniforme nuevoUniforme) {
    this.uniformes.add(nuevoUniforme);
  }

  public Atuendo sugerencia() {
    int randomNumber = (new Random()).nextInt(this.uniformes.size());
    return this.uniformes.get(randomNumber).verUniforme();
  }
}

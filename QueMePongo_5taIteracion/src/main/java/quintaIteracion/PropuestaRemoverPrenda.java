package quintaIteracion;

import primeraIteracion.Prenda;

public class PropuestaRemoverPrenda implements Propuesta{
  private Prenda prenda;
  private Usuario sender;
  private String guardarropa;

  public PropuestaRemoverPrenda(Prenda prenda, Usuario sender, String guardarropa) {
    this.prenda = prenda;
    this.sender = sender;
    this.guardarropa = guardarropa;
  }

  @Override
  public void aceptar(Usuario usuario) {
    usuario.removerPrenda(this.guardarropa, this.prenda);
  }

  public void rechazar() {

  }

  @Override
  public void deshacer(Usuario usuario) {
    usuario.agregarPrenda(this.guardarropa, this.prenda);
  }

  public String descripcion() {
    return this.sender.getNombreUsuario()
        + " te sugiere remover una prenda de tu guardarropas "
        + this.guardarropa;
  }
}

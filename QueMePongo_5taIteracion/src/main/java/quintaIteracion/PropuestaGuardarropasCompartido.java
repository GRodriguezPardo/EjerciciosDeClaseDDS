package quintaIteracion;

import cuartaIteracion.Guardarropa;

public class PropuestaGuardarropasCompartido implements Propuesta {
  private String nombre;
  private Guardarropa guardarropa;
  private Usuario sender;

  public PropuestaGuardarropasCompartido(String nombre, Guardarropa guardarropa, Usuario sender) {

    this.nombre = nombre;
    this.guardarropa = guardarropa;
    this.sender = sender;
  }

  @Override
  public void aceptar(Usuario usuario) {
    usuario.crearGuardarropa(nombre, guardarropa);
    sender.crearGuardarropa(nombre, guardarropa);
  }

  @Override
  public void rechazar() {}

  @Override
  public String descripcion() {
    return this.sender.getNombreUsuario()
        + " te invita a crear un guardarropas compartido llamado "
        + this.nombre;
  }

  @Override
  public void deshacer(Usuario usuario) {
    usuario.removerGuardarropa(this.nombre);
    this.sender.removerGuardarropa(nombre);
  }
}

package quintaIteracion;

public interface Propuesta {
  String descripcion();
  void aceptar(Usuario usuario);
  void rechazar();
  void deshacer(Usuario usuario);

}

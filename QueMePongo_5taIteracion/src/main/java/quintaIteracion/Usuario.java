package quintaIteracion;

import cuartaIteracion.Atuendo;
import cuartaIteracion.Guardarropa;
import primeraIteracion.Prenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Usuario {
  private Map<String, Guardarropa> guardarropas;
  private final List<Propuesta> propuestasPendientes;
  private final List<Propuesta> propuestasAceptadas;
  private final String nombreUsuario;

  public Usuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
    this.propuestasPendientes = new ArrayList<>();
    this.propuestasAceptadas = new ArrayList<>();
  }

  public List<Atuendo> generarSugerenciasPara(String ciudad, String guardarropas) {
    return this.guardarropas.get(guardarropas).generarSugerenciasPara(ciudad);
  }

  public void agregarPrenda(String guardarropa, Prenda prenda) {
    this.guardarropas.get(guardarropa).agregarPrenda(prenda);
  }

  public List<Prenda> verPrendasDe(String guardarropa) {
    return this.guardarropas.get(guardarropa).listarPrendas();
  }

  public void crearGuardarropa(String nombre, Guardarropa guardarropa) {
    this.guardarropas.put(nombre, guardarropa);
  }

  public void removerGuardarropa(String nombre) {
    this.guardarropas.remove(nombre);
  }

  public void crearGuardarropasCompartidoCon(String nombre, Guardarropa guardarropa, Usuario usuario) {
    usuario.nuevaPropuesta(new PropuestaGuardarropasCompartido(nombre, guardarropa, this));
  }

  public void sugerirRemoverPrenda(Prenda prenda, Usuario usuario, String guardarropa) {
    usuario.nuevaPropuesta(new PropuestaRemoverPrenda(prenda, this, guardarropa));
  }

  public void removerPrenda(String guardarropa, Prenda prenda) {
    this.guardarropas.get(guardarropa).quitarPrenda(prenda);
  }

  public String getNombreUsuario() {
    return nombreUsuario;
  }

  public void nuevaPropuesta(Propuesta propuesta) {
    this.propuestasPendientes.add(propuesta);
  }

  public List<Propuesta> listaPropuestasPendientes() {
    return this.propuestasPendientes;
  }

  public List<Propuesta> listaPropuestasAceptadas() {
    return this.propuestasAceptadas;
  }

  // true es si, false es no.
  public void resolverPropuesta(Integer posicion, Boolean decision) {
    Propuesta propuesta = this.propuestasPendientes.get(posicion);
    if(decision) {
      propuesta.aceptar(this);
      this.propuestasAceptadas.add(propuesta);
    } else {
      propuesta.rechazar();
    }
    this.propuestasPendientes.remove(propuesta);
  }

  public String leerPropuesta (Integer posicion) {
    return this.propuestasPendientes.get(posicion).descripcion();
  }

  public void deshacerPropuesta(Integer posicion) {
    this.propuestasAceptadas.get(posicion).deshacer(this);
  }
}

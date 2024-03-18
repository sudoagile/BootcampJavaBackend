package herencia;
public class Profesor extends Persona {
  private int ranking;
  public Profesor(String nombre, String apellido, String email, int ranking)
  {
    super(nombre, apellido, email);
    this.ranking = ranking;

  }
}




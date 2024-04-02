import java.util.List;
public class Gerente extends Empleado implements EvaluacionDesempeno {
    private List<Empleado> equipo;

    public Gerente(int id, String nombre, String departamento, double salario, List<Empleado> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Empleados a cargo: ");
        for (Empleado empleado : equipo) {
            System.out.println("- " + empleado.nombre);
        }
    }

    @Override
    public double calcularBono() {
        return salario * (equipo.size() > 5 ? 1.0 : 0.5);
    }

    @Override
    public String evaluarDesempeno() {
        return (equipo.size() > 5 ? "Excelente desempeño" : "Buen desempeño");
    }
}

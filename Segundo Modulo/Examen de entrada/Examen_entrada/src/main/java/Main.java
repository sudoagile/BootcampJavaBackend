import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Crear Desarrolladores
        List<String> lenguajesDesarrollador1 = new ArrayList<>();
        lenguajesDesarrollador1.add("Java");
        lenguajesDesarrollador1.add("Python");
        lenguajesDesarrollador1.add("JavaScript");
        Empleado desarrollador1 = new Desarrollador(1, "Juan", "Desarrollo", 50000, lenguajesDesarrollador1);

        List<String> lenguajesDesarrollador2 = new ArrayList<>();
        lenguajesDesarrollador2.add("C#");
        lenguajesDesarrollador2.add("JavaScript");
        Empleado desarrollador2 = new Desarrollador(2, "Maria", "Desarrollo", 60000, lenguajesDesarrollador2);

        // Crear Gerente
        List<Empleado> equipoGerente = new ArrayList<>();
        equipoGerente.add(desarrollador1);
        equipoGerente.add(desarrollador2);
        Empleado gerente = new Gerente(3, "Pedro", "Gerencia", 80000, equipoGerente);

        // Añadir empleados a la lista
        empleados.add(desarrollador1);
        empleados.add(desarrollador2);
        empleados.add(gerente);

        // Iterar sobre la lista y mostrar detalles
        for (Empleado empleado : empleados) {
            empleado.mostrarDetalles();
            System.out.println("Bono: " + empleado.calcularBono());
            if (empleado instanceof EvaluacionDesempeno) {
                EvaluacionDesempeno evaluacion = (EvaluacionDesempeno) empleado;
                System.out.println("Evaluación del desempeño: " + evaluacion.evaluarDesempeno());
            }
            System.out.println("-------------------------");
        }
    }
}

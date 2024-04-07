package ejercicio3;

import ejercicio2.Computer;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Computer> listaComputadoras = new ArrayList<>();

        ComputerStore computerStore1 = new ComputerStore(
                listaComputadoras,
                "TecnoStore",
                "Calama");
        System.out.println("===============================================");
        System.out.println(computerStore1.getSizeListComputer());

        //ComputerStore computerStore2 = new ComputerStore()

        Computer computer1 = new Computer(
                "DELL",
                "Oplex",
                8,
                512);

        Computer computer2 = new Computer(
                "HP",
                "N200",
                16,
                1024);
        Computer computer3 = new Computer(
                "Huaweii",
                "Tr4",
                32,
                512);
        //Agregando computadora a la tienda

        computerStore1.addComputer(computer1);
        computerStore1.addComputer(computer2);
        computerStore1.addComputer(computer3);
        System.out.println(computerStore1.getSizeListComputer());

        computerStore1.printInfoComputers();

        computerStore1.filterRam(12);

    }
}

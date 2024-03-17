package ejercicio3;

import ejercicio2.Computer;

import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Computer> arrayComputers;
    private String name;
    private String address;

    public ComputerStore(ArrayList<Computer> arrayComputers, String name, String address)
    {
        this.arrayComputers = arrayComputers;
        this.name = name;
        this.address = address;
    }

    public void printInfo()
    {
        System.out.println("Name: " +name);
        System.out.println("Address: " + address);
    }

    public void addComputer(Computer computerAdd){

        arrayComputers.add(computerAdd);

    }

    public int getSizeListComputer()
    {
        return arrayComputers.size();
    }

}

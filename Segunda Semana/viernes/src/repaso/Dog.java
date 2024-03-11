package repaso;

public class Dog {
    private String breed;
    private int age;
    private String color;


    Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
    Dog()
    {

    }

    void saludar()
    {
        System.out.println("Hola soy un perro de raza "+ breed);
    }

    String getBreed(){
        return breed;
    };
    String getColor(){
        return color;
    }
    int getAge(){
        return age;
    }

}

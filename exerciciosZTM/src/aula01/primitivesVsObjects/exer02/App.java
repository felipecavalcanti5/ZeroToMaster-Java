package aula01.primitivesVsObjects.exer02;

public class App {
    public static void main(String[] args) {
        Person persone = new Person();
        Car voiture = new Car();

        persone.name = "Felipe";

        voiture.model = "Honda Fit";
        voiture.owner = persone;


        System.out.println("Car's model = " + voiture.model);
        System.out.println("Owner's name = " + voiture.owner.name);



    }
}

/*
class Person {
    String name;
}
class Car {
    String model;
    Person owner;
}
*/


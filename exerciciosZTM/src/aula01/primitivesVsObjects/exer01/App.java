package aula01.primitivesVsObjects.exer01;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Felipe";
        person.age = 30;

        System.out.println("Hi! my name is " + person.name + " and i'm " + person.age + " years old");
    }
}



package aula01.primitivesVsObjects.exer05;

public class Main {
    public static void main(String[] args) {
        Person persone = new Person();
        persone.name = "Felipe";
        persone.age = 30;

        System.out.println(persone.name + ", " + persone.age);
        modifyPerson(persone);
        System.out.println(persone.name + ", " + persone.age);


    }
    public static void modifyPerson(Person person){
        person.name = "Roberto";
        person.age = 45;
    }

}

/*
* Explanation:
We can see that the values of the Person object changed after modifying them
* in the modifyPerson method. This is because Java uses pass-by-value for objects
* as well, but the value being passed is the reference to the object,
* not the object itself. Thus, any changes made to the object's fields within
* the method will persist outside the method.*/

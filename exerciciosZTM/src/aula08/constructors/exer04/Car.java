package aula08.constructors.exer04;

public class Car extends Vehicle{
    private String model;
    public Car(String brand, String model){
        super(brand);
        this.model = model;
    }
}

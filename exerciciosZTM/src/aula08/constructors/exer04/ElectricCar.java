package aula08.constructors.exer04;

public class ElectricCar extends Car{
    private int BatteryCapacity;
    public ElectricCar(String brand, String model, int BatteryCapacity){
        super(brand, model);
        this.BatteryCapacity = BatteryCapacity;

    }
}

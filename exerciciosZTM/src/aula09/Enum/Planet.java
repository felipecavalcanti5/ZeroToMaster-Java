package aula09.Enum;

public enum Planet {
    EARTH("Earth", 1.0),
    MARS("Mars", 1.52);
    private String name;
    private double distanceFromSun;

    public String getName(){
        return name;
    }
    public double getDistanceFromSun(){
        return distanceFromSun;
    }

    Planet(String name, double distanceFromSun) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }
}



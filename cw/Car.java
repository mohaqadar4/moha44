class Car extends Entity {
    private int speed;
    private int fuelLevel;
    public Car(String name, int id, int speed, int fuelLevel) {
        super(name, id);
        this.speed = speed;
        this.fuelLevel = fuelLevel;
    }
    public void performOperation() {
        fuelLevel -= speed / 10;
        System.out.println("Driving " + name + " at " + speed + " km/h. Fuel level: " + fuelLevel);
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
}

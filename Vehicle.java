abstract public class Vehicle {
    Integer speed;
    Float weight;

    public Vehicle(Integer speed, float weight) {
        this.speed = speed;
        this.weight = weight;
    }

    public void startEngine() {
        System.out.println("Gentle man start your engine.");
    }

    public void killEngine() {
        System.out.println("Stop!");
    }
}

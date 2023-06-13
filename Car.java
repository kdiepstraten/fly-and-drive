public class Car extends Vehicle implements Driveable{

    public Car(Integer speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("Faster!");
    }

    @Override
    public void brake() {
        System.out.println("Stop!!");
    }

    @Override
    public void changeGear() {
        System.out.println("Next gear");
    }
}

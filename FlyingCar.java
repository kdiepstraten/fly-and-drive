public class FlyingCar extends Vehicle implements Flyable, Driveable{
    public FlyingCar(Integer speed, float weight) {
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

    @Override
    public void takeOff() {
        System.out.println("Get ready for take off!");
    }

    @Override
    public void land() {
        System.out.println("Hold on. Fasten your seatbelt!");
    }

    @Override
    public void changeAltitude() {
        System.out.println("We experience some turbulence because we are going down!");
    }
}

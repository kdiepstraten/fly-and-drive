public class Plane extends Vehicle implements Flyable{
    public Plane(Integer speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void takeOff() {
        System.out.println("Get ready for take off!");
    }

    @Override
    public void land() {
        System.out.println("Hold on. Fasten your seatbelt! And landed.");
    }

    @Override
    public void changeAltitude() {
        System.out.println("We experience some turbulence because we are going down!");
    }
}

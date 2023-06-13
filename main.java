public class main {

    public static void main(String[] args) {
    Car car = new Car(200, 1200);
    Plane plane = new Plane(2, 20000);
    FlyingCar flyingCar = new FlyingCar(4, 3400);

    car.startEngine();
    car.accelerate();
    car.brake();

    plane.takeOff();
    plane.changeAltitude();
    plane.land();

    flyingCar.startEngine();
    flyingCar.accelerate();
    flyingCar.changeGear();
    flyingCar.brake();
    flyingCar.killEngine();


    }
}

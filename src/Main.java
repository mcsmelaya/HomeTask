import com.sun.jdi.connect.Transport;

import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter the transport type (car, plane, train, ship) or exit: ");
            String userInput = scanner.nextLine();

            if (Objects.equals(userInput, Transport_type.CAR.getTitle())) {
                Car car = new Car(userInput);
                car.move();
                Car.Engine engine = car.new Engine();
                Car.Fuel fuel = car.new Fuel();
                engine.info();
                fuel.info();
            }

            if (Objects.equals(userInput, Transport_type.PLANE.getTitle())) {
                Plane plane = new Plane(userInput);
                plane.move();
                Plane.Engine engine = plane.new Engine();
                Plane.Fuel fuel = plane.new Fuel();
                engine.info();
                fuel.info();
            }

            if (Objects.equals(userInput, Transport_type.SHIP.getTitle())) {
                Ship ship = new Ship(userInput);
                ship.move();
                Ship.Engine engine = ship.new Engine();
                Ship.Fuel fuel = ship.new Fuel();
                engine.info();
                fuel.info();
            }

            if (Objects.equals(userInput, Transport_type.TRAIN.getTitle())) {
                Train train = new Train(userInput);
                train.move();
                Train.Engine engine = train.new Engine();
                Train.Fuel fuel = train.new Fuel();
                engine.info();
                fuel.info();
            }
            if(Objects.equals(userInput, "exit")) {
                break;
            }
        }
    }
}
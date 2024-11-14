final class Car extends Vehicle{

    public Car(String type) {
        super(type);
    }

    @Override
    public void move() {
        System.out.println("The " + this.type + " is moving along the road");
    }

    public class Engine {
        public void info(){
            System.out.println("1.5 piston internal combustion engine");
        }
    }

    public class Fuel {
        public void info() {
            System.out.println("The fuel is petrol");
        }
    }
}

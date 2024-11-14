final public class Plane extends Vehicle{
    public Plane(String type) {
        super(type);
    }

    @Override
    public void move(){
        System.out.println("The " + this.type + " is flying");
    }

    public class Engine {
        public void info(){
            System.out.println("Ramjet engine");
        }
    }

    public class Fuel {
        public void info() {
            System.out.println("The fuel is aviation kerosene");
        }
    }
}

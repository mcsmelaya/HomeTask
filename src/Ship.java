final public class Ship extends Vehicle{
    public Ship(String type) {
        super(type);
    }

    @Override
    public void move(){
        System.out.println("The" + this.type + " is sailing");
    }

    public class Engine {
        public void info(){
            System.out.println("Internal combustion engine");
        }
    }

    public class Fuel {
        public void info() {
            System.out.println("The fuel is Marine Diesel Oil");
        }
    }
}

final public class Train extends Vehicle{
    public Train(String type) {
        super(type);
    }

    @Override
    public void move(){
        System.out.println("The " + this.type + " is moving along the rails");
    }

    public class Engine {
        public void info(){
            System.out.println("Internal combustion engine");
        }
    }

    public class Fuel {
        public void info() {
            System.out.println("The fuel is diesel");
        }
    }
}

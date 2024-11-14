public sealed abstract class Vehicle permits Car, Plane, Train, Ship{
    protected String type;

    public Vehicle(String type) {
        this.type = type;
    }

//    public void display() {
//        System.out.println("The vehicle is " + this.type);
//    }

    public abstract void move();
}

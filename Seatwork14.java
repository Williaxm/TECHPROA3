public class Seatwork14 {
    public static void main(String args[]) {
        
        //my motocycle is unique
        
        Motorcycle m = new Motorcycle();
        m.make = "Yamaha MT-09";
        m.color = "Racing Blue";
        System.out.println("Ignition check...");
        m.showAtts();
        System.out.println("...........");
        System.out.println("Starting the motorcycle...");
        m.startEngine();
        System.out.println("..........");
        System.out.println("Checking current status...");
        m.showAtts();
        System.out.println("..........");
        System.out.println("Twisting the throttle...");
        m.startEngine();
    }
}

class Motorcycle {
    String make;
    String color;
    boolean engineState = false;

    void startEngine() {
        if (engineState) {
            System.out.println("Full throttle ");
        } else {
            engineState = true;
            System.out.println("Engine started.");
        }
    }

    void showAtts() {
        System.out.println("Motorcycle make: " + make);
        System.out.println("Motorcycle color: " + color);
        System.out.println("Engine state: " + (engineState ? "Running" : "Stopped"));
    }
}

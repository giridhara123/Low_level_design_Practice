package inheritance;

public class Car extends Vehicle {
    private Engine engine;
    private Transmission transmission;

    public Car(String name, String model , Engine engine, Transmission transmission) {
        super(name, model);
        this.engine = engine;
        this.transmission = transmission;
    }

    public void start()
    {
        System.out.println( name + " "+ model+ " "+ " -> starting");
        engine.start();
        transmission.shiftTO("D");

    }
    public void stop()
    {
       System.out.println( name + " "+ model+ " "+ " -> stopping");
        engine.stop();
        transmission.shiftTO("P");
    }




}

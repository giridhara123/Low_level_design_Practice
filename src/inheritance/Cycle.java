import inheritance.Vehicle;

public class Cycle  extends Vehicle {

    public Cycle(String name, String model)
    {
        super(name, model);
    }

    public void start()
    {
        System.out.println("Cycle start");
    }

    public void stop()
    {
        System.out.println("Cycle stop");
    }

}

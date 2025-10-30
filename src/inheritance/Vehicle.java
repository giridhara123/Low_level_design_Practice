package inheritance;

public  abstract class Vehicle {
    protected String name;
    protected String model;

    public abstract void start();
    public abstract void stop();

    public Vehicle(String name, String model) {
        this.name = name;
        this.model = model;
    }
}
//Car c= new Car("benz","2025", new Engine(), new Transmission());
// c.start();
// c.stop();

// Cycle  cy = new Cycle("gaint","new");
// cy.start();
//cy.stop();
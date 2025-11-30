package XParkingLot;

public class Vehicle {
    private final String plateNumber;
    private final VehicleType type;

    protected Vehicle(String plateNumber, VehicleType type) {
        this.plateNumber = plateNumber;
        this.type = type;

    }

    public String getPlateNumber()
    {
        return plateNumber;
    }
    public VehicleType getType()
    {
        return type;
    }

}
// Vehicle cars = new Car1("Ap1205");
// System.out.println(cars.getPlateNumber());
// System.out.println(cars.getType());

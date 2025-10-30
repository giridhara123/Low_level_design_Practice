public class car {
    //Instance variable
    //encapsulation.
    private String brand;
    private String model;
    private int year;

    //Constructor
    public car(String brand, String model, int year)
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    //Methods
    public String getInfo(){
        return year + " " + brand + " " + model;
    }

    public void startengine()
    {
        System.out.println("new car");
    }
}
// creating objects
//car mycar = new car("maruthi","800",1990);
//car anothercar = new car("Honda","civic",2000);

//using object to call methods;
//  mycar.startengine();
//  System.out.println(mycar.getInfo());
// System.out.println(anothercar.getInfo());

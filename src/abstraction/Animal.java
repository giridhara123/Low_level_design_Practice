public abstract class Animal {
    protected String name;
    protected int age;

    //constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void fetch();
    public abstract void makeNoise();
    public void eat()
    {
        System.out.println("Eating...");
    };
}

//  Animal a = new Dog( "lab",7);
// a.makeNoise();
//a.eat();
//a.fetch();

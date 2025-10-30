public class Rectangle {
    private double len;
    private double brd;

    public Rectangle(double len, double brd) {
        this.len = len;
        this.brd = brd;
    }

    public double getArea()
    {
        return len*brd;
    }

    public double getPerimeter()
    {
        return len*2;
    }
}

public class Box {
    double width;
    double length;


    Box(double width)
    {
        this.width = width;
        this.length = width;

    }
    Box(double width, double length)
    {
        this.width = width;
        this.length = length;


    }

    public Box() {
        width=1d;
        length=1d;
    }

    double area() { return width * length; }
}


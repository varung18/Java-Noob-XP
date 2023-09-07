// Example of static variable, Practical 11


public class Circle {

    static int circleCount = 0;
    public double x, y, r;
    public double circumference () {
        return 2*3.14159*r;
    }
    public double area () {
        return (22/7)*r*r;
    }
    public Circle (double x, double y, double r) {
        this.x = x; this.y = y; this.r = r;
    } 
    public Circle (double r) {
        this (0.0, 0.0, r); 
        circleCount++;
    }

    public Circle (Circle c) {
        this(c.x, c.y, c.r);
        circleCount++;
    }

    public Circle () {
        this(0.0, 0.0, 1.0);
        circleCount++; 
    }
    public static void main (String args[])
    {
        Circle c1 = new Circle( 2.7, 5.3, 6.9);
        System.out.println ("c1#" + c1.circleCount);

        Circle c2 = new Circle (6.4);
        System.out.println ("c2#" + c2.circleCount);


        Circle c3 = new Circle(c2);
        System.out.println ("c3#" + c3.circleCount);

}
}


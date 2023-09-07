//Example of static method
// A class method and instance method
// Prac12

public class Circle1 {
    static int circleCount = 0;
    public double x, y, r;
    public double circumference () {
        return 2*3.14159*r;
    }
    public double area () {
        return (22/7)*r*r;
    }
    public Circle1 (double x, double y, double r) {
        this.x = x; this.y = y; this.r = r;
    } 
    public Circle1 (double r) {
        this (0.0, 0.0, r); 
        circleCount++;
    }

    public Circle1 (Circle c) {
        this(c.x, c.y, c.r);
        circleCount++;
    }

    public Circle1 () {
        this(0.0, 0.0, 1.0);
        circleCount++; 
    }

    // An instance method: Return the bigger of two circles.
    public Circle1 bigger (Circle1 c) {
        if (c.r> r) return c;
        else return this;
    }

    //A class method : Return the bigger of two classes.
    public static Circle1 bigger (Circle1 a, Circle1 b)
    {
        if (a.r >b.r) return a;
        else return b;
    }

    public static void main (String args[])
    {
        Circle1 a = new Circle1 (6.4);
        Circle1 b = new Circle1 (4.6);
        Circle1 c = a.bigger (b);
        Circle1 d = Circle1.bigger (a, b);

}
}
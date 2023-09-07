// Program that declares two objects of the Circle Class, identical in class, but different in parameters and characteristics
class Circle {
    double x, y;
    double r;
    double circumference () {
        return 2*3.14159*r;
    }
    double area () {
        return (22/7)*r*r;
    }
}

// Follwing class declares multiple types of circle.
public class prac2 {
    public static void main (String args[])
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        // initializing the circles
        c1.x = 3.0;
        c1.y = 4.0;
        c1.r = 5.0;
        c2.x = 4.0;
        c2.y = 8.0;
        c2.r = 10.0;
        System.out.println ("The circumference of the Circle 1 is: "+ c1.circumference());
        System.out.println ("The Area of the Circle 1 is: "+ c1.area());
        System.out.println ("The circumference of the Circle 2 is: "+ c2.circumference());
        System.out.println ("The Area of the Circle 2 is: "+ c2.area());
    }
}

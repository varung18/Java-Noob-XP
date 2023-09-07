// Program that declares two objects of the Circle Class, identical in class, but different in parameters and characteristics
// This program shows the meaning of constructor.
class Circle {
    double x, y;
    double r;
    double circumference () {
        return 2*3.14159*r;
    }
    double area () {
        return (22/7)*r*r;
    }
    Circle (double a, double  b, double c) {
        x = a;
        y = b;
        r = c;
    } // Look at the method Circle. Its the same name as the class.
    // So when conditions are said such that the name of the class and method are same,
    // but performing different tasks, then it is said to be constructor.
}

// Follwing class declares multiple types of circle.
public class prac6 {
    public static void main (String args[])
    {
        Circle c1 = new Circle( 2.7, 5.3, 6.9);
        Circle c2 = new Circle (3.4, 4.8, 7.0);
        // initializing the circles
        
        System.out.println ("The circumference of the Circle 1 is: "+ c1.circumference());
        System.out.println ("The Area of the Circle 1 is: "+ c1.area());
        System.out.println ("The circumference of the Circle 2 is: "+ c2.circumference());
        System.out.println ("The Area of the Circle 2 is: "+ c2.area());
    }
}

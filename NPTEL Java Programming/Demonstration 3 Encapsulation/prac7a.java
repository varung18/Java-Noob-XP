// This practical shows Constructor Overloading.
class Circle {
    double x, y;
    double r;
    double circumference () {
        return 2*3.14159*r;
    }
    double area () {
        return (22/7)*r*r;
    }
    Circle (double x, double y, double r) {
        this.x = x; this.y = y; this.r = r;
    } // Look at the method Circle. Its the same name as the class.
    // So when conditions are said such that the name of the class and method are same,
    // but performing different tasks, then it is said to be constructor.
    Circle (double r) {
        x = 0; y = 0; this.r = r; // Now look at this constructor. It sets the coordinates of the by default to 0,0
        // but wants the input from the user only.
    }

    Circle (Circle c) {
        x = c.x; y = c.y; r = c.r; // Now look at this constructor. It simply copies the constructor which is alrwady made.
    }

    Circle () {
        x = 0.0; y = 0.0; r = 1.0; // This constructor simply turns for default.
    }


}

public class prac7a {
    public static void main (String args[])
    {
        Circle c1 = new Circle( 2.7, 5.3, 6.9);
        Circle c2 = new Circle (6.4);
        Circle c3 = new Circle(c2);
        Circle c4 = new Circle();
        // initializing the circles
        
        System.out.println ("The circumference of the Circle 1 is: "+ c1.circumference());
        System.out.println ("The Area of the Circle 1 is: "+ c1.area());
        System.out.println ("The circumference of the Circle 2 is: "+ c2.circumference());
        System.out.println ("The Area of the Circle 2 is: "+ c2.area());
        System.out.println ("The circumference of the Circle 3 is: "+ c3.circumference());
        System.out.println ("The Area of the Circle 3 is: "+ c3.area());
        System.out.println ("The circumference of the Circle 4 is: "+ c4.circumference());
        System.out.println ("The Area of the Circle 4 is: "+ c4.area());
    }
}

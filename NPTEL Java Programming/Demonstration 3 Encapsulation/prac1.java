//A program that defines the concept of Encapsulation with the help of defining the circle.
class Circle {
    // Now encapsulaton of class as ideally and basically two parts:
    // The first is the variables, which deifne the data types. Like as below, I had defined the variables x, y and r.
    double x, y; // Defines the coordinates of the center.
    double r; //Same for the radius as well.

    // The second part is methods, where one can operate the data or manipulate using operations, calculatios and so on.
    // So here I am defining the circumference for a determined circle.
    double circumference () {
        return 2*3.14159*r;
    }

    // Method that determines the area.
    double area () {
        return 3.14159*r*r;
    }
}

// The following class declares an object of type circle

class prac1 {
    public static void main (String args[]) {
        Circle c = new Circle();
        c.x = 2.00;
        c.y = 6.00;
        c.r = 3.8;
        System.out.println("The Circumference of the circle is " + c.circumference());
        System.out.println("The Area of the circle is " + c.area());
    }
}
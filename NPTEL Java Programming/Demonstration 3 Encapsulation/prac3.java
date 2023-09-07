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

class box {
    double length;
    double width;
    double height;
    double area () {
        return (length*width + width*height + height*length)*2;
    }
    double vol () {
        return length*width*height;
    }
}

// Declaring objects of the type Circles and the box;
public class prac3 {
    public static void main (String args[]) {
        box bombay = new box();
        Circle chennai = new Circle();
        chennai.x = 24.0; chennai.y = 2.0; chennai.r = 8.0;
        bombay.length = 6.0; bombay.width = 16.0; bombay.height = 20.0;
        System.out.println("The Circumference of the Circle is: "+ chennai.circumference());
        System.out.println("The Area of the Circle is: "+ chennai.area());
        System.out.println("The Total area of the Cuboid is: "+ bombay.area());
        System.out.println("The Volume of the Cuboid is: "+ bombay.vol ());

    }
}

// Encapsulation: Defining a class with a method

class Point1 {
    int x, y;
    void SetPoint (int a, int b) {
        x = a;
        y = b;
    }
}

//Above is the definition of the class we want to use. Following is the defnition of the
// main class

public class prac5a {
    public static void main (String args[]) {
        Point1 hello = new Point1();
        hello.SetPoint( 14 , 32 ); // by calling this function, it initializes or sets the value of x and y as
        // per default for the object "Hello"
        // unless we dont define any other values for x and y, the values would remain as we called firstly.
        System.out.println ("x = "+ hello.x);
        System.out.println ("y = "+ hello.y);
    }
}

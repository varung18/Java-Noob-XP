// Encapsulation: Defining a class with a method

class Point1 {
    int x, y;
    void SetPoint () {
        x = 12;
        y = 26;
    }
}

//Above is the definition of the class we want to use. Following is the defnition of the
// main class

public class prac5 {
    public static void main (String args[]) {
        Point1 hello = new Point1();
        hello.SetPoint(); // by calling this function, it initializes or sets the value of x and y as
        // per default for the object "Hello"
        // unless we dont define any other values for x and y, the values would remain by default.
        System.out.println ("x = "+ hello.x);
        System.out.println ("y = "+ hello.y);
    }
}

// Accessing a package from a Java built-in APIs

import java.lang.*;

class Calculator {
    double i;
    double x;
    void p() {
        x = Math.sqrt (i); //here, we dont need to
        // define the objects since its already been imported 
        // from java.lang
    }
}

class prac1 {
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.i = 20.0;
        a.p();
        System.out.println("Square root of " + a.i + " is " + a.x);
    }
}
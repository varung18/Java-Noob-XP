/* Inheritance example: Initializing through constructor */

class Box1 {
    double width;
    double length;
    double height;

    Box1 () {      // Default setting by this constructor
        width = length = height = 0.0;
    } 

    Box1 (double w, double l, double h) {
        width = w;
        length = l;
        height = h;
    }

    double volume () {   // compute and return volume
        return width*length*height;
    }
}

// Here, box is extended to include weight
class Boxweight1 extends Box1 {
    double weight;  // weight of the box

    // Constructor for the boxweight
    Boxweight1 () {
        super();
        weight = 0.0;
    }

    // constructor of the Boxweight
    Boxweight1 (double w, double l, double h, double m) {
        super (w, l, h);
        weight = m;
    }
}

public class prac2a {
    public static void main (String args[]) {
        Box1 mybox1 = new Box1();
        Boxweight mybox2 = new Boxweight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: " + vol);
        System.out.println(); 

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: " + vol);
        System.out.println("Weight of mybox2 is: " + mybox2.weight);
    }
}

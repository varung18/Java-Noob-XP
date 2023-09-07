/* Inheritance example: Initializing through constructor */

class Box {
    double width;
    double length;
    double height;

    Box () {      // Default setting by this constructor
        width = length = height = 0.0;
    } 

    Box (double w, double l, double h) {
        width = w;
        length = l;
        height = h;
    }

    double volume () {   // compute and return volume
        return width*length*height;
    }
}

// Here, box is extended to include weight
class Boxweight extends Box {
    double weight;  // weight of the box

    // constructor of the Boxweight
    Boxweight (double w, double l, double h, double m) {
        width = w;
        length = l;
        height = h;
        weight = m;
    }
}

public class prac2 {
    public static void main (String args[]) {
        Box mybox1 = new Box();
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

/* Example of a multilevel inheritance*/

// Start with box

class Box {
    private double width;
    private double length;
    private double height;

    // constructor when used all dimensions specified
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
        super (w, l, h);
        weight = m;
    }
}

// Add shipping costs
class Shipment extends Boxweight {
    double cost;

    // Constructor when all dimensions are specified
    Shipment (double w, double l, double h, double m, double c) {
        super (w, l, h, m); // calling the superclass constructor
        cost = c;
    }

}

public class prac6 {
    public static void main (String args[]) {
        Shipment shipment1 = new Shipment(13, 17, 8, 29, 3.14);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.56, 1.51);
        double vol;
        vol = shipment1.volume();
        System.out.println("Volume of the shipment 1 is: " + vol);
        System.out.println("Weight of the shipment 1 is: " + shipment1.weight);
        System.out.println("Shipping cost: $"  + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of the shipment 2 is: " + vol);
        System.out.println("Weight of the shipment 2 is: " + shipment2.weight);
        System.out.println("Shipping cost: $"  + shipment2.cost);
    }
    

}

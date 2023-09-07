/* Example of a superclass variable referring to a subclass Object*/

class Box {
    double width;
    double length;
    double height;

    Box () {      // Default setting by this constructor
    } 

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
        width = w;
        length = l;
        height = h;
        weight = m;
    }
}

public class prac3 {
    public static void main (String args[]) {
        Boxweight weightbox = new Boxweight(3, 5, 7, 0.084);
        Box plainbox  = new Box();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is: " + vol);
        System.out.println("Weight of weightbox is: " + weightbox.weight);
        System.out.println(); 

        // assigning Boxweight reference to Box reference
        plainbox = weightbox;
        vol = plainbox.volume(); // volume is now defined in plainbox even not defining in Box class
        System.out.println("Volume of mybox2 is: " + vol);
        // The following statement throws an error since plainbox does not define a weight member.
        //System.out.println ("Weight of the plainbox is: " + plainbox.weight);
    }
    

}

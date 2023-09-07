import myInterface.*;

public class prac13 {

    public static void main(String[] args) {
        //use the above class definition
        Geometry [] geoObejcts = new Geometry [3];
        // create an array to hold Geometry objects
        geoObejcts [0] = new Circle(5.9);
        geoObejcts [1] = new Ellipse(8.3, 1.9);
        geoObejcts [2] = new Rectangle(21.9, 18.3);

        double totalArea = 0;

        for (int i = 0; i<3; i++) {
            totalArea = totalArea + geoObejcts[i].area();
        }
        System.out.println("Total area of the geo-obejcts is " + totalArea);
    }
}

import myInterface.*;

public class prac12 {
    static void display (float x, float y) {
        System.out.println("Area - " + x + "Perimeter = " + y);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.9f);
        Ellipse e = new Ellipse(8.3f, 1.9f);
        Recatangle r = new Recatangle(21.9f, 18.3f);
        GeoAnalyzer geoItem;
        geoItem = c;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(), geoItem.perimeter());
    }
}

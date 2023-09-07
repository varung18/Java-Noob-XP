package myInterface;

public class Circle implements GeoAnalyzer {
    float radius;
    public Circle(float r) {
        radius = r;
    }

    public float area () {
        return (pi*radius*radius);
}
    public float perimeter () {
        return (2*pi*radius);
    }
}

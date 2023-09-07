package myInterface;

public class Ellipse implements GeoAnalyzer {
    float major;
    float minor;

    public Ellipse (float m, float n) {
        major = m;
        minor = n;
    }

    public float area () {
        return (pi*major*minor);
    }
    public float perimeter () {
        return (pi*(major + minor));
    }
}

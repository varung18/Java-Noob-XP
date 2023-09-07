package myInterface;

public class Recatangle implements GeoAnalyzer {
    float length;
    float width;

    public Recatangle (float l, float w) {
        length = l;
        width = w;
    }
    public float area () {
        return (length*width);
    }

    public float perimeter () {
        return (2*(length+width));
    }
}

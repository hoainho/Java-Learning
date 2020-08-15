package MyPackage.Shape;
public class Circle {
    double r;
    public Circle(double rr)
    {
        r = rr;
    }
    public double Circumference(){
        return 2*Math.PI*r;
    }
    public double Area(){
        return Math.PI* r * r;
    }
}

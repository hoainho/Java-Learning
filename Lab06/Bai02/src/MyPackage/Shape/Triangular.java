package MyPackage.Shape;

public class Triangular {
    double cd , cc;
    public Triangular(double canhday , double chieucao){
        cd =canhday;
        cc = chieucao;
    }
    public double Area(){
        return (cd * cc ) / 2;
    }
}

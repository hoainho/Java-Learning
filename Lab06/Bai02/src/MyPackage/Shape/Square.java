package MyPackage.Shape;

public class Square {
        double sq;
        public Square(double square)
        {
            sq = square;
        }
        public double Perimeter(){
            return sq * 4;
        }
        public double Area(){
            return sq * sq;
        }
}

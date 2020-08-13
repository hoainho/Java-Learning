import java.util.Scanner;

public class HINH {
    protected double pi = 3.14;
    Scanner sc = new Scanner(System.in);
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    public HINH(){
        pi = 0;
    }
    public HINH(double pi){
        this.pi = pi;
    }
    public void output(){
        System.out.println("\t\t\t[+] Pi : " + pi);
    }

//    interface public void dientich();
}

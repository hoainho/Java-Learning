import java.util.Scanner;

public class HINHVUONG {
    Scanner sc = new Scanner(System.in);
    private double canh;
    public double getPi() {
        return canh;
    }

    public void setPi(double pi) {
        this.canh = pi;
    }
    public HINHVUONG(){
        canh = 0;
    }
    public HINHVUONG(double pi){
        this.canh = pi;
    }
    public void input(){
        System.out.println("Nhap Pi : ");
        canh = sc.nextDouble();
    }
    public void output(){
        System.out.println("\t\t\t[+] Pi : " + canh);
    }
}

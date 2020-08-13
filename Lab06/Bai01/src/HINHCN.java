import java.util.Scanner;

public class HINHCN {
    Scanner sc = new Scanner(System.in);
    private double dai,rong;
    public double getDai() {
        return dai;
    }

    public double getRong() {
        return rong;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public HINHCN(){
        dai = 0;
        rong= 0;
    }
    public HINHCN(double dai,double rong){
        this.dai = dai;
        this.rong = rong;
    }
    public void input(){
        System.out.println("Nhap do dai : ");
        dai = sc.nextDouble();
        System.out.println("Nhap do rong : ");
        rong = sc.nextDouble();
    }
    public void output(){
        System.out.println("\t\t\t[+] Canh dai : " + dai);
        System.out.println("\t\t\t[+] Canh rong : " + rong);
    }
}


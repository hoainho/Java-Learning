import java.util.Scanner;

public class HINHCN implements HINH{
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
    @Override
    public void input(){
        System.out.print("\t\t\t[-] Nhập Độ Dài Hình Chữ Nhật : ");
        dai = sc.nextDouble();
        System.out.print("\t\t\t[-] Nhập Độ Rộng Hình Chữ Nhật : ");
        rong = sc.nextDouble();
    }
    @Override
    public void output(){
        System.out.println("\n\t\t[!] Diện Tích Hình Chữ Nhật");
        System.out.println("\t\t\t[+] Cạnh Dài : " + dai);
        System.out.println("\t\t\t[+] Cạnh Rộng : " + rong);
        dientich();
    }

    @Override
    public void dientich() {
        System.out.println("\t\t[=>] Diện Tích Hình Chữ Nhật : " +(dai * rong)+ "\n");
    }
}


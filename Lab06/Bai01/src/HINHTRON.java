import java.util.Scanner;

public class HINHTRON implements HINH {
    private double bankinh;
    Scanner sc = new Scanner(System.in);

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public HINHTRON(){
        bankinh = 0;
    }
    public HINHTRON(double bk){
        bankinh = bk;
    }
    @Override
    public void input(){
        System.out.print("\t\t\t[-] Nhập Bán Kính Hình Tròn:");
        bankinh = sc.nextDouble();
    }
    @Override
    public void output(){
        System.out.println("\n\t\t[!] Diện Tích Hình Tròn");
        System.out.println("\t\t\t[+] Bán Kính Hình Tròn : " + bankinh);
        dientich();
    }

    @Override
    public void dientich() {
        System.out.println("\t\t[=>] Diện Tích Hình Tròn :" + (pi * (bankinh*bankinh))+ "\n");
    }
}

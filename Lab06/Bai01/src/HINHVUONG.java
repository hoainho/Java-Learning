import java.util.Scanner;

public class HINHVUONG implements HINH{
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
    @Override
    public void input(){
        System.out.print("\t\t\t[-] Nhập Cạnh Hình Vuông : ");
        canh = sc.nextDouble();
    }
    @Override
    public void output(){
        System.out.println("\n\t\t[!] Diện Tích Hình Vuông");
        System.out.println("\t\t\t[+] Cạnh : " + canh);
        dientich();
    }
    @Override
    public void dientich() {
        System.out.println("\t\t[=>] Diện Tích Hình Vuông : " + (canh*canh)  + "\n");
    }

}

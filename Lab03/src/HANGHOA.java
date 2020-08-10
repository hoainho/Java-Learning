import java.util.Objects;
import java.util.Scanner;

public class HANGHOA {
    protected String tenhang;
    protected double gia;
    Scanner sc = new Scanner(System.in);
    public double getGia() {
        return gia;
    }
    public String getTenhang() {
        return tenhang;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }
    public HANGHOA(){
        tenhang="";
        gia = 0;
    }
    public HANGHOA(String tenhang,double gia){
        this.tenhang=tenhang;
        this.gia=gia;

    }
    public void input(){
        System.out.print("\tNhập Tên Hàng Hóa : ");
        tenhang = sc.nextLine();
        System.out.print("\tNhập Giá Hàng Hóa : ");
        gia = sc.nextDouble();
    }
    public void themMH(HANGHOA h){
        int n,x;
        n = sc.nextInt();
        HANGHOA[] KHO = new HANGHOA[n+1];
        for(int i =0; i< KHO.length-1 ; i++){
            KHO[i].input();
        }
        x = sc.nextInt();

        HANGHOA[] KHO1 = new HANGHOA[n+x];
        for(int i =0; i< KHO1.length; i++){
            KHO1[i].input();
            KHO = KHO1;
        }
    }

    public void output(){
        System.out.println("\tTên Hàng :"+ tenhang+"\n\tGiá : " + gia);
    }

}

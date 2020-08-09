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
    public void output(){
        System.out.println("\tTên Hàng :"+ tenhang+"\n\tGiá : " + gia);
    }

}

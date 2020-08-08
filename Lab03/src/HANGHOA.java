import java.util.Objects;
import java.util.Scanner;

public class HANGHOA {
    protected String mahang,tenhang;
    protected double gia;
    Scanner sc = new Scanner(System.in);
    public double getGia() {
        return gia;
    }

    public String getMahang() {
        return mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }
    public HANGHOA(){
        mahang="";
        tenhang="";
        gia = 0;
    }
    public HANGHOA(String mahang,String tenhang,double gia){
        this.mahang=mahang;
        this.tenhang=tenhang;
        this.gia=gia;

    }
    public void input(){
        System.out.println("\t\t\t\n<<<<<<<<<<NHẬP THÔNG TIN CÁC MẶT HÀNG MỚI>>>>>>>>>>\n");
        System.out.print("\tNhập Mã Hàng Hóa : ");
        mahang = sc.nextLine();
        System.out.print("\tNhập Tên Hàng Hóa : ");
        tenhang = sc.nextLine();
        System.out.print("\tNhập Giá Hàng Hóa : ");
        gia = sc.nextDouble();
    }
    public void output(){
        System.out.println("\t\t\t\n<<<<<<<<<<CHI TIẾT THÔNG TIN CÁC MẶT HÀNG MỚI>>>>>>>>>>\n");
        System.out.println("\tMã Hàng :" + mahang + "\n\tTên Hàng"+ tenhang+"\n\tGiá : " + gia);
    }

}

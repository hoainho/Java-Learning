import java.util.Scanner;

public class NHANVIEN extends CONNGUOI{
    int luong;
    String NgayNhanViec;
    PHONGBAN PBK = new PHONGBAN();
    Scanner sc = new Scanner(System.in);
    public int getLuong() {
        return luong;
    }

    public PHONGBAN getPBK() {
        return PBK;
    }

    public String getNgayNhanViec() {
        return NgayNhanViec;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setNgayNhanViec(String ngayNhanViec) {
        NgayNhanViec = ngayNhanViec;
    }

    public void setPBK(PHONGBAN PBK) {
        this.PBK = PBK;
    }
    public NHANVIEN(){
        super();
        luong = 0;
        NgayNhanViec = "";
    }
    public NHANVIEN(String ht, String ns, int l , String nnv){
        super(ht,ns);
        luong = l;
        NgayNhanViec =nnv;
    }
    public void input(){
        super.input();
        PBK.input();
        System.out.print("\t\t\t[-] Nhập Lương Cơ Bản : ");
        luong = sc.nextInt();
        sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Ngày Nhận Việc :");
        NgayNhanViec = sc.nextLine();
    }
     public void output(){
        super.output();
        PBK.output();
        System.out.println("\t\t\t[+] Lương Cơ Bản : " + luong);
        System.out.println("\t\t\t[+] Ngày Nhận Việc : " + NgayNhanViec);
    }
}

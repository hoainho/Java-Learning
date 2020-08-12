import java.util.Scanner;

abstract public class NHANVIEN {
    protected String manv,tennv,trinhdo,chuyenmon;
    protected int luongcb;
    Scanner sc = new Scanner(System.in);
    public int getLuongcb() {
        return luongcb;
    }

    public String getChuyenmon() {
        return chuyenmon;
    }

    public String getManv() {
        return manv;
    }

    public String getTennv() {
        return tennv;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setChuyenmon(String chuyenmon) {
        this.chuyenmon = chuyenmon;
    }

    public void setLuongcb(int luongcb) {
        this.luongcb = luongcb;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }
    public NHANVIEN(){
        manv ="";
        tennv ="";
        trinhdo ="";
        chuyenmon ="";
        luongcb =0;
    }
    public NHANVIEN(String ma, String ten, String td, String cm,int l){
        manv = ma;
        tennv=ten;
        trinhdo = td;
        chuyenmon = cm;
        luongcb =l;
    }
    public void input(){
        System.out.print("\t\t\t[-] Nhap ma : ");
        manv = sc.nextLine();
        System.out.print("\t\t\t[-] Nhap ten : ");
        tennv = sc.nextLine();
        System.out.print("\t\t\t[-] Nhap trinh do : ");
        trinhdo = sc.nextLine();
        System.out.print("\t\t\t[-] Nhap chuyen mon : ");
        chuyenmon = sc.nextLine();
        System.out.print("\t\t\t[-] Nhap luong : ");
        luongcb = sc.nextInt();
    }
    public void output(){
        System.out.println("\t\t\t[+] Ma :" +manv);
        System.out.println("\t\t\t[+] Ten :" +tennv);
        System.out.println("\t\t\t[+] Trinh Do :" +trinhdo);
        System.out.println("\t\t\t[+] Chuyen Mon :" +chuyenmon);
        System.out.println("\t\t\t[+] Luong Co Ban :" +luongcb);
    }
    abstract public void tinhluong();
}
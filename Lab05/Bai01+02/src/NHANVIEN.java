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

    public boolean setLuongcb(int luongcb) {
        if(luongcb > 0 ){
            this.luongcb = luongcb;
            return true;
        }
        else {
            System.err.println("[*] Nhập Sai, Vui lòng nhập lại  ( LƯU Ý : Lương là kiểu số và lớn hơn 0 ) !");
            return false;
        }
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
        System.out.print("\t\t\t[-] Nhập Mã : ");
        manv = sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Tên : ");
        tennv = sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Trình Độ : ");
        trinhdo = sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Chuyên Môn : ");
        chuyenmon = sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Lương Cơ Bản : ");
        while(true){
            int luongInput = sc.nextInt();
            boolean check = setLuongcb(luongInput);
            if(check){
                break;
            }else{
                System.out.print("\t\t\t\n\t\t\t[-] Nhập Lương Cơ Bản : ");
            }
        }
    }
    public void output(){
        System.out.println("\t\t\t[+] Mã :" +manv);
        System.out.println("\t\t\t[+] Tên :" +tennv);
        System.out.println("\t\t\t[+] Trình Độo :" +trinhdo);
        System.out.println("\t\t\t[+] Chuyên Môn :" +chuyenmon);
        System.out.println("\t\t\t[+] Lương Cơ Bản :" +luongcb);
    }
    abstract public void tinhluong();
}
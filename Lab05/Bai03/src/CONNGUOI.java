import java.util.Scanner;

public class CONNGUOI {
    protected String hoten,namsinh;
    Scanner sc = new Scanner(System.in);
    public String getHoten() {
        return hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public CONNGUOI(){
        hoten = "";
        namsinh = "";
    }
    public CONNGUOI(String ht, String ns){
        hoten =ht;
        namsinh =ns;
    }
    public  CONNGUOI(CONNGUOI CN){
        hoten = CN.hoten;
        namsinh = CN.namsinh;
    }
    public void input(){
        System.out.print("\t\t\t[-] Nhập Họ Và Tên : ");
        hoten = sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Năm Sinh : ");
        namsinh = sc.nextLine();
    }
    public void output(){
        System.out.println("\t\t\t[+] Họ Và Tên :" + hoten);
        System.out.println("\t\t\t[+] Năm Sinh :" + namsinh);
    }

}

import java.util.Scanner;

public class PHONGBAN {
    private  String mapb,tenpb;
    Scanner sc = new Scanner(System.in);
    public String getTenpb() {
        return tenpb;
    }

    public String getMapb() {
        return mapb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }
    public PHONGBAN(){
        mapb = "";
        tenpb = "";
    }
    public PHONGBAN(String mapb,String tenpb){
        this.mapb = mapb;
        this.tenpb = tenpb;
    }
    public void input(){
        System.out.print("\t\t\t[-] Nhập Mã Phòng Ban : ");
        mapb = sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Tên Phòng Ban : ");
        tenpb = sc.nextLine();
    }
    public void output(){
        System.out.println("\t\t\t[+] Mã Phòng Ban :" + mapb);
        System.out.println("\t\t\t[+] Tên Phòng Ban :" + tenpb);
    }
}

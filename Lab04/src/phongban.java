import java.util.Scanner;

public class phongban {
    Scanner sc = new Scanner(System.in);
    String mapb,tenpb;
    public phongban(){
        mapb ="";
        tenpb ="";
    }
    public phongban(String ma,String ten){
        mapb =ma;
        tenpb =ten;
    }

    public String getMapb() {
        return mapb;
    }

    public String getTenpb() {
        return tenpb;
    }

    public void setMapb(String mapb) {
        this.mapb = mapb;
    }

    public void setTenpb(String tenpb) {
        this.tenpb = tenpb;
    }
    public void input(){
        System.out.print("\t\t\tNhap ma phong ban : ");
        mapb = sc.nextLine();
        System.out.print("\t\t\tNhap ten phong ban : ");
        tenpb = sc.nextLine();
    }
    public void output(){
        System.out.println("\t\t\tMa phong ban : " + mapb);
        System.out.println("\t\t\tTen phong ban : " +tenpb);
    }
}

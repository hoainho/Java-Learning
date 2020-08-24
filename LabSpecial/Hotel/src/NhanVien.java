import java.util.Scanner;

public class NhanVien implements Method {
    String manv,tennv;
    int tuoi;
    Scanner sc = new Scanner(System.in);
    public String getTennv() {
        return tennv;
    }
    public int getTuoi() {
        return tuoi;
    }
    public String getManv() {
        return manv;
    }
    public void setTennv(String tennv) {
        this.tennv = tennv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public NhanVien(){
        manv = tennv = null;
        tuoi = 0;
    }
    public NhanVien(String ma,String t,String cv, int tuoi){
        manv = ma;
        tennv = t;
        this.tuoi = tuoi;
    }
    public NhanVien(NhanVien nv){
        manv = nv.manv;
        tennv = nv.tennv;
        tuoi = nv.tuoi;
    }

    @Override
    public void input() {
        System.out.print("\t\t\tNhập mã nhân viên :");
        manv = sc.nextLine();
        System.out.print("\t\t\tNhập tên nhân viên :");
        tennv = sc.nextLine();
        System.out.print("\t\t\tNhập tuổi nhân viên :");
        tuoi = sc.nextInt();
    }

    @Override
    public void output() {
        System.out.print("\t\t\tMã nhân viên :" +manv);
        System.out.print("\t\t\tTên nhân viên :"+tennv);
        System.out.print("\t\t\tTuổi nhân viên :"+tuoi);
    }


}

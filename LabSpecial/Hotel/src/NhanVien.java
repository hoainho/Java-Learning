public class NhanVien extends ConNguoi implements Method {
    String manv;
    public String getManv() {
        return manv;
    }
    public void setManv(String manv) {
        this.manv = manv;
    }
    public NhanVien(){
        super();
        manv  = null;
    }
    public NhanVien(String t,int age,String ma){
        super(t,age);
        manv = ma;
    }
    public NhanVien(NhanVien nv){
        super.ten = nv.ten;
        super.tuoi = nv.tuoi;
        manv = nv.manv;
    }

    @Override
    public void input() {
        System.out.print("\t\t\tNhập mã nhân viên :");
        manv = sc.nextLine();
        System.out.print("\t\t\tNhập tên nhân viên :");
        ten = sc.nextLine();
        System.out.print("\t\t\tNhập tuổi nhân viên :");
        tuoi = sc.nextInt();
    }

    @Override
    public void output() {
        System.out.print("\t\t\tMã nhân viên :" +manv);
        System.out.print("\t\t\tTên nhân viên :"+ten);
        System.out.print("\t\t\tTuổi nhân viên :"+tuoi);
    }


}

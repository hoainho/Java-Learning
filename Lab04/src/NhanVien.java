public class NhanVien extends  Persons{
    double luong;
    String ngaynhanviec;
    phongban pb = new phongban();
    public NhanVien(){
        luong = 0;
        ngaynhanviec = "";
    }
    public NhanVien(String ht,int ns,double l,String nnviec){
        super(ht,ns);
        luong =l;
        ngaynhanviec = nnviec;
    }

    public double getLuong() {
        return luong;
    }

    public String getNgaynhanviec() {
        return ngaynhanviec;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void setNgaynhanviec(String ngaynhanviec) {
        this.ngaynhanviec = ngaynhanviec;
    }
    public void input(){
        super.input();
        pb.input();
        System.out.print("\nNhap Luong : ");
        luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nNhap ngay nhan viec :");
        ngaynhanviec = sc.nextLine();
    }
    public void output(){
        super.output();
        pb.output();
        System.out.println("Luong : " + luong);
        System.out.println("Ngay Nhan Viec : " + ngaynhanviec);
    }
}

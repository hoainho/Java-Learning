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
        System.out.print("\nNhap Luong : ");
        luong = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nNhap ngay nhan viec :");
        ngaynhanviec = sc.nextLine();
        pb.input();
    }
    public void output(){
        super.output();
        System.out.println("Luong : " + luong);
        System.out.println("Ngay Nhan Viec : " + ngaynhanviec);
        pb.output();
    }
}

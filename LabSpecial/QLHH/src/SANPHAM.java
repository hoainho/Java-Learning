public abstract class SANPHAM {
    private String masp;
    private String tensp;
    private float soluong;
    float dongia;
    abstract float tinhtien();
    public SANPHAM(String ma, String ten, float sl, float dongia){
        masp = ma;
        tensp = ten;
        soluong = sl;
        this.dongia = dongia;
    }
    public float getDongia() {
        return dongia;
    }

    public float getSoluong() {
        return soluong;
    }

    public String getMasp() {
        return masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

}

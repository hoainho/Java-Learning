public class NVCLC extends NHANVIEN {
    private String TrinhDo,Nganh,NoiDaoTao;

    public String getNganh() {
        return Nganh;
    }

    public String getNoiDaoTao() {
        return NoiDaoTao;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setNganh(String nganh) {
        Nganh = nganh;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        NoiDaoTao = noiDaoTao;
    }

    public void setTrinhDo(String trinhDo) {
        TrinhDo = trinhDo;
    }
    public NVCLC(){
        super();
        TrinhDo ="";
        Nganh  = "";
        NoiDaoTao = "";
    }
    public NVCLC(String ht, String ns, int l , String nnv,String td,String n,String ndt){
        super(ht,ns,l,nnv);
        TrinhDo = td;
        Nganh = n;
        NoiDaoTao = ndt;
    }
    public void input(){
        super.input();
        System.out.print("\t\t\t[-] Nhập Trình Độ Học Vấn : ");
        TrinhDo =sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Chuyên Ngành : ");
        Nganh =sc.nextLine();
        System.out.print("\t\t\t[-] Nhập Nơi Đào Tạo : ");
        NoiDaoTao =sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("\t\t\t[+] Trình Độ: " + TrinhDo);
        System.out.println("\t\t\t[+] Chuyên Ngành : " + Nganh);
        System.out.println("\t\t\t[+] Nơi Đào Tạo : " + NoiDaoTao);
    }
}

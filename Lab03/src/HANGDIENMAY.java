import java.util.Scanner;

public class HANGDIENMAY extends HANGHOA{
    private int thoigianbaohanh,dienap,congsuat;
    protected String mahang;
    Scanner sc = new Scanner(System.in);

    public int getCongsuat() {
        return congsuat;
    }

    public int getDienap() {
        return dienap;
    }

    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setCongsuat(int congsuat) {
        this.congsuat = congsuat;
    }

    public void setDienap(int dienap) {
        this.dienap = dienap;
    }

    public void setThoigianbaohanh(int thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }
    public HANGDIENMAY(){
        super();
        thoigianbaohanh = 0;
        dienap = 0;
        congsuat =0;
    }
    public String getMahang() {
        return mahang;
    }
    public boolean setMahang(String mahang) {
        if(mahang != null && mahang.contains("DM") && !mahang.contains(" ")){
            this.mahang = mahang;
            return true;
        }
        else {
            System.err.println("(Vui Lòng Nhập Mã Theo Cấu Trúc : DM01,DM02...)");
            return false;
        }
    }
    public HANGDIENMAY(String th, double g,int tgbh,int da,int cs){
        super(th,g);
        thoigianbaohanh = tgbh;
        dienap =da;
        congsuat =cs;
    }
    public void input(){
        System.out.print("\tNhập Mã Hàng Điện Máy : ");
        while(true){
            String code = sc.nextLine();
            boolean check = setMahang(code);
            if(check) {
                break;
            }
        }
        super.input();
        System.out.print("\tNhập Thời Gian Bảo Hành : ");
        thoigianbaohanh = sc.nextInt();
        System.out.print("\tNhập Điện Áp : ");
        dienap = sc.nextInt();
        System.out.print("\tNhập Công Suất : ");
        congsuat = sc.nextInt();
    }
    public void output(){
        System.out.print("\tMã Hàng  : " + mahang + "\n");
        super.output();
        System.out.println("\tThời Gian Bảo Hành :" + thoigianbaohanh + "\n\tĐiện Áp :"+ dienap+"\n\tCông Suất : " + congsuat);
    }

}

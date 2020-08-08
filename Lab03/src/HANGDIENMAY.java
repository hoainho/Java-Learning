import java.util.Scanner;

public class HANGDIENMAY extends HANGHOA{
    private int thoigianbaohanh,dienap,congsuat;
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
    public HANGDIENMAY(String mh,String th, double g,int tgbh,int da,int cs){
        super(mh,th,g);
        thoigianbaohanh = tgbh;
        dienap =da;
        congsuat =cs;
    }
    public void input(){
        super.input();
        System.out.print("\tNhập Thời Gian Bảo Hành : ");
        thoigianbaohanh = sc.nextInt();
        System.out.print("\tNhập Điện Áp : ");
        dienap = sc.nextInt();
        System.out.print("\tNhập Công Suất : ");
        congsuat = sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.println("\tThời Gian Bảo Hành :" + thoigianbaohanh + "\n\tĐiện Áp"+ dienap+"\n\tCông Suất : " + congsuat);
    }

}

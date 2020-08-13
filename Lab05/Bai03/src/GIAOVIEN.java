import java.util.Scanner;

public class GIAOVIEN extends NVCLC{
    private int ThuLao ;
    Scanner sc = new Scanner(System.in);
    public int getPhuCap() {
        return ThuLao;
    }

    public void setPhuCap(int phuCap) {
        ThuLao = phuCap;
    }
    public GIAOVIEN(){
        super();
        ThuLao = 0;
    }
    public GIAOVIEN(String ht, String ns, int l , String nnv,String td,String n,String ndt,int pc){
        super(ht,ns,l,nnv,td,n,ndt);
        ThuLao = pc;
    }
    public void input(){
        super.input();
        System.out.print("\t\t\t[-] Nhập Thù Lao Giáo DỤc  : ");
        ThuLao = sc.nextInt();
    }

    @Override
    public void tinhluong() {
        System.out.println("\n\t[=>] Lương Tổng :  "  + (luong + ThuLao));
    }

    public void output(){
        super.output();
        System.out.print("\t\t\t[+] Thù Lao Giáo DỤc  : ");
        tinhluong();
    }
}

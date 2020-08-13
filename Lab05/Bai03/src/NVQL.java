import java.util.Scanner;

public class NVQL extends NVCLC {
    private int PhuCap ;
    Scanner sc = new Scanner(System.in);
    public int getPhuCap() {
        return PhuCap;
    }

    public void setPhuCap(int phuCap) {
        PhuCap = phuCap;
    }
    public NVQL(){
        super();
        PhuCap = 0;
    }
    public NVQL(String ht, String ns, int l , String nnv,String td,String n,String ndt,int pc){
        super(ht,ns,l,nnv,td,n,ndt);
        PhuCap = pc;
    }


    public void input(){
        super.input();
        System.out.print("\t\t\t[-] Nhập Phụ Cấp Chức Vụ : ");
        PhuCap = sc.nextInt();
    }
    @Override
    public void tinhluong() {
        System.out.println("\n\t[=>] Lương Tổng :  "  + (luong + getPhuCap()));
    }
    public void output(){
        super.output();
        System.out.print("\t\t\t[+] Phụ Cấp Chức Vụ : ");
        tinhluong();
    }
}

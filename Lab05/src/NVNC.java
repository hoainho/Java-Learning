public class NVNC extends NHANVIEN{
    int phucapdochai;

    public int getPhucapdochai() {
        return phucapdochai;
    }

    public void setPhucapdochai(int phucapdochai) {
        this.phucapdochai = phucapdochai;
    }
    public NVNC(){
        super();
        phucapdochai = 0;
    }
    public NVNC(String ma, String ten, String td, String cm,int l,int pc){
        super(ma,ten,td,cm,l);
        phucapdochai = pc;
    }
    public void input(){
        super.input();
        System.out.print("\t\t\t[-] Nhap Phu Cap Doc Hai :");
        phucapdochai = sc.nextInt();
    }
    @Override
    public void tinhluong() {
        System.out.println("[=>] Luong Tong : " + (luongcb + phucapdochai));
    }

    public void output(){
        super.output();
        System.out.println("\t\t\t[+]Phu Cap Doc Hai : " +phucapdochai);
        tinhluong();
    }


}

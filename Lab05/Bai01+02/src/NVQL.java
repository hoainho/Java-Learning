public class NVQL extends NHANVIEN{
    int phucapchucvu;

    public int getPhucapchucvu() {
        return phucapchucvu;
    }

    public void setPhucapchucvu(int phucapdochai) {
        this.phucapchucvu = phucapdochai;
    }
    public NVQL(){
        super();
        phucapchucvu = 0;
    }
    public NVQL(String ma, String ten, String td, String cm,int l,int pc){
        super(ma,ten,td,cm,l);
        phucapchucvu = pc;
    }
    public void input(){
        super.input();
        System.out.print("\t\t\t[-] Nhập Phụ Cấp Chức Vụ :");
        phucapchucvu = sc.nextInt();
    }
    public void output(){
        super.output();
        System.out.print("\t\t\t[+] Phụ Cấp Chức Vụ :" + phucapchucvu);
        tinhluong();
    }

    @Override
    public void tinhluong() {

        System.out.println("\n[=>] Lương Tổng : "+(luongcb + phucapchucvu));
    }
}

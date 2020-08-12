public class NVPV extends NHANVIEN{
    public NVPV(){
        super();
    }
    public NVPV(String ma, String ten, String td, String cm,int l,int pc){
        super(ma,ten,td,cm,l);
    }
    public void output(){
        super.output();
    }

    @Override
    public void tinhluong() {
        System.out.println("[=>]Luong Tong : " + luongcb);
    }
}

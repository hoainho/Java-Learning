
import java.util.Scanner;

public class HANGTHUCPHAM extends HANGHOA{
    private int ngaysanxuat,ngayhethan;
    protected String mahang;
    Scanner sc = new Scanner(System.in);
    public int getNgaysanxuat() {
        return ngaysanxuat;
    }

    public int getNgayhethan() {
        return ngayhethan;
    }

    public void setNgaysanxuat(int ngaysanxuat) {
        this.ngaysanxuat = ngaysanxuat;
    }

    public void setNgayhethan(int ngayhethan) {
        this.ngayhethan = ngayhethan;
    }
    public String getMahang() {
        return mahang;
    }
    public boolean setMahang(String mahang) {
        if(mahang != null && mahang.contains("TP") && !mahang.contains(" ")){
            this.mahang = mahang;
            return true;
        }
        else {
            System.err.println("(Vui Lòng Nhập Mã Theo Cấu Trúc : TP01,TP02...)");
            return false;
        }
    }
    public HANGTHUCPHAM(){
        super();
        mahang="";
        ngayhethan = 0;
        ngaysanxuat = 0;
    }
    public HANGTHUCPHAM(String th, double g,String mh,int nsx,int nhh){
        super(th,g);
        mahang=mh;
        ngaysanxuat = nsx;
        ngayhethan = nhh;
    }
    public void input(){
        System.out.print("\tNhập Mã Hàng Thực Phẩm : ");
        while(true){
            String code = sc.nextLine();
            boolean check = setMahang(code);
            if(check) {
                break;
            }
        }
        super.input();
        System.out.print("\tNhập Thời Gian Sản Xuất : ");
        ngaysanxuat = sc.nextInt();
        System.out.print("\tNhập Thời Gian Hết Hạn : ");
        ngayhethan = sc.nextInt();
    }
    public void output(){
        System.out.println("\n\tMã Hàng :" + mahang );
        super.output();
        System.out.println("\tNgày Sản Xuất : " + ngaysanxuat + "\n\tNgày Hết Hạn : "+ ngayhethan);
    }

}

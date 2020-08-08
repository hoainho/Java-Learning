import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HANGTHUCPHAM extends HANGHOA{
    private int ngaysanxuat,ngayhethan;
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
    public HANGTHUCPHAM(){
        super();
    }

}

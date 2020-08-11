import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persons> DanhSach = new ArrayList<>();
        int choose;
        int sl;
        do {
            showMenu();
            System.out.print("Chọn Chức Năng : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("\t\t[*] Nhập Số Lượng Sinh Viên:");
                    sl = sc.nextInt();
                    SinhVien[] SINHVIEN = new SinhVien[sl];
                    System.out.println("\t\t\t[-] Nhập Thông Tin Sinh Viên : ");
                    for (int i =0 ; i < sl; i++) {
                        SINHVIEN[i] = new SinhVien();
                        SINHVIEN[i].input();
                        DanhSach.add(SINHVIEN[i]);
                    }
                    break;
                case 2:

                    System.out.println("\t\t[*] Nhập Số Lượng Nhân Viên ");
                    sl = sc.nextInt();
                    NhanVien[] NHANVIEN = new NhanVien[sl];
                    System.out.println("\t\t\t[-]Nhập Thôn Tin Nhân Viên : ");
                    for (int i =0 ; i < sl; i++) {
                        NHANVIEN[i] = new NhanVien();
                        NHANVIEN[i].input();
                        DanhSach.add(NHANVIEN[i]);
                    }
                    break;
                case 3:
                    System.out.println("\t\t[*] Thông Tin Học Viên");
                    for(int i =0; i< DanhSach.size();i++){
                        if(DanhSach.get(i) instanceof SinhVien){
                            System.out.println("\t\t\t[-]SV Số "+ (i+1));
                            DanhSach.get(i).output();
                        }
                    }
                    break;
                case 4:
                    System.out.println("\t\t[*]Thông Tin Nhân Viên");
                    for(int i =0; i< DanhSach.size();i++){
                        if(DanhSach.get(i) instanceof NhanVien){
                            System.out.println("\t\t\t[-]NV Số "+ (i+1));
                            DanhSach.get(i).output();
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n\t\t\t\t\t\t\t[*] - SEE Y0U AGAIN - [*]");
                    break;
            }
        } while (choose != 5);
    }
    static void showMenu(){
        System.out.println("[1] - Nhập 1 Học Viên");
        System.out.println("[2] - Nhập 1 Nhân Viên");
        System.out.println("[3] - Xuất Thông Tin Danh Sách Học Viên");
        System.out.println("[4] - Xuất Thông Tin Danh Sách Nhân Viên");
        System.out.println("[5] - THOÁT");

    }
}



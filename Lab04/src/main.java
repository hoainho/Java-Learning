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
            System.out.print("Chon Chuc Nang : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap sl sinh vien:");
                    sl = sc.nextInt();
                    SinhVien[] SINHVIEN = new SinhVien[sl];
                    System.out.println("Nhap thong tin sinh vien");
                    for (int i =0 ; i < sl; i++) {
                        SINHVIEN[i] = new SinhVien();
                        SINHVIEN[i].input();
                        DanhSach.add(SINHVIEN[i]);
                    }
                    break;
                case 2:

                    System.out.println("Nhap sl nhan vien:");
                    sl = sc.nextInt();
                    NhanVien[] NHANVIEN = new NhanVien[sl];
                    System.out.println("Nhap thong tin nhan vien");
                    for (int i =0 ; i < sl; i++) {
                        NHANVIEN[i] = new NhanVien();
                        NHANVIEN[i].input();
                        DanhSach.add(NHANVIEN[i]);
                    }
                    break;
                case 3:
                    System.out.println("Thong tin hoc vien");
                    for(int i =0; i< DanhSach.size();i++){
                        if(DanhSach.get(i) instanceof SinhVien){
                            System.out.println("[-]SV Số "+ (i+1));
                            DanhSach.get(i).output();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thong tin nhan vien");
                    for(int i =0; i< DanhSach.size();i++){
                        if(DanhSach.get(i) instanceof NhanVien){
                            System.out.println("[-]NV Số "+ (i+1));
                            DanhSach.get(i).output();
                        }
                    }
                    break;
                case 5:
                    System.out.println("SEE Y0U AGAIN !!");
                    break;
            }
        } while (choose != 5);
    }
    static void showMenu(){
        System.out.println("[1] - Nhap 1 hoc vien");
        System.out.println("[2] - Nhap 1 nhan vien");
        System.out.println("[3] - xuat thong tin danh sach hoc vien");
        System.out.println("[4] - Xuat thong tin danh sach nhan vien");
        System.out.println("[5] - THOAT");

    }
}



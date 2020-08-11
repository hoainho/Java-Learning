import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Persons> State = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choose;
        int count = 0;
        int sl;
        SinhVien[] dssv;
        NhanVien[] dsnv;
        do {
            showMenu();
            System.out.print("Chon Chuc Nang : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap sl sinh vien:");
                    sl = sc.nextInt();
                    dssv = new SinhVien[sl];
                    System.out.println("Nhap thong tin sinh vien");
                    for (int i =0 ; i < sl; i++) {
                        dssv[i].input();
                    }
                    break;
                case 2:

                    System.out.println("Nhap sl nhan vien:");
                    sl = sc.nextInt();
                    dsnv = new NhanVien[sl];
                    System.out.println("Nhap thong tin nhan vien");
                    for (int i =0 ; i < sl; i++) {
                        dsnv[i].input();
                    }
                    break;
                case 3:
                    sl = sc.nextInt();
                    System.out.println("Thong tin hoc vien");
                    for (int i =0 ; i < sl; i++) {
                        dssv = new SinhVien[sl];
                        dssv[i].output();
                    }
                    break;
                case 4:

                    System.out.println(" thong tin nhan vien");
                    for (int i =0 ; i < State.size(); i++) {
                        if(State.get(i) instanceof NhanVien){
                            State.get(i).output();
                            count ++;
                        }else{
                            System.out.println("Khong tim thay nhan vien nao");
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



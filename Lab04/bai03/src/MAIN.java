import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        ArrayList<CONNGUOI> DANHSACH = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);

        do {
            showMenu();
            System.err.print("\n\t\t\t[*] Chức Năng :");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("\n[-] Nhập Thông Tin Học Viên :");
                    HOCVIEN hv = new HOCVIEN();
                    hv.input();
                    DANHSACH.add(hv);
                    break;
                case 2:
                    System.out.println("\n[-] Nhập Thông tin Nhân Viên Quản Lí :");
                    NVQL nvql = new NVQL();
                    nvql.input();
                    DANHSACH.add(nvql);
                    break;
                case 3:
                    System.out.println("\n[-] Nhập Thông Tin Giáo Viên :");
                    GIAOVIEN gv = new GIAOVIEN();
                    gv.input();
                    DANHSACH.add(gv);
                    break;
                case 4:
                    System.err.println("\n\t\t\t|-----------------------------------------------|");
                    System.err.println("\t\t\t|\t\t\t[!] Thông Tin Học Viên [!]\t\t\t|");
                    System.err.println("\t\t\t|-----------------------------------------------|\n");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  HOCVIEN ) {
                            value.output();
                        }
                    }
                    break;
                case 5:
                    System.err.println("\n\t\t\t|-----------------------------------------------|");
                    System.err.println("\t\t\t|\t\t[!] Thông tin Nhân Viên Quản Lí [!]\t\t|");
                    System.err.println("\t\t\t|-----------------------------------------------|\n");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  NVQL ) {
                            value.output();
                        }
                    }
                    break;
                case 6:
                    System.err.println("\n\t\t\t|-----------------------------------------------|");
                    System.err.println("\t\t\t|\t\t\t[!] Thông Tin Giáo Viên [!]\t\t\t|");
                    System.err.println("\t\t\t|-----------------------------------------------|\n");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  GIAOVIEN ) {
                            value.output();
                        }
                    }
                    break;
                case 7:
                    System.err.println("\n\t\t\t|-----------------------------------------------|");
                    System.err.println("\t\t\t|\t\t[~] S-E-A  Y-0-U  A-G-A-I-N [~]\t\t\t|");
                    System.err.println("\t\t\t|-----------------------------------------------|\n");
                    break;
            }

        }while (chon != 7);

    }
    static void showMenu() {
        System.out.println("\t\t\t|-----------------------------------------------|");
        System.out.println("\t\t\t|\t[1] - Thêm Học Viên\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[2] - Thêm Nhân Viên Quản Lí \t\t\t\t|");
        System.out.println("\t\t\t|\t[3] - Thêm Giáo Viên\t\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[4] - Danh Sách Học Viên\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[5] - Danh Sách Nhân Viên Quản Lí \t\t\t|");
        System.out.println("\t\t\t|\t[6] - Danh Sách Giáo Viên \t\t\t\t\t|");
        System.out.println("\t\t\t|\t[7] - THOÁT\t\t\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|_______________________________________________|");
    }
}

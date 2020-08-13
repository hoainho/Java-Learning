import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        ArrayList<NHANVIEN> DANHSACH = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            System.err.print("\n\t\t\t[*] Chức Năng :");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("\n[-] Nhập Thông Tin Nhân Viên Quản Lí :");
                    NVQL ql = new NVQL();
                    ql.input();
                    DANHSACH.add(ql);
                    break;
                case 2:
                    System.out.println("\n[-] Nhập Thông Tin Nhân Viên Nghiên Cứu :");
                    NVNC nc = new NVNC();
                    nc.input();
                    DANHSACH.add(nc);
                    break;
                case 3:
                    System.out.println("\n[-] Nhập Thông Tin Nhân Viên Phục Vụ :");
                    NVPV pv = new NVPV();
                    pv.input();
                    DANHSACH.add(pv);
                    break;
                case 4:
                    System.out.println("\n[+] Thông Tin Nhân Viên Quản Lí :");
                    for (NHANVIEN value : DANHSACH) {
                        if(value instanceof  NVQL ) {
                            value.output();
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n[+] Thông Tin Nhân Viên Nghiên Cứu :");
                    for (NHANVIEN value : DANHSACH) {
                        if(value instanceof  NVNC ) {
                            value.output();
                        }
                    }
                    break;
                case 6:
                    System.out.println("\n[+] Thông Tin Nhân Viên Phục Vụ :");
                    for (NHANVIEN value : DANHSACH) {
                        if(value instanceof  NVPV ) {
                            value.output();
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n\t\t\t\t\t[~] SEA Y0U AGAIN [~]");
                    break;
            }

        }while (chon != 7);

    }
    static void showMenu() {
        System.out.println("\t\t\t|-----------------------------------------------|");
        System.out.println("\t\t\t|\t[1] - Thêm Nhân Viên Quản Lí\t\t\t\t|");
        System.out.println("\t\t\t|\t[2] - Thêm Nhân Viên Nghiên Cứu \t\t\t|");
        System.out.println("\t\t\t|\t[3] - Thêm Nhân Viên Phục Vụ\t\t\t\t|");
        System.out.println("\t\t\t|\t[4] - Danh Sách Nhân Viên Quản Lí\t\t\t|");
        System.out.println("\t\t\t|\t[5] - Danh Sách Nhân Viên Nghiên Cứu \t\t|");
        System.out.println("\t\t\t|\t[6] - Danh Sách Nhân Viên Phục Vụ \t\t\t|");
        System.out.println("\t\t\t|\t[7] - THOÁT\t\t\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|_______________________________________________|");
    }
}

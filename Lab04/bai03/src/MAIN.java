import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<CONNGUOI> DANHSACH = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
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
                    System.out.println("\n[+] Thông Tin Học Viên :");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  HOCVIEN ) {
                            value.output();
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n[+] Thông tin Nhân Viên Quản Lí :");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  NVQL ) {
                            value.output();
                        }
                    }
                    break;
                case 6:
                    System.out.println("\n[+] Nhập Thông Tin Giáo Viên :");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  GIAOVIEN ) {
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
}

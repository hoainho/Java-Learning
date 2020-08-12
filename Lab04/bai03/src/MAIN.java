import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<CONNGUOI> DANHSACH = new ArrayList<>();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("[*] Chon Chuc Nang :");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("[-] Nhap Thong Tin Hoc Vien :");
                    HOCVIEN hv = new HOCVIEN();
                    hv.input();
                    DANHSACH.add(hv);
                    break;
                case 2:
                    System.out.println("[-] Nhap Thong Tin Nhan Vien Quan Li :");
                    NVQL nvql = new NVQL();
                    nvql.input();
                    DANHSACH.add(nvql);
                    break;
                case 3:
                    System.out.println("[-] Nhap Thong Tin Giao Vien :");
                    GIAOVIEN gv = new GIAOVIEN();
                    gv.input();
                    DANHSACH.add(gv);
                    break;
                case 4:
                    System.out.println("[+] Thong Tin Hoc Vien :");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  HOCVIEN ) {
                            value.output();
                        }
                    }
                    break;
                case 5:
                    System.out.println("[+] Thong Tin Nhan Vien Quan Li :");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  NVQL ) {
                            value.output();
                        }
                    }
                    break;
                case 6:
                    System.out.println("[+] Thong Tin Giao Vien :");
                    for (CONNGUOI value : DANHSACH) {
                        if(value instanceof  GIAOVIEN ) {
                            value.output();
                        }
                    }
                    break;
                case 7:
                    System.out.println("[~] SEA Y0U AGAIN [~]");
                    break;
            }

        }while (chon != 7);

    }
}

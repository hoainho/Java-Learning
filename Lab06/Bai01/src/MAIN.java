import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        ArrayList<HINH> Storage = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon =0;
        do {
            showMenu();
            System.out.print("\t\t\t[!]Chọn Chức Năng :");
            chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("\n\t\t[-]Nhập Thông Tin Hình Vuông Cần Tính :");
                    HINHVUONG hv = new HINHVUONG();
                    hv.input();
                    Storage.add(hv);
                    break;
                case 2:
                    System.out.println("\n\t\t[-]Nhập Thông Tin Hình Chữ Nhật Cần Tính :");
                    HINHCN hcn = new HINHCN();
                    hcn.input();
                    Storage.add(hcn);
                    break;
                case 3:
                    System.out.println("\n\t\t[-]Nhập Thông Tin Hình Tròn Cần Tính :");
                    HINHTRON ht = new HINHTRON();
                    ht.input();
                    Storage.add(ht);
                    break;
                case 4:
                    System.err.println("\n\t\t\t|-----------------------------------------------|");
                    System.err.println("\t\t\t|\t\t[!] Diện Tích Tất Cả Các Hình [!]\t\t|");
                    System.err.println("\t\t\t|-----------------------------------------------|\n");
                    for (HINH i: Storage) {
                        i.output();
                    }
                    break;
                case 5:
                    System.err.println("\n\t\t\t|-----------------------------------------------|");
                    System.err.println("\t\t\t|\t\t[~] S-E-A  Y-0-U  A-G-A-I-N [~]\t\t\t|");
                    System.err.println("\t\t\t|-----------------------------------------------|\n");
                    break;
            }

        }while(chon != 5);
    }
    static void showMenu() {
        System.out.println("\n\t\t\t|-----------------------------------------------|");
        System.out.println("\t\t\t|\t[1] - Nhập Thông Tin Hình Vuông\t\t\t\t|");
        System.out.println("\t\t\t|\t[2] - Nhập Thông Tin Hình Chữ Nhật \t\t\t|");
        System.out.println("\t\t\t|\t[3] - Nhập Thông Tin Hình Tròn\t\t\t\t|");
        System.out.println("\t\t\t|\t[4] - Tính Diện Tích Các Hình\t\t\t\t|");
        System.out.println("\t\t\t|\t[5] - THOÁT\t\t\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|_______________________________________________|");
    }
}

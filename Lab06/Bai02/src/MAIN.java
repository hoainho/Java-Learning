import MyPackage.Calculate;
import MyPackage.Shape.Circle;
import java.util.Scanner;
import Introduce.myIntroduce;
public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("\n\t\t\t\t\t\t\t|-----------------------------------------------|");
        System.err.println("\t\t\t\t\t\t\t|\t\t\t\t[!] Nhập Dữ Kiện [!]\t\t\t|");
        System.err.println("\t\t\t\t\t\t\t|-----------------------------------------------|\n");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!] HÌNH LẬP PHƯƠNG [!]");
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Chiều Dài : ");
        Double chieudai = sc.nextDouble();
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Chiều Rộng : ");
        Double chieurong = sc.nextDouble();
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Chiều Cao : ");
        Double chieucao = sc.nextDouble();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t\tHÌNH TRÒN\t[!]");
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Bán Kính : ");
        double bankinh = sc.nextDouble();

        System.err.println("\n\t\t\t\t\t\t\t|-----------------------------------------------|");
        System.err.println("\t\t\t\t\t\t\t|\t\t[!] Dữ Kiện Sau Khi Tính Toán [!]\t\t|");
        System.err.println("\t\t\t\t\t\t\t|-----------------------------------------------|\n");
        System.out.println("\n");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!] HÌNH LẬP PHƯƠNG [!]");
        System.out.println("\t\t\t\t\t\t\t\t[+]Thể Tích : " + Calculate.Volume(chieudai,chieurong,chieucao));
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t\tHÌNH TRÒN\t[!]");
        Circle C =new Circle(bankinh);
        System.out.println("\t\t\t\t\t\t\t\t[+]Diện Tích: " + C.Area());
    }
}

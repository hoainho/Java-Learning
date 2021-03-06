import MyPackage.Calculate;
import MyPackage.Shape.Circle;
import java.util.Scanner;
import Introduce.myIntroduce;
import MyPackage.Shape.Rectangle;
import MyPackage.Shape.Square;
import MyPackage.Shape.Triangular;

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
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t   HÌNH TRÒN   \t[!]");
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Bán Kính : ");
        double bankinh = sc.nextDouble();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t HÌNH CHỮ NHẬT  [!]");
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Chiều Dài : ");
        Double chieudaihcn = sc.nextDouble();
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Chiều Rộng : ");
        Double chieuronghcn = sc.nextDouble();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t   HÌNH VUÔNG\t[!]");
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Cạnh : ");
        Double canh = sc.nextDouble();
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t HÌNH TAM GIÁC  [!]");
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Cạnh Đáy : ");
        Double canhday = sc.nextDouble();
        System.out.print("\t\t\t\t\t\t\t\t[-]Nhập Chiều Cao : ");
        Double chieucaoTG = sc.nextDouble();
        System.err.println("\n\t\t\t\t\t\t\t|-----------------------------------------------|");
        System.err.println("\t\t\t\t\t\t\t|\t\t[!] Dữ Kiện Sau Khi Tính Toán [!]\t\t|");
        System.err.println("\t\t\t\t\t\t\t|-----------------------------------------------|\n");
        System.out.println("\n");
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!] HÌNH LẬP PHƯƠNG [!]");
        System.out.println("\t\t\t\t\t\t\t\t[+]Thể Tích : " + Calculate.Volume(chieudai,chieurong,chieucao));
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t   HÌNH TRÒN   \t[!]");
        Circle C =new Circle(bankinh);
        System.out.println("\t\t\t\t\t\t\t\t[+]Diện Tích: " + C.Area());
        System.out.println("\t\t\t\t\t\t\t\t[+]Chu Vi: " + C.Circumference());
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t HÌNH CHỮ NHẬT  [!]");
        Rectangle HCN =new Rectangle(chieudaihcn,chieuronghcn);
        System.out.println("\t\t\t\t\t\t\t\t[+]Diện Tích: " + HCN.Area());
        System.out.println("\t\t\t\t\t\t\t\t[+]Chu Vi: " + HCN.Perimeter());
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t   HÌNH VUÔNG\t[!]");
        Square HV  = new Square(canh);
        System.out.println("\t\t\t\t\t\t\t\t[+]Diện Tích: " + HV.Area());
        System.out.println("\t\t\t\t\t\t\t\t[+]Chu Vi: " + HV.Perimeter());
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t[!]\t HÌNH TAM GIÁC  [!]");
        Triangular HTG = new Triangular(canhday,chieucaoTG);
        System.out.println("\t\t\t\t\t\t\t\t[+]Diện Tích: " + HTG.Area());
    }
}

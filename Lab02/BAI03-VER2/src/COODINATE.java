import java.util.Scanner;
public class COODINATE {
    public static void main(String[] args) {
        double xA, yA;  // tọa độ điểm A
        double xB, yB;  // tọa độ điểm B
        double dodaiAB; // độ dài đoạn thắng AB
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t*********Nhập tọa độ điểm A: ");
        System.out.println("\tNhập hoành độ điểm A:");
        xA = scanner.nextDouble();
        System.out.println("\tNhập tung độ điểm A: ");
        yA = scanner.nextDouble();

        System.out.println("\n\t\t*********Nhập tọa độ điểm B: ");
        System.out.println("\tNhập hoành độ điểm B: ");
        xB = scanner.nextDouble();
        System.out.println("\tNhập tung độ điểm B: ");
        yB = scanner.nextDouble();

        // tính độ dài AB
        dodaiAB = Math.sqrt(Math.pow((xB - xA), 2) + Math.pow((yB - yA), 2));
        System.out.println("Độ dài đoạn thắng AB = " + dodaiAB);
    }
}

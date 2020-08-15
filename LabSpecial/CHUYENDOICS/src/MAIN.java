import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        String number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân cần đổi : ");
        number =sc.nextLine();
        int num2 = Integer.parseInt(number,2);
        String bin = Integer.toBinaryString(num2);
        System.out.println("Cơ số 2 của "+ number+" là: " +bin);
        System.out.println("----------------------------");
        int num8 = Integer.parseInt(number,8);
        String octal = Integer.toOctalString(num8);
        System.out.println("Cơ số 8 của "+ number+" là: " +octal);
        System.out.println("----------------------------");
        int num16 = Integer.parseInt(number,16);
        String hex = Integer.toHexString(num16);
        System.out.println("Cơ số 16 của "+ number+" là: " +hex);
        System.out.println("----------------------------");
    }
}

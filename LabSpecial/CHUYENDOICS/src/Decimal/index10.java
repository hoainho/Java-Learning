package Decimal;

import java.util.Scanner;

public class index10{
    public void action(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số thập phân cần đổi : ");
        int number =sc.nextInt();
        String bin = Integer.toBinaryString(number);
        System.out.println("Cơ số 2 của "+ number+" là: " +bin);
        System.out.println("----------------------------");
        String octal = Integer.toOctalString(number);
        System.out.println("Cơ số 8 của "+ number+" là: " +octal);
        System.out.println("----------------------------");
        String hex = Integer.toHexString(number);
        System.out.println("Cơ số 16 của "+ number+" là: " +hex);
        System.out.println("----------------------------");
    }


}


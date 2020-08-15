import java.util.Scanner;

public class CS8 {
    String ocNumber;
    Scanner sc = new Scanner(System.in);
    public void Chuyendoics(){

            ocNumber = sc.nextLine();
            int num = Integer.parseInt(ocNumber, 8);
            System.out.println("Giá trị thập phân tương đương của "+ocNumber+" là: "+num);
            System.out.println("----------------------------");
    }
}

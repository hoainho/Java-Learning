import java.sql.SQLOutput;
import java.util.Scanner;

public class Persons {
    Scanner sc = new Scanner(System.in);
    String hoten;
    int namsinh;
    public Persons(){
        hoten ="";
        namsinh = 0;
    }
    public Persons(String ht, int ns){
        hoten = ht;
        namsinh = ns;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void input() {
        System.out.print("Nhap ho ten :");
        hoten = sc.nextLine();
        System.out.print("Nhap nam sinh :");
        namsinh = sc.nextInt();
    }
    public void output(){
        System.out.println("Ho va Ten : " + hoten);
        System.out.println("Nam Sinh  : " + namsinh);
    }
}

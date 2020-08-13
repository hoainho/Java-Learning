import java.util.Scanner;

public class HINHTRON {
    private double bankinh;
    Scanner sc = new Scanner(System.in);

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public HINHTRON(){
        bankinh = 0;
    }
    public HINHTRON(double bk){
        bankinh = bk;
    }
    public void output(){
        System.out.println("\t\t\t[+] Ban Kinh : " + bankinh);
    }
}

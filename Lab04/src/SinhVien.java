import java.util.Scanner;

public class SinhVien extends Persons {
    Scanner sc = new Scanner(System.in);
    float diem1, diem2,diem3;
    public SinhVien(){
        super();
        diem1 =0;
        diem2 =0;
        diem3 =0;
    }
    public SinhVien(String ht,int ns ,float d1,float d2, float d3){
        super(ht,ns);
        diem1 =d1;
        diem2 =d2;
        diem3 =d3;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }
    public void input(){
        super.input();
        System.out.print("\t\t\tDiem 1: ");
        diem1 = sc.nextFloat();
        System.out.print("\t\t\tDiem 2: ");
        diem2 = sc.nextFloat();
        System.out.print("\t\t\tDiem 3: ");
        diem3 = sc.nextFloat();
    }
    public void output(){
        super.output();
        System.out.println("\t\t\tDiem 1: " +diem1);
        System.out.println("\t\t\tDiem 2 " +diem2);
        System.out.println("\t\t\tDiem 3: " +diem3);
    }
}

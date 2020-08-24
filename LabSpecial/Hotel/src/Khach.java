public class Khach extends ConNguoi implements Method{
    private int sdt;
    private String email;
    public Khach(){
       super();
       sdt = 0;
       email = null;
    }
    public Khach(String t,int age, int s,String e){
        super(t,age);
        sdt= s;
        email =e;
    }
    @Override
    public void input() {
        System.out.print("\t\t\tNhập tên khách hàng:");
        ten = sc.nextLine();
        System.out.print("\t\t\tNhập số điện thoại :");
        sdt = sc.nextInt();
        System.out.print("\t\t\tNhập tuổi khách hàng:");
        tuoi = sc.nextInt();
        System.out.print("\t\t\tNhập email khách hàng:");
        email = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.println("\t\t\tTên khách hàng:"+ten);
        System.out.println("\t\t\tSố điện thoại :"+sdt);
        System.out.println("\t\t\tTuổi khách hàng:"+tuoi);
        System.out.println("\t\t\tEmail khách hàng:"+email);
    }
}

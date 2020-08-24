public class NVTT extends NhanVien implements Method{
    private String  chucvu;

    NVTT(){
        super();
        chucvu = null;
    }
    NVTT(String t,int age,String ma,String cv){
        super(t,age,ma);
        chucvu =cv;
    }
    @Override
    public void input() {
        super.input();
        sc.nextLine();
        System.out.print("\t\t\tNhập chức vụ nhân viên :");
        chucvu = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("\t\t\tChức vụ nhân viên :"+chucvu);
    }

}

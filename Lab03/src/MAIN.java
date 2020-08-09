
import java.util.ArrayList;
import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        Scanner sc = new Scanner(System.in);
        //Declare
        int choose;
        ArrayList<HANGHOA> KHOHANG = new ArrayList<>();
        //Main
        do {
            showMenu();
            System.out.println("Chon 1 trong cac chuc nang( [1] [2] [3] [4] [5] [6] [7] ) dung [8] de THOAT");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("\n\t-Nhập số lượng mặt hàng cần thêm :");
                    int soLuongMh = sc.nextInt();
                    HANGHOA[] HANGHOA = new HANGHOA[soLuongMh];
                    System.out.println("\t\t\t\n<<<<<<<<<<NHẬP THÔNG TIN CÁC MẶT HÀNG MỚI>>>>>>>>>>\n");
                    for(int i = 0; i < soLuongMh ; i++) {
                        System.out.print("\n( [1]Hàng Điện Máy \t [2]Hàng Thực Phẩm ) Chọn loại hàng : ");
                        int pickup = sc.nextInt();
                        if(pickup == 1){
                            HANGHOA[i] = new HANGDIENMAY();
                        }
                        else if (pickup == 2 ){
                            HANGHOA[i] = new HANGTHUCPHAM();
                        }else{
                            System.err.println("Vui lòng chọn [1] hoặc [2]");
                        }
                        HANGHOA[i].input();
                        KHOHANG.add(HANGHOA[i]);
                    }
                    break;
                case 2:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SACH THÔNG TIN CÁC MẶT HÀNG MỚI>>>>>>>>>>\n");
                    for(int i = 0; i < KHOHANG.size() ; i++) {
                        System.out.println("Hàng Hóa Số "+ (i+1));
                        KHOHANG.get(i).output();
                        System.out.println("------~------~-------~------~-------~------");
                    }
                    break;
                case 3:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SACH THÔNG TIN CÁC MẶT HÀNG THUC PHAM>>>>>>>>>>\n");
                    for(int i =0; i< KHOHANG.size();i++){
                        if(KHOHANG.get(i).getTenhang().equalsIgnoreCase("Keyword")){
                            //-------------
                        }
                    }
                    break;
                case 4:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SACH THÔNG TIN CÁC MẶT HÀNG DIEN MAY>>>>>>>>>>\n");

                    break;
                case 5:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SACH THÔNG TIN CÁC MẶT HÀNG CO GIA TIEN CAO NHAT VA THAP NHAT>>>>>>>>>>\n");
                    int maxIndex = 0, minIndex =0;
                    double maxPrice = KHOHANG.get(0).gia , minPrice = KHOHANG.get(0).gia;
                    for(int i =1 ; i< KHOHANG.size(); i++){
                        if(KHOHANG.get(i).gia > maxPrice){
                            maxIndex = i;
                            maxPrice = KHOHANG.get(i).gia;
                        }
                    }
                    for(int i =1 ; i< KHOHANG.size(); i++){
                        if(KHOHANG.get(i).gia < minPrice){
                            minIndex = i;
                            minPrice = KHOHANG.get(i).gia;
                        }
                    }
                    System.out.print("\nMat Hang co gia cao nhat : " );
                    KHOHANG.get(maxIndex).output();
                    System.out.print("\nMat Hang co gia thap nhat : " );
                    KHOHANG.get(minIndex).output();
                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.printf("\t\t\tTHANK F0R USED,G00DBYE AND SEE Y0U AGAIN !!");
                    break;
            }
        }while (choose != 8);
    }
    static void showMenu() {
        System.out.println("\n\n\n1.Nhap hang hoa can them vao kho: ");
        System.out.println("2.Hien thi thong tin tat cac hang hoa trong kho: ");
        System.out.println("3.Hien thi thong tin hang thuc pham");
        System.out.println("4.Hien thi thong tin hang dien may");
        System.out.println("5.Hien thi hang hoa co gia tien cao nhat va thap nhat : ");
        System.out.println("6.Tim kiem hang hoa theo ten : ");
        System.out.println("7.Sap xep ten theo A-Z:");
        System.out.println("8.Thoat\n");

    }

}


import java.util.*;
public class MAIN {

    public static void main(String[] args) {
        //Introduce
        myIntroduce rem = new myIntroduce();
        rem.Introduce();
        Scanner sc = new Scanner(System.in);
        //Declare
        int choose;
        String keyWord;
        int Count =0;
        HANGHOA HH =new HANGHOA();
        ArrayList<HANGHOA> KHOHANG = new ArrayList<>();
        //Main
        do {
            System.out.println("\n[!] Chương Trình Hiện Tại Có 7 Chức Năng : [1] [2] [3] [4] [5] [6] [7] Dùng [8] để THOÁT ");
            showMenu();
            System.err.print("\t\t\t[*]Chức Năng : ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("\n\t[*] Nhập số lượng mặt hàng cần thêm :");
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
                            System.err.println("(*) Vui lòng chọn [1] hoặc [2]");
                        }
                        HANGHOA[i].input();
                        KHOHANG.add(HANGHOA[i]);
                    }
                    break;
                case 2:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SÁCH THÔNG TIN CÁC MẶT HÀNG MỚI>>>>>>>>>>\n");
                    for(int i = 0; i < KHOHANG.size() ; i++) {

                        System.out.println("[-]Hàng Hóa Số "+ (i+1));
                        KHOHANG.get(i).output();
                        System.out.println("------~------~-------~------~-------~------");
                    }
                    break;
                case 3:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SÁCH SẢN PHẨM TRONG KHO HÀNG THỰC PHẨM>>>>>>>>>>\n");
                    for(int i =0; i< KHOHANG.size();i++){
                        if(KHOHANG.get(i).getTenhang().equalsIgnoreCase("Keyword")){
                            //-------------
                        }
                    }
                    break;
                case 4:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SÁCH SẢN PHẨM TRONG KHO HÀNG ĐIỆN MÁY>>>>>>>>>>\n");

                    break;
                case 5:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SÁCH HÀNG ĐẮT ĐỎ VÀ HÀNG RẺ BÈO>>>>>>>>>>\n");
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
                    System.out.print("\n*Mặt Hàng Có Giá Cao Nhất : " );
                    KHOHANG.get(maxIndex).output();
                    System.out.print("\n*Mặt Hàng Có Giá Thấp Nhất : \n" );
                    KHOHANG.get(minIndex).output();
                    break;
                case 6:

                    System.out.print("\n\t[!] Nhập Tên Sản Phẩm Cần Tìm : ");
                    sc.nextLine();
                    keyWord = sc.nextLine();
                    System.out.println("\n\t\t\t<<<<<<<<<<DANH SÁCH MẶT HÀNG TÌM ĐƯỢC TRONG KHO>>>>>>>>>>\n");
                    for(int i =0; i< KHOHANG.size();i++) {
                        if (KHOHANG.get(i).getTenhang().equalsIgnoreCase(keyWord)) {
                            KHOHANG.get(i).output();
                            System.out.println("------~------~-------~------~-------~------");
                            Count++;
                        }
                    }
                    if(Count == 0 ){
                            System.out.println("\n\t\t\t(*) Không có tên nào trùng khớp với tên bạn vừa nhập !\n");
                    }

                    break;
                case 7:
                    System.out.println("\t\t\t\n<<<<<<<<<<DANH SÁCH HÀNG HÓA ĐÃ ĐƯỢC SẮP XẾP (A -> Z) >>>>>>>>>>\n");
                    Collections.sort(KHOHANG, new Comparator<HANGHOA>() {
                        @Override

                        public int compare(HANGHOA sv1, HANGHOA sv2) {
                            return (sv1.getTenhang().compareTo(sv2.getTenhang()));
                            // đảo danh sách đối thành
                            //return (sv2.hoTen.compareTo(sv1.hoTen));
                        }
                    });
                    for (int i=0; i < KHOHANG.size();i++){
                        KHOHANG.get(i).output();
                        System.out.println("\n------~------~-------~------~-------~------\n");
                    }
                    break;
                case 8:
                    System.out.printf("\t\t\tTHANK F0R USED,G00DBYE AND SEE Y0U AGAIN !!");
                    break;


            }
        }while (choose != 8);
    }
    static void showMenu() {
        System.out.println("\t\t\t|-----------------------------------------------|");
        System.out.println("\t\t\t|\t[1] - Thêm Hàng\t\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[2] - Kho Hàng Tổng \t\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[3] - Kho Hàng Thực Phẩm\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[4] - Kho Hàng Điện Máy\t\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[5] - Sản Phẩm Giá Cao Nhất và Thấp Nhất \t|");
        System.out.println("\t\t\t|\t[6] - Tìm Kiếm \t\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[7] - Sắp Xếp ( A -> Z )\t\t\t\t\t|");
        System.out.println("\t\t\t|\t[8] - THOÁT\t\t\t\t\t\t\t\t\t|");
        System.out.println("\t\t\t|_______________________________________________|");
    }

}


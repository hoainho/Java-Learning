import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SINHVIEN {
    public static void main(String[] args) {
        ArrayList<HOCSINH> StudentList = new ArrayList<>();
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Moi Ban Chon: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.printf("Nhap so sv can them : ");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i = 0 ; i < n ; i ++) {
                        HOCSINH sv = new HOCSINH();
                        sv.input();
                        StudentList.add(sv);
                    }
                    break;
                case 2:
                    System.out.println("\n\t\t--------DANH SACH SINH VIEN-------\n");
                    for(int i=0 ; i< StudentList.size() ; i ++) {
                        StudentList.get(i).output();
                        System.out.println("");
                    }
                    break;
                case 3:
                    int maxIndex =0, minIndex =0;
                    float minMark = StudentList.get(0).averageMark;
                    float maxMark =StudentList.get(0).averageMark;
                    for (int i =1; i< StudentList.size() ; i++){
                        if(StudentList.get(i).averageMark > maxMark){
                            maxIndex = i;
                            maxMark=  StudentList.get(i).averageMark ;
                        }
                    }
                    for (int i =1; i< StudentList.size() ; i++){
                        if(StudentList.get(i).averageMark < minMark){
                            minIndex =i;
                            minMark =StudentList.get(i).averageMark ;
                        }
                    }
                    System.out.println("Sinh Vien Diem Cao Nhat : "  );
                    StudentList.get(maxIndex).output();
                    System.out.println("Sinh Vien Diem Thap Nhat : " );
                    StudentList.get(minIndex).output();


                    break;
                case 4:
                    int count = 0;
                    System.out.print("**********Nhap Ma So Sinh Vien Can Tim :");
                    String rollNoSearch = sc.nextLine();
                     for(int i = 0; i< StudentList.size(); i ++) {
                        if(StudentList.get(i).getRollNo().equalsIgnoreCase(rollNoSearch)){
                            StudentList.get(i).output();
                            count ++;
                            System.out.println("");
                        }
                    }
                     if(count ==0 ){
                         System.out.println("\n-------Khong tim thay sinh vien nao !!\n");
                     }
                    break;
                case 5:
                    System.out.println("**********DANH SACH SINH VIEN SAU KHI SAP XEP :");
                    float temp =0 ;
                    for(int i= 0; i< StudentList.size() -1 ; i++){
                        for(int j =1 ; j < StudentList.size();j++){
                            if ( StudentList.get(i).averageMark < StudentList.get(j).averageMark){
                                StudentList.get(i).averageMark =StudentList.get(j).averageMark;
                                StudentList.get(i).averageMark = temp;
                                temp = StudentList.get(j).averageMark;

                            }
                        }
                    }
                    for(int i =0 ; i < StudentList.size(); i++){
                        StudentList.get(i).output();
                        System.out.println("");
                    }
                    break;
                case 6:
                    System.out.println("DANH SACH SAU KHI SAP XEP A->Z :");
                    Collections.sort(StudentList, new Comparator<HOCSINH>() {
                        @Override
                        public int compare(HOCSINH o1, HOCSINH o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if(cmp >= 0 ){
                                return -1;
                            }   return  1;
                        }
                    });

                    for(int i =0 ; i < StudentList.size(); i++){
                        StudentList.get(i).output();
                        System.out.println("");
                    }

                    break;
                case 7:
                    System.out.printf("\t\t\tG00DBYE, SEE Y0U AGAIN !!");
                    break;
            }
        }while (choose != 7);
    }
        static void showMenu () {
            System.out.println("\n\n\n1.Nhap vao so SV can them : ");
            System.out.println("2.Hien thi thong tin cac sinh vien: ");
            System.out.println("3.Hien thi Sinh Vien diem cao nhat va thap nhat : ");
            System.out.println("4.Tim kiem Sinh Vien : ");
            System.out.println("5.Sap xep ten theo A-Z:");
            System.out.println("6.Cac sinh vien dat hoc bong :");
            System.out.println("7.Thoat\n");
        }
}


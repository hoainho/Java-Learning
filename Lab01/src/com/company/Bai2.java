package com.company;
import java.util.*;
public class Bai2 {
    public static void main(String[] args){
        //Nhap
        Scanner sv = new Scanner(System.in);
        System.out.print("Nhap MSSV: ");
        String masv = sv.nextLine();
        System.out.print("Nhap Ho va Ten SV :");
        String ten = sv.nextLine();
        System.out.print("Nhap tuoi SV :");
        int tuoi = sv.nextInt();
        System.out.print("Nhap Nam Sinh SV :");
        int namsinh = sv.nextInt();
        System.out.print("Nhap Diem TB SV :");
        float diemtb = sv.nextFloat();
        //Xuat
        System.out.println("Thong tin SV la : ");
        System.out.println("MSSV : " + masv);
        System.out.println("Ho va Ten : " + ten);
        System.out.println("Tuoi : " + tuoi);
        System.out.println("Nam sinh : " + namsinh);
        System.out.println("Diem TB : " + diemtb);
    }
}

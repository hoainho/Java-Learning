package com.company;
import java.util.Scanner;
import java.lang.Math;
public class bai4 {
    public static void main(String[] args) {
        System.out.println("Mang phan tu [0][50] :");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dong : ");
        int d = sc.nextInt();
        System.out.print("Nhap so cot : ");
        int c = sc.nextInt();
        int arr2c[][] = new int[d][c];
        //Nhap
        int sum = 0;
        for (int i = 0; i < d; i++) {
            int D = i + 1;
            for (int j = 0; j < c; j++) {
                int C = j + 1;
                System.out.print("A[" + D + "][" + C + "] : ");
                arr2c[i][j] = sc.nextInt();
                sum += arr2c[i][j];
            }
        }
        //Xuat
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2c[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.print("Tong mang la : " + sum);
    };
};



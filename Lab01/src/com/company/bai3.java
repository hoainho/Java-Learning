package com.company;
import java.util.*;
import java.io.*;
public class bai3 {
    public static void main (String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Mang so nguyen : ");
        int sl = numbers.nextInt();
        int arr[] = new int[sl];
        for(int i = 0 ; i < sl ; i++){
                int stt= i +1;
            System.out.print("A["+ stt +"] :");
            arr[i] = numbers.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < sl; i++ ){
            if ( arr[i] > max ){
                max = arr[i];
            }
            if ( arr[i] < min ){
                min = arr[i];
            }
        }
        System.out.println("So lon nhat la : " + max);
        System.out.println("So nho nhat la : " + min);



    }
}

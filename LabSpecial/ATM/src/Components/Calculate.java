package Components;
import Constaint.Money;

import java.util.Scanner;

public class Calculate {
    Scanner sc = new Scanner(System.in);
    private int pullMoney;
    public void inputMoney(){

        Money m = new Money();
        do {
            System.out.print("Nhập Số Tiền Cần Rút : ");
            pullMoney = sc.nextInt();
        }while (pullMoney % m.MUOI != 0);
        int soto500 = pullMoney / m.NAM_TRAM;
        if(pullMoney >= m.NAM_TRAM){
            System.out.println("Mệnh Giá 500.000  :" + soto500);
            pullMoney = pullMoney % m.NAM_TRAM;
        }
        int soto200 = pullMoney / m.HAI_TRAM;
        if(pullMoney  >= m.HAI_TRAM){
            System.out.println("Mệnh Giá 200.000  :" + soto200);
            pullMoney = pullMoney % m.HAI_TRAM;
        }
        int soto100 = pullMoney / m.MOT_TRAM;
        if(pullMoney  >= m.MOT_TRAM){
            System.out.println("Mệnh Giá 100.000  :" + soto100);
            pullMoney = pullMoney % m.MOT_TRAM;
        }
        int soto50 = pullMoney / m.NAM_MUOI;
        if(pullMoney  >= m.NAM_MUOI){
            System.out.println("Mệnh Giá 50.000  :" + soto50);
            pullMoney = pullMoney % m.NAM_MUOI;
        }
        int soto20 = pullMoney / m.HAI_MUOI;
        if(pullMoney  >= m.HAI_MUOI){
            System.out.println("Mệnh Giá 20.000  :" + soto20);
            pullMoney = pullMoney % m.HAI_MUOI;
        }
        int soto10 = pullMoney / m.MUOI;
        if(pullMoney  >= m.MUOI){
            System.out.println("Mệnh Giá 10.000  :" + soto10);
            pullMoney = pullMoney % m.MUOI;
        }
    }
}

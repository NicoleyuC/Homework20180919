//閏年：輸入三個1~3000間的正整數代表西元年，並求該年是平年或閏年。
import java.util.Scanner;

public class hw6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入西元年：");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if (x<=3000 & x>=1 & x%4==0 & x%100!=0 | x%400==0){
            System.out.println("true");
        }else System.out.println("false");
        if (y<=3000 & y>=1 & y%4==0 & y%100!=0 | y%400==0){
            System.out.println("true");
        }else System.out.println("false");
        if (z<=3000 & z>=1 & z%4==0 & z%100!=0 | z%400==0){
            System.out.println("true");
        }else System.out.println("false");
    }

}

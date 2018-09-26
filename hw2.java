// 輸入兩個整數，計算其合、差及乘積

import java.util.Scanner;

public class hw2 {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入 整數 x = ");
        int x = scn.nextInt();
        System.out.print("請輸入 整數 y = ");
        int y = scn.nextInt();

        System.out.println("兩數之合："+ (x+y));
        System.out.println("兩數之差："+ (x-y));
        System.out.println("兩數乘積："+ (x*y));
    }
}

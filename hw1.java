import java.util.Scanner;

//讓使用者輸入一攝氏溫度，輸出相對應的華氏溫度。
public class hw1 {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        float x1 = scn.nextFloat();
        float x2 = x1*9/5+32f;
        x2 = Math.round(x2 * 10)/10f;
        System.out.println(x2);
    }
}

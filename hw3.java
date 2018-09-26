//總成績及平均成績
import java.util.Scanner;

public class hw3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入您的國文成績：");
        int c = sc.nextInt();
        System.out.print("請輸入您的英文成績：");
        int e = sc.nextInt();
        System.out.print("請輸入您的數學成績：");
        int m = sc.nextInt();

        int x = c + e + m;
        int y = (c + e + m)/3;
        System.out.println("您的總成績為："+ x );
        System.out.println("您的各科平均成績為："+ y);

    }

}

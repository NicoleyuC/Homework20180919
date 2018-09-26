// 身高與體重，女人的禁忌
import java.util.Scanner;

public class hw4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入您的身高(公分)：");
        double x = sc.nextFloat();
        System.out.print("請輸入您的體重(公斤)：");
        double y = sc.nextFloat();

        double X = x/2.54;
        double Y = y/0.454;
        X = Math.round(X*10)/10d;
        Y = Math.round(Y*10)/10d;
        System.out.println("您的身高 = "+ X +"吋");
        System.out.println("您的體重 = "+ Y +"磅");

    }
}

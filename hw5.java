import java.util.Scanner;

// 三角形判定：讓使用者輸入三角形三邊長 a,b,c(a<=b<=c),判斷並輸出 a,b,c 是否為合法三邊長
public class hw5 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        System.out.print("請輸入三角形邊長 a ：");
        int a = cn.nextInt();
        System.out.print("請輸入三角形邊長 b ：");
        int b = cn.nextInt();
        System.out.print("請輸入三角形邊長 c ：");
        int c = cn.nextInt();

        if (a>=0 && a<=b && b<=c && a+b>c && a+c>b && b+c>a)
        {
            System.out.println("a,b,c為合法三邊長");
        }else {
            System.out.println("a,b,c為不合法邊長");
        }
    }
}

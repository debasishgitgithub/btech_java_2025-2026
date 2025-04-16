import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter your category");
        System.out.println("1.unskilled\n2.semi-skilled\n3.skilled\n4.highly skilled");
        System.out.println();
        int c = sc.nextInt();
        System.out.println();
        int a = sc.nextInt();
        if (c == 1) {
            System.out.println("total wages:" + a * 257);
        } else if (c == 2) {
            System.out.println("total wages:" + a * 268);
        } else if (c == 3) {
            System.out.println("total wages:" + a * 324);
        } else if (c == 4) {
            System.out.println("total wages:" + a * 369);
        } else {

            System.out.println("invalid choice");
        }
    }
}

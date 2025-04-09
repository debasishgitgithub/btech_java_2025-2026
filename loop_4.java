import java.util.Scanner;

public class loop_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your starting point");
        int start =  sc.nextInt();
        System.out.println("enter your end point");
        int end= sc.nextInt();
        System.out.println("enter the increment");
        int inc= sc.nextInt();


        while (start<=end) {
            System.out.println(start);
            start = start+inc;
        }
       
    }
}

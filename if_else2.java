import java.util.Scanner;

public class if_else2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if (age>=18){
            System.out.println("you're eligible to vote ");
        }else{
            System.out.println("you're not eligible to vote");
        }
    }
}

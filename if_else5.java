import java.util.Scanner;

public class if_else5 {
    public static void main(String[] args) {
        Scanner gh=new Scanner(System.in);
        int choice=gh.nextInt();
        if(choice>=1 && choice<=3){
            System.out.println("first quater");
        }else if (choice>=4 && choice<=6){
            System.out.println("second quarter");
        }else if (choice>=7 && choice<=9){
            System.out.println("third quarter");
        }else if (choice>=10 && choice<=12){
            System.out.println("fourth quater");
        }else{
            System.out.println("invalid");
        }
    }
}

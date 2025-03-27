import java.util.Scanner;

public class if_else3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice= sc.nextInt();
        // choice = m     monday
        // choice = s     sunday
        // choice = t     thursday
        // choice =      invalid choice

        if (choice==1) {
            System.out.println("mobday");
        } else if(choice==2){
            System.out.println("sunday");
        } else if(choice == 3){
            System.out.println("thursday");
        }else{
            System.out.println("invalid choice");

        }
        
        
        
       
    }
}

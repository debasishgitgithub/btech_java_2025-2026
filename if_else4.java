import java.util.Scanner;

public class if_else4 {
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        int choice=sd.nextInt();
        if(choice==1){
            System.out.println("janurary");
        }else if(choice==2){
            System.out.println("feburary");
        }else if (choice==3){
            System.out.println("march");
        }else if (choice==4){
            System.out.println("april");
        }else if (choice==5){
            System.out.println("may");
        }else if (choice==6){
            System.out.println("june");
         }else if (choice==7){
            System.out.println("july");
        }else if (choice==8){
            System.out.println("august");
        }else if (choice==9){
            System.out.println("september");
        }else if (choice==10){
            System.out.println("october");
           }else{
            System.out.println("invlid choice");
           }
        }
    }
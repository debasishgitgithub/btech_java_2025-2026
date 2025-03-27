import java.util.*;
public class adress{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your age ");
        int age = sc.nextInt();
        if (age >= 18 &&  age < 100) {
            System.out.println("you are eligable to vote");
        } else if (age>= 100){
            System.out.println("your time to death ");
        }
         else {
            System.out.println("you are not eligable to vote");
        }
    }
    
}
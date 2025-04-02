import java.util.Scanner;

class switch_1{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String choice=sc.next();
         switch (choice) {
            case "j":
            System.out.println("janaury");
                
                break;
         
                case "f":
                System.out.println("febuary");
                    
                    break;  
            default:
            System.out.println("invalid choice");
                break;
         }
}
}
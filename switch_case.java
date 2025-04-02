import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("enter choice");
        System.out.println();
        String choice = sc.next();

        switch (choice) {
            case "j":
            System.out.println("jan");
                break;
            case "f":
            System.out.println("fab");
                break;
            case "m":
            System.out.println("march");
                break;
            case "a":
            System.out.println("april");
                break;
            case "ma":
            System.out.println("may");
                break;
        
            default:
            System.out.println("invalid choce");
                break;
        }
    }
}
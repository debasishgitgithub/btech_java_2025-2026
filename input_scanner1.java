import java.util.*;

class input_scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int a=sc.nextInt();
		System.out.println("enter the breathh of the rectangle");
		int b=sc.nextInt();
		int area=a*b;
		int perimeter = 2*(a+b);
		String d = sc.nextLine();
		System.out.println("area is = "+area);
		System.out.println("perimeter is = "+perimeter);
	}
}
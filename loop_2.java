import java.util.Scanner;

public class loop_2 {
    public static void main(String[] args) {
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if(i < 5){
                continue;
            }
            System.out.println(i);
        }
    }
}

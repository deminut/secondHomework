package homework.num1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int x;
    Scanner in = new Scanner(System.in);
    System.out.println("Imput num: ");
    x = in.nextInt();
    int check = x*2;
    if (check>20)
        System.out.printf("Your num: %d \n", x);
    if (check<20)
        System.out.printf("Your num: %d \n", -x);
    if (check==20)
        System.out.print("Your num: 0 \n");

    in.close();
    }
}

package homework.num3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число А:");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0;
        int summ = 0;
        System.out.printf("Результат:");
        while (i<num)
        {
            System.out.printf(" " + summ);
            summ+=num;
            i++;
        }

    }
}

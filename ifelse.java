package javabasava.condition;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even mumber:");

        } else {
            System.out.println("odd number:");
        }

    }
}

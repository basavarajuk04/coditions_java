package javabasava.condition;
import java.util.Scanner;

public class nestedif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number x:");
        System.out.println("enter the number y:");
        System.out.println("enter the number z:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x > y) {
            if (y > z)
                System.out.println("X is greater than y and z"); // statement 1
        } else {
            System.out.println("x is lesser than or equal to y"); // statement 2
        }
    }

}

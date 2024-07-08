package javabasava.condition;
import java.util.Scanner;

public class ifelseif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("num is positive");
        } else if (num < 0) {
            System.out.println("num is negitive");
        } else {
            System.out.println("num is zero");
        }
    }
}


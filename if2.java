package javabasava.condition;

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        System.out.println("Enter the number b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a != b) {
            System.out.println("a is not equal to b");
        }
    }
}

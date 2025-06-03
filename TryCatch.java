package Concepts.ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() {
        long start = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        try {
            // int[] arr = new int[4];
            // arr[5] = 34;
            int div = a / b;
            System.out.println("The divisor of " + a + " and " + b + " is " + div);
        } catch (ArithmeticException e) {
            System.out.printf("Arithmetic Exception is : %s\n", e.getMessage());
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken : " + (end - start) + " ms");
    }

}

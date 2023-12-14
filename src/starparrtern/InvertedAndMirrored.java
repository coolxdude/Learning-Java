package starparrtern;

import java.util.Scanner;

public class InvertedAndMirrored {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide the input: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            printWhiteSpaces(n-i);
            printStars(i);
            if (i != n)
                System.out.println();
        }
    }

    private static void printStars(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }

    private static void printWhiteSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }


}

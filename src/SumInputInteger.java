import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SumInputInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        while (t < 5) {
            System.out.println("Round Number: "+ t);
            System.out.print("Provide First Input Int: ");
            int x = scanner.nextInt();
            System.out.print("Provide Second Input Int: ");
            int y = scanner.nextInt();
            int z = x + y;
            System.out.println("Sum of two Int(s): " + z);
            t = t + 1;
        }
//        int x = Integer.parseInt(args[0]);
//        int y = Integer.parseInt(args[1]);
//        int z = x+y;
    }
}

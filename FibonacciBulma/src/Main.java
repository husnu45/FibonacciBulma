import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi kaç eleman içersin ? : ");
        int n = input.nextInt();

        // İlk iki Fibonacci sayısını ayarla
        long a = 0;
        long b = 1;

        // Fibonacci serisini hesaplama
        System.out.println("Fibonacci Serisi:");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            long next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }

        input.close();
    }
}

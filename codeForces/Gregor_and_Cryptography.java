import java.util.Scanner;

public class Gregor_and_Cryptography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            long x = sc.nextLong();
            System.out.println((x-1)/2+" "+(x-1));
        }
    }
}

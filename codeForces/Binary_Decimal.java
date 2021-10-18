import java.util.Arrays;
import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            long x = sc.nextLong();
            char[] arr = String.valueOf(x).toCharArray();
            Arrays.sort(arr);
            System.out.println(arr[arr.length-1]);
        }
    }
}

import java.util.Scanner;

public class Consecutive_Sum_Riddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Long v = sc.nextLong();
            System.out.println(-(v-1)+" "+v);
        }
    }
}

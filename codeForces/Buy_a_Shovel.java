import java.util.Scanner;

public class Buy_a_Shovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price  = sc.nextInt();
        int coin = sc.nextInt();
        int i;
        for (i = 1; i < Integer.MAX_VALUE; i++) {
            int x = i*price;
            int y = (i*price)-coin;

            if (x%10 == 0 || y%10==0){
                break;
            }
        }
        System.out.println(i);

    }
}

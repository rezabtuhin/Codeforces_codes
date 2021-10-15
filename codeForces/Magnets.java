import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        int count = 1;
        int[] str = new int[item];
        for(int i = 0;i<item;i++){
            str[i] = sc.nextInt();
        }
        for(int i = 0;i<item-1;i++){
            if(str[i]!=str[i+1]){
                count++;
            }
        }
        System.out.println(count);

    }
}
import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int counter = 0;
        while(money>0){
            if (money>=100){
                money-=100;
                counter++;
            }
            else if (money>=20){
                money-=20;
                counter++;
            }
            else if (money>=10){
                money-=10;
                counter++;
            }
            else if (money>=5){
                money-=5;
                counter++;
            }
            else {
                money-=1;
                counter++;
            }
        }
        System.out.println(counter);
    }
}

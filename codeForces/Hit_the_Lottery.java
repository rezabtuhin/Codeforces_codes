/*
* @author Rezab Ud Dawla
* created at: 18:02 03/15/2021
 */
import java.util.Scanner;

public class Hit_the_Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int count = 0;
        while(x!=0){
            if(x>=100){
                x -= 100;
                count++;
            }
            else if(x>=20){
                x-=20;
                count++;
            }
            else if(x>=10){
                x-=10;
                count++;
            }
            else if(x>=5){
                x-=5;
                count++;
            }
            else if(x>=1){
                x-=1;
                count++;
            }
        }
        System.out.println(count);
    }
}

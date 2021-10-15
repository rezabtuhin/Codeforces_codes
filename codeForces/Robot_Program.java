/*
* @author Rezab Ud Dawla
 */

import java.util.Scanner;

public class robot_programme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0;i<testCase;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x ==0 && y == 0){
                System.out.println("0");
            }
            else if(x==y){
                System.out.println(x+y);
            }
            else{
                int z = 2*Math.max(x,y) - 1;
                System.out.println(z);
            }
        }
    }
}

package codeForces;

import java.util.Scanner;

public class Problem_231A_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int counter = 0;
        for(int i=0;i<y;i++){
            int x = sc.nextInt();
            int w = sc.nextInt();
            int z = sc.nextInt();
            if((x == 1 && w == 1 && z == 1)||(x == 1 && w == 0 && z == 1)||(x == 0 && w == 1 && z == 1)||(x == 1 && w == 1 && z == 0)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

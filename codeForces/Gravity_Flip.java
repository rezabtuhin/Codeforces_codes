/*
* @author Rezab Ud Dawla
 */

import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int [] cube = new int[col];
        for(int i = 0;i<col;i++){
            cube[i] = sc.nextInt();
        }
        Arrays.sort(cube);
        for(int i = 0;i<col;i++){
            System.out.print(cube[i]+" ");
        }

    }
}

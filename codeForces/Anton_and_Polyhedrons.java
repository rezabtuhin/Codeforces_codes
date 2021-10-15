/*
* @author Rezab Ud Dawla
* created at: 17:14 03/15/2021
 */
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int testCase = sc.nextInt();
        for(int i = 0;i<testCase;i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                count = count+4;
            }
            if(s.equals("Cube")){
                count = count+6;
            }
            if(s.equals("Octahedron")){
                count = count+8;
            }
            if(s.equals("Dodecahedron")){
                count = count+12;
            }
            if(s.equals("Icosahedron")){
                count = count+20;
            }
        }
        System.out.println(count);
    }
}

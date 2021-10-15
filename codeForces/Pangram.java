/*
* @author Rezab Ud Dawla 
* created at: 17:05 03/15/2021
 */
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int x = sc.nextInt();
        String s1 = sc.next();
        String s = s1.toLowerCase();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i = 0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(Character ch:set){
            count++;
        }
        if(count == 26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

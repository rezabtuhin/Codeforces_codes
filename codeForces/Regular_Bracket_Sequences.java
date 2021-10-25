import java.util.Scanner;
import static java.lang.System.*;
public class Regular_Bracket_Sequences {
    public static void main(String[] args) {
        String s = "()()())()))()(()()()(((()()()()()())((((()()()()()";
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        char[] v = s.toCharArray();
        while (testCase!=0){
            int n =sc.nextInt();
            for (int i = 0; i < n ; i++) {
                int left = i+1, right = i+1;
                while (left--!=0){
                    out.print("(");
                }
                while (right--!=0){
                    out.print(")");
                }
                for (int j = 0; j < 2*n-2*(i+1); j++) {
                    if(j%2==0){
                        out.print("(");
                    }
                    else out.print(")");
                }
                out.println();
            }
            testCase--;
        }
    }
}

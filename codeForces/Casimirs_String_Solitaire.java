import java.util.Scanner;

public class Casimirs_String_Solitaire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        while (testCase--!=0){
            String samp = sc.nextLine();
            char[] v = samp.toCharArray();
            int a = 0,b = 0,c = 0;
            for (char value : v) {
                if (value == 'A') {
                    a++;
                } else if (value == 'B') {
                    b++;
                } else {
                    c++;
                }
            }
            if (b<a){
                System.out.println("NO");
            }
            else{
                b-=a;
                if (b==c){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}

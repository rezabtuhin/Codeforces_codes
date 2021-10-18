import java.util.Scanner;

public class cAPS_LOCK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = true;
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i] >= 'a' && c[i]<='z'){
                res = false;
            }
        }

        if (res){
            for (int i = 0; i < c.length; i++) {
                if (c[i] >= 'a' && c[i]<='z'){
                    c[i] = Character.toUpperCase(c[i]);
                }
                else{
                    c[i] = Character.toLowerCase(c[i]);
                }
                System.out.print(c[i]);
            }
        }
        else{
            System.out.println(s);
        }

    }
}

import java.util.*;
public class Odd_Divisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        while(x>0){
            long n = sc.nextLong();
            while(n%2==0)n/=2;
            if(n==1)System.out.println("NO");
            else System.out.println("YES");
            x = x-1;
        }
    }
}
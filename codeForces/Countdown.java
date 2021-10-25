import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase--!=0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int count = 0;
            char[] v = s.toCharArray();
            count = v[v.length-1] -'0';
            for (int i = 0; i < v.length-1; i++) {
                if (v[i] != '0'){
                    count+=v[i]-'0'+1;
                }
            }
            System.out.println(count);
        }
    }
}

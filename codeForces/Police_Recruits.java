import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int[] arr = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            arr[i] = sc.nextInt();
        }
        int val =0, unVal =0;
        for (int i = 0; i < testCase; i++) {
            if(arr[i]>0){
                val+=arr[i];
            }
            else{
                if (val<1){
                    ++unVal;
                }
                else{
                    --val;
                }
            }
        }
        System.out.println(unVal);
    }
}

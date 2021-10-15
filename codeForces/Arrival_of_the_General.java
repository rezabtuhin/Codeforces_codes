import java.util.Scanner;

public class Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int maxVal = Integer.MIN_VALUE, minVal = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = findMax(maxVal,a);
        int maxIndex = findMaxIndex(max,a);
        int min = findMin(minVal,a);
        for (int i = maxIndex; i >0 ; i--) {
            int temp = a[i];
            a[i] = a[i-1];
            a[i-1] = temp;
        }
        int minIndex = findMinIndex(min,a);
        System.out.println(maxIndex+(a.length-minIndex-1));
    }


    static int findMax(int maxVal, int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxVal){
                maxVal = a[i];
            }
        }
        return maxVal;
    }


    static int findMaxIndex(int max, int[] a){
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == max){
                index = i;
                break;
            }
        }
        return index;
    }


    static int findMinIndex(int min,int[] a){
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min){
                index = i;
            }
        }
        return index;
    }


    static int findMin(int minVal, int[] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minVal){
                minVal = a[i];
            }
        }
        return minVal;
    }
}
import java.util.*;
public class Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count1 = 0,count2 = 0,count3 = 0;
        s = s.replace("+", " ");
        char[] c = s.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(c[i] == '1'){
                count1++;
            }
            if(c[i] == '2'){
                count2++;
            }
            if(c[i] == '3'){
                count3++;
            }
        }
        for(int i = 1;i<=count1;i++){
            if(count2 == 0 && count3 == 0 && count1 == 1){
                System.out.print("1");
            }
            
            else if(i == count1 && (count2!=0 || count3!=0)){
                System.out.print("1+");
            }
            else if(i == count1 && count2 == 0 && count3 == 0){
                System.out.print("1");
            }
        
            else{
                System.out.print("1+");
            }
        }
        for(int i = 1;i<=count2;i++){
            if(count1 == 0 && count3 == 0 && count2 == 1){
                System.out.print("2");
            }
            else if(i == count2 && count3!=0){
                System.out.print("2+");
            }
            else if(i == count2 && count3 == 0){
                System.out.print("2");
            }
            else{
                System.out.print("2+");
            }
        }
        for(int i = 1;i<=count3;i++){
            if(count2 == 0 && count1 == 0 && count3 == 1){
                System.out.print("3");
            }
            else if(i == count3){
                System.out.print("3");
            }
            else{
                System.out.print("3+");
            }
        }
    }
}

/*
 * @author Rezab Ud Dawla
 * created at: 09:21 03/16/2021
 */
import java.util.Scanner;

public class New_Year_and_Hurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTime = 0, count = 0;
        int problems = sc.nextInt();
        int timeNeed = sc.nextInt();
        for(int i = 1;i<=problems;i++){
            totalTime = totalTime+i*5;
            if(totalTime+timeNeed>240){
                break;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
    }
}

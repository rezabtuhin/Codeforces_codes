import java.util.Scanner;
 
public class Problem_1030A_In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int totalPeople = sc.nextInt();
        int opinions;
        boolean f = false;
        for(int i = 0;i<totalPeople;i++){
            opinions = sc.nextInt();
            if(opinions == 1){
                f = true;
                break;
            }
        }
        if(f){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}

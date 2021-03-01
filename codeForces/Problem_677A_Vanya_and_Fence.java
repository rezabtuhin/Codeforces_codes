package codeForces;

import java.util.Scanner;

public class Problem_677A_Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfFriend = sc.nextInt();
        int heightOfFence = sc.nextInt();
        int heightOfFriends;
        int totalWidth = 0;
        for(int i = 0;i<noOfFriend;i++){
            heightOfFriends = sc.nextInt();
            if(heightOfFriends>heightOfFence){
                totalWidth = totalWidth+2;
            }
            else{
                totalWidth = totalWidth+1;
            }
        }
        System.out.println(totalWidth);
    }
}

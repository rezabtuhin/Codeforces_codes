package codeForces;

import java.util.Scanner;

public class Problem_467A_George_and_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int living,capacity,roomCount = 0;
        int totalRooms = sc.nextInt();
        for(int i = 0;i<totalRooms;i++){
            living = sc.nextInt();
            capacity = sc.nextInt();
            if(capacity-living>=2){
                roomCount++;
            }
        }
        System.out.println(roomCount);
    }
}

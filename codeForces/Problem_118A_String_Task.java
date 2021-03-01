package codeForces;

import java.util.Scanner;

public class Problem_118A_String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replaceAll("A","");
        str = str.replaceAll("E","");
        str = str.replaceAll("I","");
        str = str.replaceAll("O","");
        str = str.replaceAll("U","");
        str = str.replaceAll("Y","");
        str = str.replaceAll("a","");
        str = str.replaceAll("e","");
        str = str.replaceAll("i","");
        str = str.replaceAll("o","");
        str = str.replaceAll("u","");
        str = str.replaceAll("y","");
        String p = "";
        char[] a = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            if(a[i]<97){
                a[i] = (char)(a[i]+ 'a'-'A');
            }
            p = p + "." + a[i];
        }
        System.out.print(p);
    }
}

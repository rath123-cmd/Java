package Strings;

import java.util.Scanner;

public class Q4 {
    //write a programme to remove the occurrence of a perticular letter
    public static void removeLetter(String s, char target){
        for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) == target) continue;
           else System.out.print(s.charAt(i));
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        char tar = t.charAt(0);
        removeLetter(s,tar);
    }
}

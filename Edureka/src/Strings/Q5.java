package Strings;

import com.sun.security.jgss.GSSUtil;

import javax.swing.*;

public class Q5 {
    //write a programme to see either it is a palindrome or not?
    public static void checkPal(String s){
        int len = s.length();
        char[] arr = s.toCharArray();
        for (int i = 0; i < len/2; i++) {
            if(arr[len-1-i] != s.charAt(i)){
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        String s ="racecars";
        checkPal(s);
    }
}

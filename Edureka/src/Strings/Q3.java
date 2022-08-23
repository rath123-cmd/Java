package Strings;

import java.util.Scanner;

public class Q3 {

    //write a programme to count the frequency of every letter in the sentence
    public static void countLetter(String s){
        s = s.replace(" ","");
        try {
            int count = 0;
            int len = s.length();
            while (len >0) {
                char[] arr = s.toCharArray();
                count = 0;
                for (char a : arr) {
                    if (a == arr[0]) count++;
                }
                if (count > 0) {
                    System.out.println(arr[0] + " : " + count);
                }
                s = s.replace("" + arr[0], "");
                len = s.length();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "i am rathin karmakar";
        str = in.nextLine();
        countLetter(str);
    }
}

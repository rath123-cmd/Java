package Strings;


import java.util.ArrayList;
import java.util.Locale;

// Write a programme to reverse the words of a sentence and not the sentence;
public class Q1 {

    public static void reverseWord(String str){
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = str.length()-1; i >=0 ; i--) {
            arr.add(str.charAt(i));
        }
        for(Character a : arr){
            System.out.print(a);
        }
        System.out.print(" ");
//        String rev = arr.toString();
//        return rev;
    }




    public static void main(String[] args) {
        String str = "Welcome To Edureka";
//        System.out.println(str);
        String[] strArr = str.split(" ");

//        for(String s : strArr){
//            //System.out.print(reverseWord(s)+" ");
//            reverseWord(s);
//        }

    }

}

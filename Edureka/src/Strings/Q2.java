package Strings;

public class Q2 {

    //write a programme to capitalize every letter after a space in a line
    public static void capLetter(String s){
//        char[] arr = s.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            if(i==0){
//                char ele = arr[i];
//                ele-=26;
//                arr[i] = ele;
//            }
//            if(Character.valueOf(arr[i]).equals(" ")){
//
//                i++;
//                char ele = arr[i];
//                ele+=26;
//                arr[i] = ele;
//            }
//        }
//        for(char a : arr){
//            System.out.print(a);
//        }
        String fin ="";
        boolean con = true;
        for (int i = 0; i < s.length(); i++) {
            if(con){
                System.out.print(Character.toUpperCase(s.charAt(i)));
                fin = fin + Character.toString(s.charAt(i));
                con = false;
            }else if(Character.toString(s.charAt(i)).equals(" ")){
                con = true;
                System.out.print(s.charAt(i));
                fin = fin + Character.toString(s.charAt(i));
            }else {
                System.out.print(s.charAt(i));
                fin = fin + Character.toString(s.charAt(i));
            }
        }
        System.out.println("\n"+fin);
    }



    public static void main(String[] args) {
        String str = "welcome to edureka";
        capLetter(str);
    }
}

package File_Handling;
import com.sun.security.jgss.GSSUtil;

import javax.lang.model.element.Name;
import java.io.*;
import java.util.Scanner;

class File_Handling{
    public static void Create_File(String Name){
        String path = "C:\\Users\\RATHIN KARMAKAR\\OneDrive\\Documents\\Java\\Edureka\\" + Name + ".txt";
        File myObj = new File(path);
        try{
            if (myObj.createNewFile()) {
                System.out.println("File created " + myObj.getName());
            } else {
                System.out.println("File Already Exists");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void Chek_All(String Name){
        String path = "C:\\Users\\RATHIN KARMAKAR\\OneDrive\\Documents\\Java\\" + Name + ".txt";
        File myObj = new File(path);
        if (myObj.exists()) {
            System.out.println("File Exists");
            System.out.println("Absolute path "+myObj.getAbsolutePath());
            System.out.println("Writable : "+myObj.canWrite());
            System.out.println("Readable : "+myObj.canRead());
            System.out.println("File size : "+myObj.length());
        }else {
            System.out.println("File does not exists");
        }
    }

    public static void Write_File(String Name){
        String path = "C:\\Users\\RATHIN KARMAKAR\\OneDrive\\Documents\\Java\\" + Name + ".txt";
        File myObj = new File(path);
        Scanner in = new Scanner(System.in);
        try{
            FileWriter fileWriter = new FileWriter(path);
            String text = in.nextLine();
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Writing is successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Read_File(String Name){
        String path = "C:\\Users\\RATHIN KARMAKAR\\OneDrive\\Documents\\Java\\" + Name + ".txt";
        File myObj = new File(path);
        try{
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String content = myReader.nextLine();
                System.out.println(content);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}


public class First {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        File_Handling.Create_File(name);
//        File_Handling.Chek_All(name);
//        File_Handling.Write_File(name);
//        File_Handling.Read_File(name);
    }
}

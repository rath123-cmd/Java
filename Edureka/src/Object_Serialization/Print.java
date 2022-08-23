package Object_Serialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Print {
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Output.txt"));
            Employee e1 = (Employee) in.readObject();
            Employee e3 = (Employee) in.readObject();
            Employee e2 = (Employee) in.readObject();

            System.out.println(e1.name + " " + e1.id);
            System.out.println(e2.name + " " + e2.id);
            System.out.println(e3.name + " " + e3.id);

            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

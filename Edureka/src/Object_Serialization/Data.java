package Object_Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Data {

    

    public static void main(String[] args) {
        Employee e1 = new Employee("Rathin", 100);
        Employee e2 = new Employee("Pritam", 101);
        Employee e3 = new Employee("Medha", 102);

        try{
            FileOutputStream foul = new FileOutputStream("Output.txt");
            ObjectOutputStream oul = new ObjectOutputStream(foul);
            oul.writeObject(e1);
            oul.writeObject(e2);
            oul.writeObject(e3);
            oul.close();

            System.out.println("Serialization and Deserialization is done");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

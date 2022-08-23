package Object_Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;
    public Employee(String name, int id){
        this.name = name;
        this.id = id;

    }
}

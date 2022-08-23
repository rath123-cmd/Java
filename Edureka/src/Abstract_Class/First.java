package Abstract_Class;

import com.sun.tools.attach.AgentLoadException;

public abstract class First {

    private String name;
    private String gender;

    public First(String nm, String gen){
        this.gender = gen;
        this.name = nm;
    }

    public abstract void Studying();

    @Override
    public String toString(){
        return "Name = " + this.name + " gender = " + this.gender;
    }
}

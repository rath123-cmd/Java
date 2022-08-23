package Abstract_Class;

public class Second extends First{
    private int studentID;

    public Second(String nm, String gen, int ID){
        super(nm,gen);
        this.studentID = ID;
    }

    @Override
    public void Studying(){
        if(studentID == 0){
            System.out.println("None Studying");
        }else{
            System.out.println("Persuing B.Tech. in ECE");
        }
    }

    public static void main(String[] args) {
        First f1 = new Second("Rathin","Male",350003);
        f1.Studying();
        System.out.println(f1.toString());
    }
}

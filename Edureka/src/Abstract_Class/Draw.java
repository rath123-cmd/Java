package Abstract_Class;

import org.w3c.dom.ls.LSOutput;

abstract class Shape{
    String objectName = " ";
    Shape(String name){
        this.objectName = name;
    }

    abstract public double area();
    abstract public void draw();

}

class Rectangle extends Shape{
    int length,width;
    Rectangle(int length, int width, String name){
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("Rectangle is drawn");
    }
    public double area(){
        return (double) length*width;
    }

}

class Circle extends Shape{
    int redius;
    Circle(int redius, String name){
        super(name);
        this.redius = redius;
    }

    public void draw(){
        System.out.println("Circle is drawn");
    }
    public double area(){
        return (double) (3.14*redius*redius);
    }
}

public abstract class Draw{
    void print(){
        System.out.println("All done");
    }
}

class has {
    public static void main(String[] args) {
        Shape circle = new Circle(7,"Circle");
        circle.draw();
        System.out.println("Area is "+circle.area()+"\n\n");

        Shape rectangle = new Rectangle(7,9,"Rectangle");
        rectangle.draw();
        System.out.println("Area is "+rectangle.area());
    }
}

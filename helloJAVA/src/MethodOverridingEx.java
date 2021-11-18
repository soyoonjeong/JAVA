class Shape{
    public void draw(){
        System.out.println("Shape");
    }
}
class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
public class MethodOverridingEx {
    static void paint(Shape p){
        p.draw();
    }

    public static void main(String[] args) {
        paint(new Shape());
        paint(new Line()); //오버라이딩된 메소드, Line의 draw() 실행

    }
}

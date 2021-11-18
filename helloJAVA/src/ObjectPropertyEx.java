class Point_two{
    private int x,y;
    public Point_two(int x, int y){
        this.x=x; this.y=y;
    }
}
public class ObjectPropertyEx {
    public static void main(String[] args) {
        Point_two p = new Point_two(4,9);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
    }
}

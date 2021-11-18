class Point_three{
    int x,y;
    public Point_three(int x,int y){
        this.x =x; this.y=y;
    }
    public boolean equals(Object obj){ //
        Point_three p = (Point_three)obj;
        if(x==p.x && y==p.y)
            return true;
        else
            return false;
    }
}
public class EqualsEx {
    public static void main(String[] args) {
        Point_three a= new Point_three(2,3);
        Point_three b = new Point_three(2,3);
        if(a.equals(b))
            System.out.println("good");
    }
}

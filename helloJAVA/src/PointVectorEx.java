import java.util.Vector;
//예제 7-2 Point 클래스의 객체들만 저장하는 벡터 만들기

class Point{
    private int x,y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){ //Object 클래스의 toString() 메소드 오버라이딩
        return "(" + x + "," + y + ")";
    }
}


public class PointVectorEx {
    public static void main(String[] args) {
        Vector<Point> v = new Vector<Point>();
        //3개의 Point 객체 삽입
        v.add(new Point(2,3));
        v.add(new Point(-5,20));
        v.add(new Point(30, -8));

        v.remove(1);

        for(int i =0; i<v.size(); i++){
            Point p = v.get(i);
            System.out.println(p); //p.toString()를 이용하여 객체 p 출력
            // 객체를 단독으로 사용하는 경우 -> 컴파일러에 의해 객체.toString()으로 자동 변환
        }
    }
}

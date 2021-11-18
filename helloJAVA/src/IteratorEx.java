import java.util.Iterator;
import java.util.Vector;
// 예제 7-4 Iterator<Integer>를 이용하여 정수 벡터 검색
public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        Iterator<Integer> it = v.iterator();
        while(it.hasNext()){
            int n = it.next();
            System.out.println(n);
        }
    }
}

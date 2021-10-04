//문제해결및실습:JAVA 과제2 2번문제 20011818 정소윤
interface AdderInterface{
    int add(int x, int y);
    int add(int n);

}
class MyAdder implements AdderInterface{
    public int add(int x, int y){
        return x+y;
    }
    public int add(int n){
        int sum = 0;
        for(int i =1; i<=n; i++)
            sum = add(sum, i);
        return sum;
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        MyAdder adder = new MyAdder();
        System.out.println(adder.add(5,10));
        System.out.println(adder.add(10));
    }
}

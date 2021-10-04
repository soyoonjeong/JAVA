//문제해결및실습:JAVA 과제2 1번문제 20011818 정소윤
import java.util.Scanner;

abstract class Calculator{
    protected int a,b;
    public int run(int a, int b){
        this.a = a;
        this.b = b;
        int res = calc();
        return res;
    }
    abstract protected int calc();
}
class Adder extends Calculator{
    protected int calc(){
        return super.a+super.b;
    }
}
class Subtracter extends Calculator{
    protected int calc(){
        return super.a-super.b;
    }
}
class Multiplier extends Calculator{
    protected int calc(){
        return super.a*super.b;
    }
}
class Divider extends Calculator{
    protected int calc(){
        return super.a/super.b;
    }
}
public class CalcEx {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();
        Multiplier mul = new Multiplier();
        Divider div = new Divider();

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 2개를 입력하세요>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("덧셈 결과는 "+adder.run(a,b));
        System.out.println("뺄셈 결과는 "+sub.run(a,b));
        System.out.println("곱셈 결과는 "+mul.run(a,b));
        System.out.println("나눗셈 결과는 "+div.run(a,b));
    }
}

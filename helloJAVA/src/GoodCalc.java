abstract class Calculator2{
    public abstract int add(int a, int b);
    public abstract int substract(int a, int b);
    public abstract double average(int []a);
}

public class GoodCalc extends Calculator2{
    public int add(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
    public double average(int []a){
        int sum =0;
        for(int k:a)
            sum+=k;
        return sum/a.length;
    }

    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(4,9));
    }
}

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        //ArrayList는 참조형만 사용하기에
        //int형을 Integer 클래스로 감싸는, 참조형인 "Wrapper 클래스"를 사용한다.
        numList.add(2);
        numList.add(0);
        numList.add(0);
        numList.add(0);
        numList.add(4);
        numList.add(9);
        for(int num: numList)
            System.out.print(num); //200049
        System.out.println("");
        numList.remove(0);
        for(int num: numList)
            System.out.print(num); //00049
        System.out.println("");
        numList.remove(0);
        for(int num: numList)
            System.out.print(num);
    }
}

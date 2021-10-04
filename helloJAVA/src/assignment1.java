//문제해결및실습:JAVA 과제1 20011818 정소윤
import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        char week[] = {'일','월','화','수','목','금','토'};
        Scanner scanner = new Scanner(System.in);
        int n=0;
        while(true){
            System.out.print("정수를 입력하세요>> ");
            try{
                n = scanner.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("경고! 정수를 입력하지 않았습니다.");
                scanner.next();
                continue;
            }
            if(n<0)
                break;
            System.out.println(week[n%7]);
        }
        System.out.println("프로그램을 종료합니다.");
    }


}

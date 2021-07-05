import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
//        //사람 선언
//        Person p1 = new Person();
//        p1.name = "정소윤";
//        p1.age = 22;
//        p1.cashAmount = 300000;
//        //계좌 생성
//        BankAccount a1 = new BankAccount();
//        a1.balance = 4000000;
//        //사람, 계좌 연결
//        p1.account = a1;
//        a1.owner = p1;

//        Person p1 = new Person();
//        BankAccount a1 = new BankAccount();
//        p1.setAccount(a1);
//        a1.setOwner(p1);
//        p1.setCashAmount(100000);
//        a1.setBalance(500000);
//
//        System.out.println(a1.deposit(30000));
//        System.out.println(a1.withdraw(170000));
//        System.out.println(a1.deposit(620000));
//        System.out.println(a1.withdraw(890000));

        Person p1 = new Person("김신의", 28);
        p1.setCashAmount(30000);
        Person p2 = new Person("문종모", 25, 100000);

        BankAccount a1 = new BankAccount(p1);
        a1.setBalance(100000);
        p1.setAccount(a1);
        BankAccount a2 = new BankAccount(500000, p2);
        p2.setAccount(a2);

        a2.transfer(a1, 200000);
        a1.transfer(p2, 150000);
        p2.transfer(a1, 270000);
        p1.transfer(p2, 130000);

        // 콘솔 입력 받기(Scanner)
        System.out.println("나이가 어떻게 되시나요?");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println("이름이 어떻게 되시나요?");
        String name = scanner.next();

    }
}

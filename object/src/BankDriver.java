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
        Person p1 = new Person();
        BankAccount a1 = new BankAccount();
        p1.setAccount(a1);
        a1.setOwner(p1);
        p1.setCashAmount(100000);
        a1.setBalance(500000);

        System.out.println(a1.deposit(30000));
        System.out.println(a1.withdraw(170000));
        System.out.println(a1.deposit(620000));
        System.out.println(a1.withdraw(890000));
    }
}

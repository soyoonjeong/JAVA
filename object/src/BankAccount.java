public class BankAccount {
//    int balance;
//    Person owner;
//    boolean deposit(int amount) {
//        if(amount>=0 && owner.cashAmount>=amount){
//            balance+=amount;
//            owner.cashAmount-=amount;
//            System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount+"원");
//            return true;
//        }else {
//            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAmount + "원");
//            return false;
//        }
//    }
//    boolean withdraw(int amount) {
//        if(amount>=0 && amount<=balance){
//            balance-=amount;
//            owner.cashAmount+=amount;
//            System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount+"원");
//            return true;
//        }else{
//            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.cashAmount+"원");
//            return false;
//        }
//    }
    //접근 제어자 : private / public
    //public : 모든 클래스에서 접근 가능
    //private : 처음 선언한 클래스에서만 접근 가능, 메소드를 이용하여 변경, 불러오기
    private int balance;
    private Person owner;

    public void setBalance(int newBalance){
        if(newBalance>=0){
            balance = newBalance;
        }
    }
    public int getBalance(){
        return balance;
    }
    public void setOwner(Person newowner){
        owner = newowner;
    }
    public Person getOwner(){
        return owner;
    }
    boolean deposit(int amount) {
        if(amount>=0 && owner.getCashAmount()>=amount){
            balance+=amount;
            owner.setCashAmount(owner.getCashAmount()-amount);
            System.out.println(amount+"원 입금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            return true;
        }else {
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;
        }
    }
    boolean withdraw(int amount) {
        if(amount>=0 && amount<=balance){
            balance-=amount;
            owner.setCashAmount(owner.getCashAmount()+amount);
            System.out.println(amount+"원 출금하였습니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            return true;
        }else{
            System.out.println("출금 실패입니다. 잔고: "+balance+"원, 현금: "+owner.getCashAmount()+"원");
            return false;
        }
    }
}

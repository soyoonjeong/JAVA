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

    //생성자 : 인스턴스를 만들고, 인스턴스의 속성(인스턴스 변수)들을 초기화시켜줍니다.
    public BankAccount(int pBalance){
        if(pBalance<0){
            balance = 0;
        }else{
            balance = pBalance;
        }
    }
    public BankAccount(Person pOwner){
        owner = pOwner;
        balance = 0;
    }
    public BankAccount(int pBalance, Person pOwner){
        owner = pOwner;
        if(pBalance<0){
            balance = 0;
        }else{
            balance = pBalance;
        }
    }

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
    public boolean deposit(int amount) {
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
    public boolean withdraw(int amount) {
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
    //메소드 오버로딩 : 클래스 내에 같은 이름의 메소드를 2개 이상 정의할 수 있게 해주는 기능
    public boolean transfer(Person to, int amount){
        return owner.transfer(to, amount);
    }
    public boolean transfer(BankAccount to, int amount){
        return owner.transfer(to.owner, amount);
    }
    /*
    public boolean transfer(Person to, int amount) {
        if (amount >= 0 && amount <= balance) {
            balance -= amount;
            to.getAccount().balance += amount;
            System.out.println("true - from: " + (owner.getName()) + ", to: " + (to.getName()) + ", amount: " + amount + ", balance: " + balance);
            return true;
        } else {
            System.out.println("false - from: " + (owner.getName()) + ", to: " + (to.getName()) + ", amount: " + amount + ", balance: " + balance);
            return false;
        }
    }
    public boolean transfer(BankAccount to, int amount){
        if(amount>=0 && amount<=balance){
            balance-=amount;
            to.balance+=amount;
            System.out.println("true - from: "+(owner.getName())+", to: "+(to.owner.getName())+", amount: "+amount+", balance: "+balance);
            return true;
        }else{
            System.out.println("false - from: "+(owner.getName())+", to: "+(to.owner.getName())+", amount: "+amount+", balance: "+balance);
            return false;
        }
    }*/
}

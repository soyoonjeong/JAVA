public class Person {
    //접근 제어자 : private / public
    //public : 모든 클래스에서 접근 가능
    //private : 처음 선언한 클래스에서만 접근 가능, 메소드를 이용하여 변경, 불러오기
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

    //생성자 : 인스턴스를 만들고, 인스턴스의 속성(인스턴스 변수)들을 초기화시켜줍니다.
    public Person(String pName, int pAge, int pCashAmount){
        name = pName;
        if(pAge>=0){
            age = pAge;
        }else{
            age = 12;
        }
        if(pCashAmount<0){
            cashAmount = 0;
        }else{
            cashAmount = pCashAmount;
        }
    }
    public Person(String pName, int pAge){
            name = pName;
            if(pAge>=0){
                age = pAge;
            }else{
                age = 12;
            }
            cashAmount = 0;
    }

    public void setName(String newname){
        name = newname;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newage){
        if(newage>=0){
            age = newage;
        }
    }
    public int getAge(){
        return age;
    }
    public void setCashAmount(int newamount){
        if(newamount>=0){
            cashAmount = newamount;
        }
    }
    public int getCashAmount(){
        return cashAmount;
    }
    public void setAccount(BankAccount newaccount){
        account = newaccount;
    }
    public BankAccount getAccount(){
        return account;
    }

    public boolean transfer(Person to, int amount){
        if(amount>=0 && amount<=account.getBalance()){
            account.setBalance(account.getBalance()-amount);
            to.account.setBalance(to.account.getBalance()+amount);
            System.out.println("true - from: "+(name)+", to: "+(to.name)+", amount: "+amount+", balance: "+account.getBalance());
            return true;
        }else{
            System.out.println("false - from: "+(name)+", to: "+(to.name)+", amount: "+amount+", balance: "+account.getBalance());
            return false;
        }
    }
    //메소드 오버로딩 : 클래스 내에 같은 이름의 메소드를 2개 이상 정의할 수 있게 해주는 기능
    public boolean transfer(BankAccount to, int amount){
        return transfer(to.getOwner(), amount);
    }

    /*
    public boolean transfer(BankAccount to, int amount){
        if(amount>=0 && amount<=account.getBalance()){
            account.setBalance(account.getBalance()-amount);
            to.setBalance(to.getBalance()+amount);
            System.out.println("true - from: "+(name)+", to: "+(to.getOwner().name)+", amount: "+amount+", balance: "+account.getBalance());
            return true;
        }else{
            System.out.println("false - from: "+(name)+", to: "+(to.getOwner().name)+", amount: "+amount+", balance: "+account.getBalance());
            return false;
        }
    }*/
}

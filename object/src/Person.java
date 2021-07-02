public class Person {
    //접근 제어자 : private / public
    //public : 모든 클래스에서 접근 가능
    //private : 처음 선언한 클래스에서만 접근 가능, 메소드를 이용하여 변경, 불러오기
    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;

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
}

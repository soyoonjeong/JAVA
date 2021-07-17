public class Tiger extends Animal implements Predator, Barkable{
    // Animal 클래스를 상속받음
    public String getFood(){
        return "banana";
    }
    public void Bark(){
        System.out.println("으르렁");
    }
}
// 다형성
// tiger는 Tiger 클래스의 객체이고, Animal 클래스의 객체이고,
// Predator, Barkable 인터페이스의 객체이다.
// 따라서 Tiger 클래스의 객체는 다양한 자료형으로 표현할 수 있다.
// Tiger tiger = new Tiger();
// Animal tiger = new Tiger();
// Predator tiger = new Tiger();
// Barkable tiger = new Tiger();

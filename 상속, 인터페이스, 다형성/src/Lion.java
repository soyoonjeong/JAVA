public class Lion extends Animal implements Predator, Barkable{
    // Animal 클래스를 상속받음
    public String getFood(){
        return "apple";
    }
    public void Bark(){
        System.out.println("어흥");
    }
}
// 다형성
// lion는 Lion 클래스의 객체이고, Animal 클래스의 객체이고,
// Predator, Barkable 인터페이스의 객체이다.
// 따라서 Lion 클래스의 객체는 다양한 자료형으로 표현할 수 있다.
// Lion lion = new Lion();
// Animal lion = new Lion();
// Predator lion = new Lion();
// Barkable lion = new Lion();
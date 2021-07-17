public interface Predator {
    public String getFood();
    // 인터페이스의 메소드는 몸통이 없다! -> 인터페이스는 규칙!
}
// 육식동물이 추가될 때마다 사육사 클래스에 새로운 feed 클래스를 추가하는 귀찮음을 없애기 위해
// ZooKeeper 클래스를 육식동물의 종류와 상관없는 독립적인 클래스로 만들기 위해

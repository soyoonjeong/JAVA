
class Person{
    String name;
    String id;

    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
    String grade;
    String department;

    public Student(String name){
        super(name);
    }
}
public class practice {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("정소윤");
        p = s; // 업캐스팅

        System.out.println(p.name);
    }
}

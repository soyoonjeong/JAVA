public class Bouncer {
    public void barkAnimal(Barkable barkable){
        barkable.Bark();
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Bouncer bouncer = new Bouncer();

        bouncer.barkAnimal(lion);
        bouncer.barkAnimal(tiger);
    }
}

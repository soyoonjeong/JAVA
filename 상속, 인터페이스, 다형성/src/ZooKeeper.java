public class ZooKeeper {
    public void feed(Predator predator){
        System.out.println("feed "+predator.getFood());
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        ZooKeeper zookeeper = new ZooKeeper();

        zookeeper.feed(lion);
        zookeeper.feed(tiger);
    }
}

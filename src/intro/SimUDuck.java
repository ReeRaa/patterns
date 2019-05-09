package intro;

public class SimUDuck {
    public static void main(String[] args) {
        Duck d1=new MallardDuck();
        Duck d2=new RedHeadDuck();

        d1.display();
        d1.quack();
        d1.swim();
        d1.fly();
        d2.display();
        d2.quack();
        d2.swim();
        d2.fly();

    }
}

package intro;

public class SimUDuck {
    public static void main(String[] args) {
        MallardDuck d1=new MallardDuck();
        RedHeadDuck d2=new RedHeadDuck();
        RubberDuck d3=new RubberDuck();
        DecoyDuck d4=new DecoyDuck();

        QuackLoudly quackLoudly=new QuackLoudly();
        d1.display();
        d1.performQuack();
        d1.swim();
        d1.performFly();
        System.out.println();
        d2.display();
        d2.performFly();
        d2.swim();
        d2.performQuack();
        System.out.println();
        d3.display();
        d3.performFly();
        d3.performQuack();
        d3.swim();
        System.out.println();
        d4.display();
        d4.performFly();
        d4.performQuack();;
        d4.swim();

    }
}

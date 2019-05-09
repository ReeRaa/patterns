package intro;

public class RedHeadDuck extends Duck{
    public void quack(){
        QuackLoudly quackLoudly=new QuackLoudly();
        quackLoudly.quack();
    }
    @Override
    public void swim(){
        System.out.println("Srrrrrrr");
    }
    @Override
    public void display(){
        System.out.println("This is RedHead duck");
    }

    public void fly(){
        FlyNoWay flyNoWay=new FlyNoWay();
        flyNoWay.fly();
    }
}

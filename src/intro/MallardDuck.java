package intro;

public class MallardDuck extends Duck {

   // public void quack(){
    //    System.out.println("Quaaaaaa");
   // }
   // public void fly(){
 //       System.out.println("Mallard is flying");
   // }

    @Override
    public void swim(){
        System.out.println("Splashhhh");
    }
    @Override
    public void display(){
        System.out.println("This is Mallard duck");
    }

    public void quack(){
        QuackLoudly quackLoudly=new QuackLoudly();
        quackLoudly.quack();
    }
    public  void fly(){
        FlyWithWings flyWithWings=new FlyWithWings();
        flyWithWings.fly();
    }
}

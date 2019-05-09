package intro;

public class MallardDuck extends Duck {

    @Override
    public void quack(){
        System.out.println("Quaaaaaa");
    }

    @Override
    public void swim(){
        System.out.println("Splashhhh");
    }
    @Override
    public void display(){
        System.out.println("This is Mallard duck");
    }
}

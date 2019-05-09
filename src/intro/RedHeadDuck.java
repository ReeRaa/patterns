package intro;

public class RedHeadDuck extends Duck{
    public void quack(){
        System.out.println("Qwerrrrr");
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
        System.out.println("Mallard is flying");
    }
}

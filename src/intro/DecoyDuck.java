package intro;

public class DecoyDuck extends Duck implements Quackable {

    @Override
    public void display(){
        System.out.println("This is Deco-Duck!");
    }
    @Override
    public void quack(){
        System.out.println("Nice voice fo quack");
    }
}

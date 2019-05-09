package intro;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour =new QuackLoudly();
        flyBehaviour =new FlyWithWings();
    }
}

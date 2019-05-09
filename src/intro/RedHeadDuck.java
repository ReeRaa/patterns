package intro;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        flyBehaviour=new FlyWithWings();
        quackBehaviour = new QuackSilently();
    }
}

package intro;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour=new QuackLoudly();
    }

}

package intro;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void swim(){
        System.out.println("I am swimming");
    };
    public void display(){
        System.out.println("I am displaying a duck");
    };
}

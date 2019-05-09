package intro;

public class RubberDuck extends Duck implements Flyable{
    @Override
    public void swim(){
        System.out.println("Swim-time");
    }
    @Override
    public void display(){
        System.out.println("I am rubber-duck");
    }
    public void fly(){
        System.out.println("I am flying rubber-duck");
    }
}

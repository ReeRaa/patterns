package intro;

public class QuackSilently implements QuackBehaviour {
    @Override
    public void quack(){
        System.out.println("This is silent quack");
    }
}

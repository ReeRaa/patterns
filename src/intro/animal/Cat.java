package intro.animal;

public class Cat implements Animal {
    @Override
    public void makeSound(){
        meow();
    }
    private  void meow(){
        System.out.println("Mjauuuu");
    }
}

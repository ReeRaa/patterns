package intro.animal;

import java.util.Random;

public class AllAnimals {
    public static void main(String[] args) {
        Animal doqqy=new Dog();
        Animal cat =new Cat();

        int randomNumber;
        int i=1; //the counter
        Random rnd=new Random();

        do {
            randomNumber=rnd.nextInt(2)+1;
            if (randomNumber==1){
                Animal a=new Dog();
                a.makeSound();
            } else {
                Animal a=new Cat();
                a.makeSound();
            }

            i++;
        } while (i<10);

    }
}

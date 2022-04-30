package abstractKeyword;

public class AbstractRunner {
    public static void main(String[] args) {
        System.out.println("hahaha");
        Animal animal1 = new Animal();
        animal1.bark();
        AbstractDog abc = new AbstractDog() {
            @Override
            public void bark() {

            }
        };
        abc.meow();
    }


}

class Animal extends AbstractDog {
    public void bark() {
        System.out.println("bow bow");
    }

}


abstract class AbstractDog {
    abstract public void bark();
    public void meow() {
        System.out.println("meow meow");
    }
}

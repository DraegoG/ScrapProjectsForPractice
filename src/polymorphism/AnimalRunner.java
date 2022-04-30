package polymorphism;

interface Animal {
    void bark();
}

class Cat implements Animal {
    public void bark() {
        System.out.println("meow meow");
    }
}


class Dog implements Animal {
    public void bark() {
        System.out.println("bow bow");
    }
}


public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for (Animal am : animals) {
            am.bark(); //calling same code, but different behaviour
        }
    }
}

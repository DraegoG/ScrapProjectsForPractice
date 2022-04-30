package lambdas;

public class GreetingRunner {
    public void greeterMethod(Greeting greeting){
        greeting.greet();
    }

    public static void main(String[] args) {
        MorningGreet morningGreet = new MorningGreet();
        GreetingRunner greetingRunner = new GreetingRunner();
        greetingRunner.greeterMethod(morningGreet);
    }
}

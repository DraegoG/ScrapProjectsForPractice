package interfaces;

public interface GamingConsole {
    public void up();
    public void down();
    public void left();
    public void right();
    default public void centre(){
        System.out.println("this is a default method");
    } //the default method in JAVA8 was introduced to solve one issue: If later on we want
    // to add another method in the interface then the classes implementing that interface must all define that method;
}

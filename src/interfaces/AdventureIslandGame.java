package interfaces;

public class AdventureIslandGame implements GamingConsole{

    @Override
    public void up() {
        System.out.println("move character up");
    }

    @Override
    public void down() {
        System.out.println("move character down");
    }

    @Override
    public void left() {
        System.out.println("move character left");
    }

    @Override
    public void right() {
        System.out.println("move character right");
    }

    @Override //default method can also be overridden
    public void centre(){

    }
}

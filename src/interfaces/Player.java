package interfaces;

public class Player {
    public static void main(String[] args){
        GamingConsole game1 = new ContraGame();
        game1.up();
        game1 = new AdventureIslandGame(); //example of polymorphism
        game1.up();
    }
}

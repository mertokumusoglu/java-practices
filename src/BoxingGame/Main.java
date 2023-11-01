package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("fighter1", 15, 100, 89, 20);
        Fighter fighter2 = new Fighter("fighter2", 20, 90, 98, 30);
        Match match = new Match(fighter1,fighter2,80,100);
        match.run();
    }
}

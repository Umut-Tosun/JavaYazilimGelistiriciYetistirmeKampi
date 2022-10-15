package day3.homeWork2.gameProjectDemo;

public abstract class GameCalculator {
    public abstract void calculate();
    public final void gameOver()
    {
        System.out.println("Oyun Bitti.");
    }
}

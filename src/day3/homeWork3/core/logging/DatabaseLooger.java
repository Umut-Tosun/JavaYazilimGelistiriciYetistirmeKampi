package day3.homeWork3.core.logging;

public class DatabaseLooger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println(data+"Database`e loglandı.");
    }
}

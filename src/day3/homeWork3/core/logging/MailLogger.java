package day3.homeWork3.core.logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println(data+"Mail`e loglandı.");
    }
}

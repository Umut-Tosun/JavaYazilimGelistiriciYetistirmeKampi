package day3.core.logging;

public class MailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Mail`e Loglandı : "+data);
    }
}

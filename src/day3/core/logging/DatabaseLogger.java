package day3.core.logging;

public class DatabaseLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Veri tabanı`na loglandı : "+data);
    }
}

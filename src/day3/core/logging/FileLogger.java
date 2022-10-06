package day3.core.logging;

public class FileLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("Dosya`ya loglandı : "+data);
    }
}

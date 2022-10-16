package day3.homeWork3.core.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println(data+"File`a Loglandı.");
    }
}

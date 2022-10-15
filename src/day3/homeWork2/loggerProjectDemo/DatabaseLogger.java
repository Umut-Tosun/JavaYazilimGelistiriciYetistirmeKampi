package day3.homeWork2.loggerProjectDemo;

public class DatabaseLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to database : "+message);
    }
}

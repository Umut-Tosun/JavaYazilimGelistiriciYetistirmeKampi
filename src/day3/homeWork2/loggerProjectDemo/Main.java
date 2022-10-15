package day3.homeWork2.loggerProjectDemo;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new FileLogger(),new ConsoleLogger()};

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log mesajı.");

        for (BaseLogger logger : loggers)
        {
            logger.log("Log Mesajı");
        }

        CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}

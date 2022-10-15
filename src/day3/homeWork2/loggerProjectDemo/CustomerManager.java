package day3.homeWork2.loggerProjectDemo;

public class CustomerManager {
    private BaseLogger _baseLogger;

    public CustomerManager(BaseLogger _baseLogger) {
        this._baseLogger = _baseLogger;
    }

    public void add()
    {
        System.out.println("Müşteri Eklendi");
        this._baseLogger.log("Customer Added successful.");
    }
}

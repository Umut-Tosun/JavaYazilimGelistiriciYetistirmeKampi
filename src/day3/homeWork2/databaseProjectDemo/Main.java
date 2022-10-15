package day3.homeWork2.databaseProjectDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
        customerManager.getCustomers();
    }
}

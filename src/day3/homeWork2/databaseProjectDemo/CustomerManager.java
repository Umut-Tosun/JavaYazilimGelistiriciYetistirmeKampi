package day3.homeWork2.databaseProjectDemo;

public class CustomerManager {
    private BaseDatabaseManager _baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager _baseDatabaseManager) {
        this._baseDatabaseManager = _baseDatabaseManager;
    }

    public void getCustomers(){
        this._baseDatabaseManager.getData();
    }
}

package day3.homeWork2.interfaceProjectDemo;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("My Sql Eklendi");
    }
}

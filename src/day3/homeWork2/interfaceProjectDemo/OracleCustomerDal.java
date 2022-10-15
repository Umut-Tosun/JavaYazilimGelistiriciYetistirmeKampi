package day3.homeWork2.interfaceProjectDemo;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle Eklendi");
    }
}

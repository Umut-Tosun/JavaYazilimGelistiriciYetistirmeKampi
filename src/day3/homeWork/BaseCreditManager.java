package day3.homeWork;

public abstract class BaseCreditManager implements ICreditService {
    @Override
    public abstract void Calculate() ;

    @Override
    public void  Save() {
        System.out.println("Kaydedildi");
    }

}

package day3.homeWork;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditService {
    @Override
    public void Calculate() {
        System.out.println("Asker kredisi hesapladı.");
    }

}

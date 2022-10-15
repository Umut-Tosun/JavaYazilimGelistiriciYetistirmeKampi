package day3.homeWork;

public class TeacherCreditManager extends BaseCreditManager implements ICreditService {
    @Override
    public void Calculate() {
        System.out.println("Öğretmen kredisi hesapladı.");
    }

    @Override
    public void Save() {
        //
        super.Save();
        //
    }
}

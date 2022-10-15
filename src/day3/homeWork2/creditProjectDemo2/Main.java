package day3.homeWork2.creditProjectDemo2;

public class Main {
    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        System.out.println(teacherCreditManager.Calculate(1000));

        BaseCreditManager[] baseCreditManagers = new BaseCreditManager[]{new TeacherCreditManager(), new FarmerCreditManager(),new StudentCreditManager()};

        for (BaseCreditManager creditManager : baseCreditManagers) {
            System.out.println(creditManager.getClass().getCanonicalName()+" :"+creditManager.Calculate(1900));
        }
    }
}

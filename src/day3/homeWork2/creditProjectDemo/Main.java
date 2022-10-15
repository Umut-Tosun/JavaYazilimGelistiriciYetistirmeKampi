package day3.homeWork2.creditProjectDemo;

public class Main {
    public static void main(String[] args) {
        TeacherCreditManager teacherCreditManager = new TeacherCreditManager();
        teacherCreditManager.Calculate();

        CreditUI creditUI = new CreditUI();
        creditUI.CreditCalculate(new TeacherCreditManager());

        MilitaryCreditManager militaryCreditManager = new MilitaryCreditManager();
        militaryCreditManager.Calculate();

        FarmerCreditManager farmerCreditManager = new FarmerCreditManager();
        farmerCreditManager.Calculate();

    }
}

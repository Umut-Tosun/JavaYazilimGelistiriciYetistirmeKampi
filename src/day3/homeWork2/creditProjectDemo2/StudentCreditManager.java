package day3.homeWork2.creditProjectDemo2;

public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double Calculate(double value) {
        return value*1.10;
    }
}

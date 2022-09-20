package Day1.homeWork;

public class Example1 {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;
        int number3=90;
        int maxNumber=number1;

        if (number2>maxNumber) maxNumber=number2;
        if (number3>maxNumber) maxNumber=number3;
        System.out.println("En büyük Sayı : "+maxNumber);
    }
}

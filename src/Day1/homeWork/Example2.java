package Day1.homeWork;

public class Example2 {
    public static void main(String[] args) {
        double[] myList={1.2,1.3,4.5,5.6,7.0};
        double total=0;
        double maxNumber=myList[0];
        double minNumber=myList[0];
        for (double number:myList
             ) {
            if (number>maxNumber) maxNumber=number;
            if (number<minNumber) minNumber=number;
            total+=number;
            System.out.println(number);
        }

        System.out.println("Sayıların Toplamı : "+total);
        System.out.println("En Büyük Sayı : "+maxNumber);
        System.out.println("En Küçük Sayı : "+minNumber);
    }
}

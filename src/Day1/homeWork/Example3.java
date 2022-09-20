package Day1.homeWork;

public class Example3 {
    public static void main(String[] args) {
        int number = 140;
        int remainder = 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) remainder = 0;
        }
        if (remainder == 1) System.out.println(number + " Asal Bir Sayıdır !");
        else System.out.println(number + " Asal Bir Sayı Degildir !");

    }
}

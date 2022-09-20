package Day1.homeWork;

public class Example5 {
    public static void main(String[] args) {
        int number=28,total=0;
        for (int i = 1; i < number; i++) {
            if (number%i==0)total+=i;
        }
        if (total==number) System.out.println(number+" Mükemmel Bir Sayıdır !");
        else System.out.println(number+" Mükemmel Bir Sayı Degildir!");
    }
}

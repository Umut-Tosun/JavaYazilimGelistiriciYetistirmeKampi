package day1.homework;

public class Example7 {
    public static void main(String[] args) {
        int []numbers=new int []{5,7,8,9,6};
        int findNumber=5;
        boolean isHave=false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==findNumber)isHave=true;
        }
        if (isHave) System.out.println("Sayı dizide var");
        else System.out.println("Sayı dizide yok");
    }
}

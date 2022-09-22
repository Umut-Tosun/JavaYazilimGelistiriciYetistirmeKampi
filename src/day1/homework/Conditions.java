package day1.homework;

public class Conditions {
    public static void main(String[] args) {
        int numberOne=50;
        int numberTwo=50;

        if (numberOne>numberTwo)
            System.out.println("Sayı 1 Sayı 2`den Büyüktür!");
        else if (numberOne<numberTwo)
            System.out.println("Sayı 2 Sayı 1`den Büyüktür!");
        else
            System.out.println("Sayı 1 ve Sayı 2 Birbirine Eşittir !");

        int age=10;
        int militaryAge=20;

        if (age>=militaryAge)
            System.out.println("Askerlik Yaşın Geldi Evlat!");
        else
            System.out.println("Askerlik Şartları Saglanmıyor!");

        System.out.println(age>=militaryAge?"Askerlik Yaşın Geldi Evlat!":"Askerlik Şartları Saglanmıyor!");
    }
}

package day1;

public class Main {
    //main javada başlangıç noktasıdır.
    public static void main(String[] args) {
        System.out.println("(2022) Java Yazılım Geliştirici Yetiştirme Kampı 1 : Başlıyoruz!");

        //Değişken isimlendirmeleri java`da camelCase yazılır.
        String name="Umut";
        String surName="Tosun";
        int age=18;
        double tall=172.5;
        boolean isStudent=true;
        String studentNumber="";

        if (isStudent)
            studentNumber="6776ABC332";
        else
            studentNumber="null";

        System.out.println("Ad : "+name+" Soyad : "+surName+" Yaş : "+age+" Boy : "+tall+" Öğrencilik Durumu : "+isStudent+" Öğgrenci No : "+studentNumber);


    }
}
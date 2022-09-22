package day1.homework;

public class Strings {
    public static void main(String[] args) {
        String message = "20 Eylül 2022";

        System.out.println("Mesaj Eleman Sayıs : " + message.length());
        System.out.println("Mesaj 5.Eleman : " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın !"));

        System.out.println(message.startsWith("2"));
        System.out.println(message.endsWith("2"));

        char[] chracters = new char[5];

        message.getChars(0, 5, chracters, 0);
        System.out.println(chracters);
        System.out.println(message.indexOf("20"));
        System.out.println(message.lastIndexOf("2022"));

        System.out.println(message.replace(" ", "-"));
        System.out.println(message.substring(2, 5));

        for (String str : message.split(" "))
        {
        System.out.println(str);

        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());


    }
}

package day1.homework;

public class Example4 {
    public static void main(String[] args) {
        char letter='B';
        switch (letter)
        {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce Sesli Harf");
                break;
            default:
                System.out.println("Sesli bir harf degil");



        }
    }
}

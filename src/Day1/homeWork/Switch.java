package Day1.homeWork;

public class Switch {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Sonuç : Mükkemel Geçtiniz !");
                break;
            case 'B':
                System.out.println("Sonuç : Çok İyi Geçtiniz !");
                break;
            case 'C':
                System.out.println("Sonuç : İyi Geçtiniz !");
                break;
            case 'D':
                System.out.println("Sonuç : Fena Degil Geçtiniz !");
                break;
            case 'F':
                System.out.println("Sonuç : Malesef Kaldınız !");
                break;
            default:
                System.out.println("Geçersit Not Girildi ! Error Code 404 ");

        }

    }
}



package day2.homework;

public class Methods2 {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);
        System.out.println("Sayıların Toplamı : "+gather(5,25));
        System.out.println("Ülke : "+getCountry());
        int total=gather2(4,5,6,7,8,6,5,3,4,6,7,3,1,2,3,4,5,8);
        System.out.println(total);
    }

    public static void add() {
        System.out.println("Eklendi");
    }

    public static void delete() {
        System.out.println("Silindi");
    }

    public static void update() {
        System.out.println("Güncellendi");
    }

    public static int gather(int number, int number2)
    {
        return number+number2;
    }
    public static int gather2(int... sayilar)
    {
        int total=0;
        for (int number:sayilar
             ) {
            total+=number;

        }
        return total;
    }
    public static String getCountry()
    {
        return "Turkiye";
    }
}

package Day1.homeWork;

public class Variables {
    public static void main(String[] args) {
        System.out.println("\n**************************************\n");

        System.out.println("--> Java`da Değişkenler <--");

        int studentID = 1;
        String studentName = "Umut";
        String studentSurName = "Tosun";

        System.out.println("Öğrenci ID : "+studentID);
        System.out.println("Öğrenci Adı : "+studentName);
        System.out.println("Öğrenci Soyadı : "+studentSurName);

        System.out.println("\n**************************************\n");

        int number =9;
        System.out.println("Before | Number : "+number);
        number-=number;
        System.out.println("After | Number : "+number);

        System.out.println("\n**************************************\n");

        boolean isRead=false;
        System.out.println("Kitap Okundu mu ? : "+isRead);
        isRead=true;
        System.out.println("Kitap Okundu mu ? : "+isRead);

        System.out.println("\n**************************************\n");

        String message="Java programlama dili oop tabanlıdır";
        System.out.println("Java Hakkında : "+message);

        System.out.println("\n**************************************\n");
    }
}

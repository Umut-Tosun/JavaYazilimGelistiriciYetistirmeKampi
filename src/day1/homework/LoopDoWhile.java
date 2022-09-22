package day1.homework;

public class LoopDoWhile {
    public static void main(String[] args) {
        boolean isLive=true;
        do {
            System.out.println("Yaşıyorsun Kardeş");
        }while (!isLive);
        {
            System.out.println("Yaşıyorsun Kardeş");
            isLive=false;
        }
    }
}

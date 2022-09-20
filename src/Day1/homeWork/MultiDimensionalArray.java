package Day1.homeWork;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] array4 = new int[][]{{8, 3, 5, 1}, {4, 7, 6, 2}};
        System.out.println(array4[0].length);
        System.out.println(array4[1].length);


        String[][] sehirler = new String[3][5];

        System.out.println(sehirler.length); //satır sayısı
        System.out.println(sehirler[0].length); //sutün sayısı

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";

        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";

        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlı Urfa";
        sehirler[2][2] = "Gazi Antep";

        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < sehirler[i].length; j++) {
                if (sehirler[i][j] == null) continue;
                System.out.println(sehirler[i][j]);

            }
        }


    }
}

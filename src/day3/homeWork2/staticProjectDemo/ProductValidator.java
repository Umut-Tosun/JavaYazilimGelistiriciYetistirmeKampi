package day3.homeWork2.staticProjectDemo;

public class ProductValidator {
    public ProductValidator() {
        System.out.println("Yapıcı bloklar new lenmeden çalışmaz (c# ta çalışır)");
    }

    static {
        System.out.println("Static için yapıcı blok");
    }

    //inner class
    public static class someClass {
        public static void delete() {

        }
    }

    public static boolean isValid(Product product) {
        if (product.unitPrice > 0 && !product.name.isEmpty())
            return true;

        return false;
    }
}

package day3.homeWork2.staticProjectDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.id=1;
        product.name="Masa";
        product.unitPrice=567;

        productManager.add(product);

        //bu yapı çok önerilmiyor //solide aykırı
        DatabaseHelper.crud.delete();
        DatabaseHelper.connection.createConnection();
    }
}

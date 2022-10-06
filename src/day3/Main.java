package day3;

import day3.business.ProductManager;
import day3.core.logging.DatabaseLogger;
import day3.core.logging.FileLogger;
import day3.core.logging.ILogger;
import day3.core.logging.MailLogger;
import day3.dataAccess.JdbcProductDao;
import day3.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        ILogger [] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        Product product = new Product(1,"Iphone Xr",10000);
        Product product2 = new Product(1,"Saka Tekli Maden Suyu",11);
        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);

        productManager.add(product);
        productManager.add(product2);


    }
}

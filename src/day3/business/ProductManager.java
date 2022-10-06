package day3.business;

import day3.core.logging.ILogger;
import day3.dataAccess.IProductDao;
import day3.entities.Product;

import java.util.List;

public class ProductManager {
    private IProductDao productDao;
    private ILogger[] loggers;

    public ProductManager(IProductDao productDao,ILogger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception {
        // iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }

        for (ILogger logger:loggers) { //[db,mail,file]
            logger.log(product.getName());
        }

        productDao.add(product);
    }
}

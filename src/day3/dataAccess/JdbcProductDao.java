package day3.dataAccess;

import day3.entities.Product;

public class JdbcProductDao implements IProductDao{ //dataAccessObject .net tarafında dataAccessLayer

    public void add(Product product) {
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}


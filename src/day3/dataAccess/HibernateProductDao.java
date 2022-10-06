package day3.dataAccess;

import day3.entities.Product;

public class HibernateProductDao  implements IProductDao {
    public void add(Product product) {
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}

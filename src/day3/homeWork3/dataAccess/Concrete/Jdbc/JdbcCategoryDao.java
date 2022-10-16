package day3.homeWork3.dataAccess.Concrete.Jdbc;

import day3.homeWork3.dataAccess.Abstract.ICategoryDao;
import day3.homeWork3.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategori Jdbc ile veritabanına eklendi");
    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public void update(Category category) {

    }
}

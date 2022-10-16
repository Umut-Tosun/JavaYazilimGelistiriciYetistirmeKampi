package day3.homeWork3.dataAccess.Concrete.Hibernate;


import day3.homeWork3.dataAccess.Abstract.ICategoryDao;
import day3.homeWork3.entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public void update(Category category) {

    }
}

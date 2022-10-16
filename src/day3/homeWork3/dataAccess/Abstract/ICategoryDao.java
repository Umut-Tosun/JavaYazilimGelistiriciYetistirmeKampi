package day3.homeWork3.dataAccess.Abstract;

import day3.homeWork3.entities.Category;

public interface ICategoryDao {
    void add(Category category);

    void delete(Category category);

    void update(Category category);
}

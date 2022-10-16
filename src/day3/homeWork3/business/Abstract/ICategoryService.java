package day3.homeWork3.business.Abstract;

import day3.homeWork3.entities.Category;

public interface ICategoryService {
    void add(Category category) throws Exception;
    void delete(Category category);
    void update(Category category);
}

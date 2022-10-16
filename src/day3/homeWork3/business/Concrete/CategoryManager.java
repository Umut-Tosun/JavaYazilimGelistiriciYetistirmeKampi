package day3.homeWork3.business.Concrete;


import day3.homeWork3.business.Abstract.ICategoryService;
import day3.homeWork3.core.logging.ILogger;
import day3.homeWork3.dataAccess.Abstract.ICategoryDao;
import day3.homeWork3.entities.Category;


public class CategoryManager  implements ICategoryService {
    private ICategoryDao categoryDao;
    private ILogger[] loggers;
    private Category[] categories;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers,Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories=categories;
    }

    public void add(Category category) throws Exception{
        for (Category item:categories)
        {
            if (item.getName().equals(category.getName()))
                throw new Exception("Bu kategori adında zaten bir kategori var ");
        }

        for (ILogger logger:loggers) { //[db,mail,file]
            logger.log(category.getName());
        }

        categoryDao.add(category);
    }

    @Override
    public void delete(Category category) {

    }

    @Override
    public void update(Category category) {

    }
}

package day3.homeWork3;

import day3.homeWork3.business.Concrete.CategoryManager;
import day3.homeWork3.business.Concrete.CourseManager;
import day3.homeWork3.core.logging.DatabaseLooger;
import day3.homeWork3.core.logging.FileLogger;
import day3.homeWork3.core.logging.ILogger;
import day3.homeWork3.dataAccess.Concrete.Hibernate.HibernateCategoryDao;
import day3.homeWork3.dataAccess.Concrete.Jdbc.JdbcCourseDao;
import day3.homeWork3.entities.Category;
import day3.homeWork3.entities.Course;
import day3.homeWork3.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Category category = new Category(1, "Web", true);
        Category category2 = new Category(2, "Android", true);
        Category category3 = new Category(3, "Veri", true);

        Instructor instructor = new Instructor(1, "Umut", "Tosun", 18);

        Course course = new Course(1, "Html Css Dersleri", "Web egitimi", "test.png", instructor, category, 0);
        Course course2 = new Course(2, "Kotlin temelleri", "Android eğitimi", "test2.png", instructor, category2, 0);
        Course course3 = new Course(3, "Sql temelleri", "Sql egitimi", "test3.png", instructor, category3, 0);

        Category[] categories = new Category[]{category, category2, category3};
        Course[] courses = new Course[]{course, course2, course3};
        ILogger[] loggers = {new FileLogger(), new DatabaseLooger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);

        Category category4 = new Category(4, "OOP", true);
        categoryManager.add(category4);
        Category category5 = new Category(5, "Android", true);
        //categoryManager.add(category5); burada program hata yolluyor name error

        Course course4 = new Course(4, "Sql temelleri", "Sql egitimi", "test4.png", instructor, category3, 0);
        // courseManager.add(course4); burada hata yolluyor name error

        Course course5 = new Course(5, "Sql temelleri2", "Sql egitimi2", "test5.png", instructor, category3, -5);
        //courseManager.add(course5); burada hata yolluyor price error

    }
}

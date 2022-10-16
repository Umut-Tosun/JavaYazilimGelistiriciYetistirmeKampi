package day3.homeWork3.dataAccess.Concrete.Hibernate;

import day3.homeWork3.dataAccess.Abstract.ICourseDao;
import day3.homeWork3.entities.Course;

public class HibernateCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Hibernate ile veritabanına eklendi");
    }

    @Override
    public void delete(Course course) {

    }

    @Override
    public void update(Course course) {

    }
}

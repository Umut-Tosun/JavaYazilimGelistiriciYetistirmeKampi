package day3.homeWork3.dataAccess.Concrete.Jdbc;

import day3.homeWork3.dataAccess.Abstract.ICourseDao;
import day3.homeWork3.entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Kurs Jdbc ile veritabanına eklendi");
    }

    @Override
    public void delete(Course course) {

    }

    @Override
    public void update(Course course) {

    }
}

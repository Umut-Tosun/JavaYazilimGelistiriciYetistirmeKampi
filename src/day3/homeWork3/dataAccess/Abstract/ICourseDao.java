package day3.homeWork3.dataAccess.Abstract;

import day3.homeWork3.entities.Course;

public interface ICourseDao {
    void add(Course course);

    void delete(Course course);

    void update(Course course);
}

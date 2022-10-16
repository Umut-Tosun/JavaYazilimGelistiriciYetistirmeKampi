package day3.homeWork3.business.Abstract;

import day3.homeWork3.entities.Course;

public interface ICourseService {
    void add(Course course) throws Exception;
    void delete(Course course);
    void update(Course  course);
}

package day3.homeWork3.dataAccess.Abstract;

import day3.homeWork3.entities.Instructor;

public interface IInstructorDao {
    void add(Instructor instructor);

    void delete(Instructor instructor);

    void update(Instructor instructor);
}

package day3.homeWork3.business.Abstract;

import day3.homeWork3.entities.Instructor;

public interface IInstructorService {
    void add(Instructor instructor);
    void delete(Instructor instructor);
    void update(Instructor instructor);
}

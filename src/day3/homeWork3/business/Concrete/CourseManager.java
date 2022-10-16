package day3.homeWork3.business.Concrete;

import day3.homeWork3.business.Abstract.ICourseService;
import day3.homeWork3.core.logging.ILogger;
import day3.homeWork3.dataAccess.Abstract.ICourseDao;
import day3.homeWork3.entities.Category;
import day3.homeWork3.entities.Course;

public class CourseManager implements ICourseService {
    private ICourseDao courseDao;
    private ILogger[] loggers;
    private Course[] courses;

    public CourseManager(ICourseDao categoryDao, ILogger[] loggers, Course[] courses) {
        this.courseDao = categoryDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    @Override
    public void add(Course course) throws Exception{
        for (Course item:courses)
        {
            if (item.getName().equals(course.getName()))
                throw new Exception("Bu kurs adında zaten bir kurs var ");

        }
        if (course.getPrice()<0)
            throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz");

        for (ILogger logger:loggers) { //[db,mail,file]
            logger.log(course.getName());
        }

        courseDao.add(course);
    }

    @Override
    public void delete(Course course) {

    }

    @Override
    public void update(Course course) {

    }
}

package com.alkeshgupta.cruddemo.dao;

import com.alkeshgupta.cruddemo.entity.Course;
import com.alkeshgupta.cruddemo.entity.Instructor;
import com.alkeshgupta.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {
    void save (Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void update(Course course);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);

    void save(Course theCourse);

    Course findCourseAndReviewsByCourseId(int theId);
}

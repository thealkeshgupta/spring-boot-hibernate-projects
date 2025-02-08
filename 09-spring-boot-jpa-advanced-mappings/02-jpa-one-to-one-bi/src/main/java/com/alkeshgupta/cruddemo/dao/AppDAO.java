package com.alkeshgupta.cruddemo.dao;

import com.alkeshgupta.cruddemo.entity.Instructor;
import com.alkeshgupta.cruddemo.entity.InstructorDetail;

public interface AppDAO {
    void save (Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);
}

package com.alkeshgupta.cruddemo.dao;

import com.alkeshgupta.cruddemo.entity.Instructor;

public interface AppDAO {
    void save (Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
}

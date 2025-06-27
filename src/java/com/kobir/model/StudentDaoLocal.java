/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kobir.model;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author s.k dear
 */
@Local
public interface StudentDaoLocal {

    void addStudent(Student student);

    void editStudent(Student parameter);


    Student getStudent(int studentId);

    List<Student> getAllStudents();

    public void deleteStudent(String studentId);
   
    
}

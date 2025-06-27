
package com.kobir.model;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class StudentDao implements StudentDaoLocal {
    @PersistenceContext
    private EntityManager em;
    

    @Override
    public void addStudent(Student student) {
       em.persist(student);
    }



    @Override
    public void editStudent(Student parameter) {
        em.merge(parameter);
    }


    @Override
    public Student getStudent(int studentId) {
        
        return em.find(Student.class, this);
    }
    
    public List<Student> getAllStudents() {
        return em.createNamedQuery("Student.getAll").getResultList();
    }

    @Override
    public void deleteStudent(String studentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student =new Student("Manju","S","manju@gmail.com");
        Student student1 =new Student("Ajay","Z","ajay@gmail.com");
        //passing value in parameterized constructor
        studentDao.saveStudent(student);
        studentDao.saveStudent(student1);
        
        // test updateStudent
        student.setFirstName("Manju");
        studentDao.updateStudent(student);
        
        // test getStudentById
        //Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        students.forEach(student2 -> System.out.println(student2.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteStudent
        studentDao.deleteStudent(2);

    }
    }




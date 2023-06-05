/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.mapper;

import com.imaliarosyida.studentsmartdisciplinewebapp.dto.StudentDto;
import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Student;

/**
 *
 * @author Windows10
 */
public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student){
        StudentDto studentDto = StudentDto.builder()
                .nim(student.getNim())
                .name(student.getName())
                .studentClass(student.getStudentClass())
                .numGeneration(student.getNumGeneration())
                .build();
        return studentDto;
    }
    
    public static Student mapToStudent(StudentDto studentDto){
        Student student = Student.builder()
                .nim(studentDto.getNim())
                .name(studentDto.getName())
                .studentClass(studentDto.getStudentClass())
                .numGeneration(studentDto.getNumGeneration())
                .build();
        return student;
    }
}

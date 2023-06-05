/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.service;

import com.imaliarosyida.studentsmartdisciplinewebapp.dto.StudentDto;
import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Student;
import com.imaliarosyida.studentsmartdisciplinewebapp.mapper.StudentMapper;
import com.imaliarosyida.studentsmartdisciplinewebapp.repository.StudentRepository;

/**
 *
 * @author Windows10
 */
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    
    @Override    
    public void perbaruiProfilStudent(StudentDto studentDto){
        Student student = StudentMapper.mapToStudent(studentDto);
        this.studentRepository.save(student);
    }
    @Override
    public void simpanProfilStudent(StudentDto studentDto){
        Student student = StudentMapper.mapToStudent(studentDto);
        //System.out.println(student)
        studentRepository.save(student);
    }
}

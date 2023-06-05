/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.repository;

import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Windows10
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
    // contoh method absract baru.
    Optional<Student> findByNim(String nim);
}
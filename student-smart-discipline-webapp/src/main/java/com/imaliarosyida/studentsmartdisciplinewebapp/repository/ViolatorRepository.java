/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.repository;

import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Violator;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Windows10
 */
public interface ViolatorRepository extends JpaRepository<Violator, Long>{
    // contoh method absract baru.
    Optional<Violator> findByNim(String nim);
}

//Komentar di atas perlu ditanyakan isinya apa aja di slide
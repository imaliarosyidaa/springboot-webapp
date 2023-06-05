/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.entity;

import jakarta.persistence.*;
//hibernate
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author Windows10
 */
@Setter
@Getter
@AllArgsConstructor
@Builder
@Entity //akan menjadi bin
@Table(name="tbl_student") //membuuat database secara otomatis
public class Violator{
    public Violator(){
        
    }
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long nim;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private String typeOfOffence;
        @Column(nullable = false)
        private int date;
        @Column(nullable = false)
        private int badgeStatus;
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.entity;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 *
 * @author Imalia Rosyida
 */
@Setter
@Getter
@AllArgsConstructor
@Builder
@Entity
@Table(name="students")
public class Student {
    public Student(){
    }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long nim;
        @Column(nullable = false)
        private String name;
        @Column(nullable = false)
        private String studentClass;
        @Column(nullable = false)
        private int numGeneration;
}

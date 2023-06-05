/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.dto;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder; // Builder Pattern
import lombok.Data;
import lombok.NoArgsConstructor; 
/**
 *
 * @author Windows10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
        @NotEmpty(message = "NIM should not be empty")
        private Long nim;
        @NotEmpty(message = "Name should not be empty")
        private String name;
        @NotEmpty(message = "Student Class should not be empty")
        private String studentClass;
        @NotEmpty(message = "Number of Generation should not be empty")
        private int numGeneration;
}

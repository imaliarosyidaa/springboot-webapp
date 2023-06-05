/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
public class AdministratorDto {
    private Long id;
        @NotEmpty(message = "Id should not be empty")
        private String name;
        @NotEmpty(message = "Username should not be empty")
        private String username;
        @NotEmpty(message = "Password should not be empty")
        private int password;
}

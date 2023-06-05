/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.mapper;

import com.imaliarosyida.studentsmartdisciplinewebapp.dto.AdministratorDto;
import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Administrator;

/**
 *
 * @author Windows10
 */
public class AdministratorMapper {
    public static AdministratorDto mapToAdminstratorDto(Administrator administrator){
    AdministratorDto administratorDto = AdministratorDto.builder()
                .id(administrator.getId())
                .name(administrator.getName())
                .username(administrator.getUsername())
                .password(administrator.getPassword())
                .build();
        return administratorDto;
    }
    
    public static Administrator mapToAdminstrator(AdministratorDto administratorDto){
    Administrator administrator = Administrator.builder()
                .id(administratorDto.getId())
                .name(administratorDto.getName())
                .username(administratorDto.getUsername())
                .password(administratorDto.getPassword())
                .build();
        return administrator;
    }
}

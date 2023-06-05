/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.mapper;

import com.imaliarosyida.studentsmartdisciplinewebapp.dto.ViolatorDto;
import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Violator;

/**
 *
 * @author Windows10
 */
public class ViolatorMapper {
    public static ViolatorDto mapToViolatorDto(Violator violator){
        ViolatorDto violatorDto = ViolatorDto.builder()
                .nim(violator.getNim())
                .name(violator.getName())
                .typeOfOffence(violator.getTypeOfOffence())
                .badgeStatus(violator.getBadgeStatus())
                .build();
        return violatorDto;
    }
    
    public static Violator mapToViolator(ViolatorDto violatorDto){
        Violator violator = Violator.builder()
                .nim(violatorDto.getNim())
                .name(violatorDto.getName())
                .typeOfOffence(violatorDto.getTypeOfOffence())
                .badgeStatus(violatorDto.getBadgeStatus())
                .build();
        return violator;
    }
}

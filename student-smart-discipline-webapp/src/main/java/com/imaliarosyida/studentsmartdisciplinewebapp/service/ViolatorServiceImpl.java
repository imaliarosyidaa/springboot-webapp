/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.service;

import com.imaliarosyida.studentsmartdisciplinewebapp.dto.ViolatorDto;
import com.imaliarosyida.studentsmartdisciplinewebapp.entity.Violator;
import com.imaliarosyida.studentsmartdisciplinewebapp.mapper.ViolatorMapper;
import com.imaliarosyida.studentsmartdisciplinewebapp.repository.ViolatorRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Windows10
 */
public class ViolatorServiceImpl implements ViolatorService{
    private final ViolatorRepository violatorRepository;
    
    @Autowired
    public ViolatorServiceImpl(ViolatorRepository violatorRepository){
        this.violatorRepository = violatorRepository;
    }
    
    @Override
    public List<ViolatorDto>ambilDaftarViolator(){
        List<Violator> violators = this.violatorRepository.findAll();
        List<ViolatorDto> violatorDtos = violators.stream()
                .map((violator)->(ViolatorMapper.mapToViolatorDto(violator)))
                .collect(Collectors.toList());
        return violatorDtos;
    }
    
    @Override
    public ViolatorDto cariByNim(String nim){
        Violator violator = violatorRepository.findByNim(nim).orElse(null);
        ViolatorDto violatorDto = ViolatorMapper.mapToViolatorDto(violator);
        return violatorDto;
    }
    
        @Override    
    public void perbaruiDataViolator(ViolatorDto violatorDto){
        Violator violator = ViolatorMapper.mapToViolator(violatorDto);
        this.violatorRepository.save(violator);
    }
    
    @Override
    public void hapusDataViolator(Long nim){
        this.violatorRepository.deleteById(nim);
    }
    
    @Override
    public void simpanDataViolator(ViolatorDto violatorDto){
        Violator violator = ViolatorMapper.mapToViolator(violatorDto);
        violatorRepository.save(violator);
    }
}
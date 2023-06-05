/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.service;

import com.imaliarosyida.studentsmartdisciplinewebapp.dto.ViolatorDto;
import java.util.List;

/**
 *
 * @author Windows10
 */
public interface ViolatorService {
    public List<ViolatorDto> ambilDaftarViolator();
    public void perbaruiDataViolator(ViolatorDto violatorDto);
    public ViolatorDto cariByNim(String nim);
    public void hapusDataViolator(Long studentNim);
    public void simpanDataViolator(ViolatorDto violatorDto);
}

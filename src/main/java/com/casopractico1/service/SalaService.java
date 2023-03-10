package com.casopractico1.service;

import com.casopractico1.entity.Sala;
import com.casopractico1.repository.SalaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaService implements ISalaService{
    
    @Autowired  
    private SalaRepository salaRepository;
    
    @Override
    public List<Sala> listCountry() {
        return (List<Sala>)salaRepository.findAll();  
    }
    
}

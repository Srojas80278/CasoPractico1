package com.casopractico1.service;

import com.casopractico1.entity.Pelicula;
import com.casopractico1.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements IPeliculaService{

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> getAllPelicula() {
        return (List<Pelicula>)peliculaRepository.findAll(); 
    }
    
    @Override
    public Pelicula getPeliculaById(long id) {
        return peliculaRepository.findById(id).orElse(null);

    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        peliculaRepository.save(pelicula);
    }

    @Override
    public void delete(long id) {
        peliculaRepository.deleteById(id);
    }
    
    
}

package com.casopractico1.repository;

import com.casopractico1.entity.Pelicula;
import org.springframework.data.repository.CrudRepository;



public interface PeliculaRepository extends CrudRepository<Pelicula, Long>{
    
}

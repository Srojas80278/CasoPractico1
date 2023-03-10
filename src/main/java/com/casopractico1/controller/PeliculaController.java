package com.casopractico1.controller;

import com.casopractico1.entity.Pelicula;
import com.casopractico1.entity.Sala;
import com.casopractico1.service.IPeliculaService;
import com.casopractico1.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {
    
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    
    @GetMapping("/pelicula")
    public String index(Model model){
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo", "Tabla peliculas");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";
    }
    
    
    @GetMapping("/agregar")
    public String CrearPelicula(Model model){
        List<Sala> listaSalas = salaService.listCountry();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }
    
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
    
    @GetMapping("/eliminar")
    public String eliminar(Pelicula pelicula) {
        peliculaService.delete(pelicula.getId());
        return "redirect:/pelicula";
    }
    
    @GetMapping("/editPelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idPelicula, Model model){
        Pelicula pelicula= peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listCountry();
        model.addAttribute("pelicula", pelicula); 
        return "crear"; 
    }
}
package com.casopractico1.entity;
import jakarta.persistence.*; //Importamos todos los "import" de jakarta.
import java.io.Serializable;

@Entity
@Table(name = "salas") //Nombre de la tabla en MySQL
public class Sala implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long id;
    private String nombre;
    private int capacidad;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}

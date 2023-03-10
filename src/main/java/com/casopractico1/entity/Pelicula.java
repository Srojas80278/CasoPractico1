package com.casopractico1.entity;

import jakarta.persistence.*; //Importamos todos los "import" de jakarta.
import java.io.Serializable;

@Entity
@Table(name = "peliculas") //Nombre de la tabla en MySQL
public class Pelicula implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //Definimos los atributos de la clase:
    private long id;
    private String nombre;
    private double costo;
    private String fecha;
    private int codigo_sala;
    
    //Este foregin key es la relacion de muchos a uno y la columna.
    @ManyToOne
    @JoinColumn(name = "salas_id")
    private Sala sala;

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

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo_sala() {
        return codigo_sala;
    }

    public void setCodigo_sala(int codigo_sala) {
        this.codigo_sala = codigo_sala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
    
    
}

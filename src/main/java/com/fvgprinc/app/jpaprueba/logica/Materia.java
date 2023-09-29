/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvgprinc.app.jpaprueba.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author garfi
 */
@Entity
public class Materia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(int id) {
        this.id = id;
    }

    @Column(columnDefinition = "varchar(100)")
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Esto es si la materia es semestral, anual, etc.
     */
    private String tipo;

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @ManyToOne
    private Carrera carrera;

    /**
     * Get the value of carrera
     *
     * @return the value of carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * Set the value of carrera
     *
     * @param carrera new value of carrera
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Materia() {
    }

    public Materia(int id, String nombre, String tipo, Carrera carrera) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.carrera = carrera;
    }



}

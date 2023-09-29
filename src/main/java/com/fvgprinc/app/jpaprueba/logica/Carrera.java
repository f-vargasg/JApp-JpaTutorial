package com.fvgprinc.app.jpaprueba.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author garfi
 */
@Entity
public class Carrera implements Serializable {

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

    @OneToMany(mappedBy = "carrera")
    LinkedList<Materia> lstMaterias;

    public LinkedList<Materia> getLstMaterias() {
        return lstMaterias;
    }

    public void setLstMaterias(LinkedList<Materia> lstMaterias) {
        this.lstMaterias = lstMaterias;
    }

    public Carrera() {
    }

    public Carrera(int id, String nombre, LinkedList<Materia> lstMaterias) {
        this.id = id;
        this.nombre = nombre;
        this.lstMaterias = lstMaterias;
    }

}

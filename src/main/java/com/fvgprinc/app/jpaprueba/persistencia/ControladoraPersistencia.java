package com.fvgprinc.app.jpaprueba.persistencia;

import com.fvgprinc.app.jpaprueba.logica.Alumno;
import com.fvgprinc.app.jpaprueba.logica.Carrera;
import com.fvgprinc.app.jpaprueba.logica.Materia;
import com.fvgprinc.app.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garfi
 */
public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
    MateriaJpaController materiaJpaController = new MateriaJpaController();

    // -------------------------- Alumno----------------------------------------------------------
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> lstRes = aluJpa.findAlumnoEntities();

        ArrayList<Alumno> listaAlumnos = new ArrayList<>(lstRes);

        return listaAlumnos;
    }

    // -------------------------- Carrera----------------------------------------------------------
    public void crearCarrera(Carrera carre) {
        carreJpa.create(carre);
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lstCare = carreJpa.findCarreraEntities();

        ArrayList<Carrera> lstRes = new ArrayList<>(lstCare);

        return lstRes;
    }

    //----------------------- Materia--------------------------------------------------------------------------
    public void crearMateria(Materia materia) {
        materiaJpaController.create(materia);
    }

    public void eliminarMateria(int id) {
        try {
            materiaJpaController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            materiaJpaController.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return materiaJpaController.findMateria(id);
    }

    public LinkedList<Materia> traerListaMaterias() {
        List<Materia> lstCare = materiaJpaController.findMateriaEntities();

        LinkedList<Materia> lstRes = new LinkedList<>(lstCare);

        return lstRes;
    }

}

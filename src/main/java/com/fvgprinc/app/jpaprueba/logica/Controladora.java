
package com.fvgprinc.app.jpaprueba.logica;

import com.fvgprinc.app.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author garfi
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id) {
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno (id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos() {
        return controlPersis.traerListaAlumnos();
    }
    
    
    // Carrera
    public void crearCarrera(Carrera carre) {
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id) {
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre) {
        controlPersis.editarCarrera(carre);
    }
    
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera (id);
    }
    
    public ArrayList<Carrera> traerListaCarreras() {
        return controlPersis.traerListaCarreras();
    }
    
    // Materia
    public void crearMateria(Materia carre) {
        controlPersis.crearMateria(carre);
    }
    
    public void eliminarMateria(int id) {
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia carre) {
        controlPersis.editarMateria(carre);
    }
    
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria (id);
    }
    
    public LinkedList<Materia> traerListaMaterias() {
        return controlPersis.traerListaMaterias();
    }    
    
}

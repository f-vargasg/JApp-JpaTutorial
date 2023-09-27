
package com.fvgprinc.app.jpaprueba.persistencia;

import com.fvgprinc.app.jpaprueba.logica.Alumno;

/**
 *
 * @author garfi
 */
public class ControladoraPersistencia {
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }
    
   
}

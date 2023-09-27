
package com.fvgprinc.app.jpaprueba.logica;

import com.fvgprinc.app.jpaprueba.persistencia.ControladoraPersistencia;

/**
 *
 * @author garfi
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }
}



package com.fvgprinc.app.jpaprueba;

import com.fvgprinc.app.jpaprueba.logica.Alumno;
import com.fvgprinc.app.jpaprueba.logica.Controladora;
import com.fvgprinc.app.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.Date;

/**
 *
 * @author garfi
 */
public class JpaPrueba {

    public static void main(String[] args) {
        
        Controladora control = new Controladora();
        
        Alumno alu = new Alumno(15, "alumno1", "apellido1", new Date());
        alu.setId(0);
        
        
        control.crearAlumno(alu);
        
        
    }
}

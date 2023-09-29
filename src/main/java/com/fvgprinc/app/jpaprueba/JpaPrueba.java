package com.fvgprinc.app.jpaprueba;

import com.fvgprinc.app.jpaprueba.logica.Alumno;
import com.fvgprinc.app.jpaprueba.logica.Carrera;
import com.fvgprinc.app.jpaprueba.logica.Controladora;
import com.fvgprinc.app.jpaprueba.logica.Materia;
import com.fvgprinc.app.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author garfi
 */
public class JpaPrueba {

    public static void main(String[] args) {

        Controladora control = new Controladora();

        // Crear la lista de materias
        LinkedList<Materia> listaMaterias = new LinkedList<>();
        
        // Creación de la carrera
         Carrera carre = new Carrera(24, "Tecnicatura en Programación", listaMaterias); 

        // Guardado en la BD
        control.crearCarrera(carre);
        
        // Creación de materias
        Materia materia1 = new Materia(1, "Programación I", "Anual", carre);
        Materia materia2 = new Materia(2, "Programación I", "Anual", carre);
        Materia materia3 = new Materia(3, "Programación I", "Anual", carre);
        
        control.crearMateria(materia1);
        control.crearMateria(materia2);
        control.crearMateria(materia3);
        
        // Crear la lista de materias
        listaMaterias.add(materia1);
        listaMaterias.add(materia2);
        listaMaterias.add(materia3);

        carre.setLstMaterias(listaMaterias);
        // Database post        
        control.editarCarrera(carre);

        //  Creación del alumno con carrera
        int idAlumno = 1;
        Alumno alNuevo = new Alumno(idAlumno, "alumno1", "apellido1", new Date(), carre);

        // Gudardamos el alumno en la BD (Dtabase Post)
        control.crearAlumno(alNuevo);

        // vemos resultado
        System.out.println("----------------------------------------------");
        Alumno al = control.traerAlumno(idAlumno);
        System.out.println("Alumno: " + al.getNombre() + " " + al.getApellido());
        System.out.println("Cursa la carrera de: " + al.getCarrera().getNombre());

//        control.crearAlumno(alu);
//        //          control.eliminarAlumno(1);
//        System.out.println("Alumno insertado");
////        
////        alu.setNombre("Luisina");
////        alu.setApellido("De Paula");
////        
////        control.editarAlumno(alu);
////        System.out.println("Alumno modificado");
//        int idToSearch = 2;
//        alu = control.traerAlumno(idToSearch);
//        System.out.println("--------------------Búsqueda individual ----------------------------");
//        if (alu != null) {
//            System.out.println("El alumno es: " + alu.toString());
//        } else {
//            System.out.println("Alumno " + Integer.toString(idToSearch) + " NO encontrado !!!!");
//        }
//
//        System.out.println("---------------------Búsqueda de todos -----------------------------");
//        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
//        for (Alumno al : listaAlumnos) {
//            System.out.println("El alumno es: " + al.toString());
//        }
//
//        System.out.println("-----------------------------------------------------------------------------");
    }
}

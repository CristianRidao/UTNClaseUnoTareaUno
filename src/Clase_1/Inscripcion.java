/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_1;

/**
 *
 * @author crist
 */
public class Inscripcion {
    
    private Materia materia;
    private Alumno alumno;

    

    public Inscripcion(Materia materia, Alumno alumno) {
        this.materia = materia;
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    
    
    public boolean aprobada(Materia materia){
       
        if (materia.getNota()>=6) {
           return true; 
        } else {
            return false;
        }
        
        
    }
    
    
}

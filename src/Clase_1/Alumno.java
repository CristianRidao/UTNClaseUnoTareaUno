/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_1;

/**
 *
 * @author crist
 */
public class Alumno extends Persona {
    
    private int idAlumno;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, String apellido, int dni, String direccion, int telefono) {
        super(nombre, apellido, dni, direccion, telefono);
        this.idAlumno = idAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    
    
}

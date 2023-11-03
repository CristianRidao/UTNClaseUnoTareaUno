/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_1;

/**
 *
 * @author crist
 */
public class Materia {
    
    private int idMateria;
    private String nombreMateria;
    private int correlativa;
    private double nota;

    public Materia() {
    }

    public Materia(int idMateria, String nombreMateria, int correlativa) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.correlativa = correlativa;
    }

    public Materia(String nombreMateria, double nota) {
        this.nombreMateria = nombreMateria;
        this.nota = nota;
    }
    
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCorrelativa() {
        return correlativa;
    }

    public void setCorrelativa(int correlativa) {
        this.correlativa = correlativa;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
    
}
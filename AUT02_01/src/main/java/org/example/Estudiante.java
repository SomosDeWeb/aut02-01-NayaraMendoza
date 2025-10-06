package org.example;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;
    boolean matriculado;

    public Estudiante() {}

    public Estudiante(String nombre, int edad, double nota, boolean matriculado) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.matriculado = matriculado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
}

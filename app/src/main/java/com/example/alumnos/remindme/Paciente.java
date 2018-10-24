package com.example.alumnos.remindme;

public class Paciente {

    private int id;
    private String nombre;
    private String apellido;
    private String movil;
    private String correo;

    Paciente(){

    }

    Paciente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

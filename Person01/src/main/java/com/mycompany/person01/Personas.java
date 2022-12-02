/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.person01;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Personas {
    private String nombre, apellido,cedula;
    private int edad;
    ArrayList<Personas> arrayPersona= new ArrayList();

    public Personas() {
    }
     
    public Personas(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void guardar(){ 
        arrayPersona.add(new Personas(getNombre(),getApellido(),getCedula(), getEdad()));
    }
    public void mostrar(){
        for (int i = 0; i < arrayPersona.size(); i++) {
            System.out.println("El nombre es :"+ arrayPersona.get(i).getNombre());
            System.out.println("El apellido es :"+ arrayPersona.get(i).getApellido());
            System.out.println("La cedula  es :"+ arrayPersona.get(i).getCedula());
            System.out.println("El edda es :"+ arrayPersona.get(i).getEdad());
        }
    
    }
    
    public void yearNacieminto(){
    
    }
    
    
}

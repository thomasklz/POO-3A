/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infruit;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Frutas {
    private String nombre, color;
    private int cantidad;
    ArrayList<Frutas> arrayFrutas=new ArrayList();

    public Frutas() {
    }

    public Frutas(String nombre, String color, int cantidad) {
        this.nombre = nombre;
        this.color = color;
        this.cantidad = cantidad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void guardar(){
        arrayFrutas.add(new Frutas(getNombre(),getColor(),getCantidad()));
    }
    public void mostrar(){
        for (int i = 0; i < arrayFrutas.size(); i++) {
            System.out.println("Los datos de las frutas son: "+ arrayFrutas.get(i).getNombre()+" "+arrayFrutas.get(i).getColor()+" "+ arrayFrutas.get(i).getCantidad()
                    );
        }
    }
}

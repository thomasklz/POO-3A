/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.demo01;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Animales {
   private String nombre, color, raza;
   private int cantidad;
   ArrayList<Animales> arrayAnimales = new ArrayList();
    public Animales(String nombre, String color, String raza, int cantidad) {
        this.nombre = nombre;
        this.color = color;
        this.raza = raza;
        this.cantidad = cantidad;
    }
    public Animales() {
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

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void guardar(){
        arrayAnimales.add(new Animales(getNombre(), getColor(),getRaza(),getCantidad()));
    }
    
    public void mostrar(){
        for (int i = 0; i < arrayAnimales.size(); i++) {
            System.out.println("Elemento: "+i);
            System.out.println("El nombre del animal es:"+arrayAnimales.get(i).getNombre());
            System.out.println("El color es:"+arrayAnimales.get(i).getColor());
            System.out.println("La raza es:"+arrayAnimales.get(i).getRaza());
            System.out.println("La cantidad es:"+arrayAnimales.get(i).getCantidad());
        
            System.out.println("--------------------------");
        }
    }
   public void buscar(String nom){
       int contador=0;
       for (int i = 0; i < arrayAnimales.size(); i++) {
           if(arrayAnimales.get(i).getNombre().equals(nom)){
                System.out.println("Elemento: "+i);
                System.out.println("El nombre del animal es:"+arrayAnimales.get(i).getNombre());
                System.out.println("El color es:"+arrayAnimales.get(i).getColor());
                System.out.println("La raza es:"+arrayAnimales.get(i).getRaza());
                System.out.println("La cantidad es:"+arrayAnimales.get(i).getCantidad());

                System.out.println("--------------------------");
                contador=1;
           }
       }
       
       if(contador==0){
           System.out.println("No encontrado");
       }
   }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class TVehiculo {
    ArrayList<TVehiculo> arrayTVehiculo = new ArrayList();
    private  String tipo,color,marca;
    private int year, cantidad;

   
    public TVehiculo() {
    }

    public TVehiculo(String tipo, String color, String marca, int year, int cantidad) {
        this.tipo = tipo;
        this.color = color;
        this.marca = marca;
        this.year = year;
        this.cantidad = cantidad;
    }

  

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
   public void guardar(){
      arrayTVehiculo.add(new TVehiculo(getTipo(), getColor(),getMarca(),getYear(),getCantidad()));
   }
   
   public void mostrar(){
       for (int i = 0; i < arrayTVehiculo.size(); i++) {
           System.out.println("Elemento :"+i);
           System.out.println("El tipo es: "+arrayTVehiculo.get(i).getTipo() ); 
           System.out.println("El color es: "+arrayTVehiculo.get(i).getColor()); 
           System.out.println("La marca es: "+arrayTVehiculo.get(i).getMarca()); 
           System.out.println("El year es: "+arrayTVehiculo.get(i).getYear());
           System.out.println("La cantidad es: "+arrayTVehiculo.get(i).getCantidad());
           System.out.println("--------------------------------");
       }
   }
   
   public boolean vender(String m, int c){
       boolean estado=false;
       for (int i = 0; i < arrayTVehiculo.size(); i++) {
           if(arrayTVehiculo.get(i).getMarca().equals(m)){
              estado=true;
           }
       }
       
       if(estado==false){
           System.out.println("No se encontro la marca del vehiculo");   
       }
       
       return estado;
   }
   
   public void buscar(String m){
       boolean contador=false;
       for (int i = 0; i < arrayTVehiculo.size(); i++) {
          if(arrayTVehiculo.get(i).getMarca().equals(m)){
               System.out.println("Encontrado");
               contador=true;
          } 
       }
       
       if(contador==false){
           System.out.println("No encontrador");
       }
    
       
   }
}

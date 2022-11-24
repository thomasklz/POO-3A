/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poo1;

/**
 *
 * @author Tomas
 */
public class POO1 {

    public static void main(String[] args) {
       
        Carro carro = new Carro();
                
        carro.color="Rojo";
        carro.marca="Nissan";
        carro.year= 2010;
        
        System.out.println("El detalle del carro es "+ carro.color + carro.marca + carro.year);
        carro.correr();
        
        Carro carro1 = new Carro();      
        carro1.color="Verde";
        carro1.marca="Nissan";
        carro1.year= 2010;
        
        System.out.println("El detalle del carro es "+ carro1.color + carro.marca + carro.year);
        carro.correr();
        
    }
}

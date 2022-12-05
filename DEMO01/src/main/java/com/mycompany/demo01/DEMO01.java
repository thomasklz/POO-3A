/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.demo01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class DEMO01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Animales a= new Animales();
        int op;
        do{
        System.out.println("1) Ingresar");
        System.out.println("2) Mostrar");
         System.out.println("3) Buscar");
        System.out.println("4) Salir");
        System.out.println("Seleccione una opcion");
        op=sc.nextInt();
        switch (op) {
            case 1:
                sc.nextLine();
                System.out.println("Ingrese nombre del animal");
                a.setNombre(sc.nextLine());
                System.out.println("Ingrese el color");
                a.setColor(sc.nextLine());
                System.out.println("Ingrese la raza");
                a.setRaza(sc.nextLine());
                System.out.println("Ingrese cantidad");
                a.setCantidad(sc.nextInt());
                sc.nextLine();
                a.guardar();
                break;
            case 2:
                 a.mostrar();
                 break;
             case 3:
                 sc.nextLine();
                 System.out.println("Ingrese el nombre del animal a buscar");
                 String n =sc.nextLine();
                 a.buscar(n);
                 break;
        }
           
           
       }while(op!=4);
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.person01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Person01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Personas p = new Personas();
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nombre");
            p.setNombre(sc.nextLine());
            System.out.println("Ingrese apellido");
            p.setApellido(sc.nextLine());
            System.out.println("Ingrese cedula");
            p.setCedula(sc.nextLine());
            System.out.println("Ingrese edad");
            p.setEdad(sc.nextInt());
            sc.nextLine();
            p.guardar();
        }
        
        p.mostrar();
        
    }
}

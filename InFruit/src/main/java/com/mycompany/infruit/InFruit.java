/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.infruit;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class InFruit {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        Frutas f = new Frutas();
        
        System.out.println("Ingrese la cantidad de frutas");
        int nFrutas= sc.nextInt();
       
        for (int i = 0; i < nFrutas; i++) {
            sc.nextLine();
            System.out.println("Ingrese el nombre");
            f.setNombre(sc.nextLine());
            System.out.println("Ingrese el color");
            f.setColor(sc.nextLine());
            System.out.println("Ingrese el cantidad");
            f.setCantidad(sc.nextInt());
            sc.nextLine();
            f.guardar();
        }
        
        f.mostrar();
    }
}

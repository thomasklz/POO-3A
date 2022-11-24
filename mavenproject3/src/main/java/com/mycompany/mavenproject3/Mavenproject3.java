/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Mavenproject3 {

    public static void main(String[] args) {
         Operaciones op = new Operaciones();
         
         
         Scanner sc= new Scanner(System.in);
         
         System.out.println("Ingrese un número");
         op.num1=sc.nextInt();
         
         System.out.println("Ingrese otro número");
         op.num2=sc.nextInt();
         
         op.Resta();
         op.Multiplicacion();
    }
}

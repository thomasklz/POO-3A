/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vectornumposyneg;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Tomas
 */
public class VECTORNUMPOSYNEG {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int [] vector = new int[4];
         for (int i = 0; i <4; i++) {
             System.out.println("Ingrese el número :" +i);
             try {
                vector[i]=sc.nextInt();
             } catch (Exception e) {
                 System.out.println("Ingrese solo números");
                 sc.nextLine();
                 i--;
             }
        }  
         System.out.println("Los números ingresados son: ");
         for (int i = 0; i < 4; i++) {
             System.out.println(vector[i]);
        }
        System.out.println("---------------");
    }
}

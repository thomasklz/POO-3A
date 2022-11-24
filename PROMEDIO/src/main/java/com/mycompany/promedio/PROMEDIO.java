/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.promedio;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class PROMEDIO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1,num2,num3,num4;
        System.out.println("Ingrese un numero");
        num1= sc.nextFloat();
        System.out.println("Ingrese un numero");
        num2= sc.nextFloat();
        System.out.println("Ingrese un numero");
        num3= sc.nextFloat();
        System.out.println("Ingrese un numero");
        num4= sc.nextFloat();
        System.out.println("El promedio es : "+  String.format("%.2f",((num1+num2+num3+num4)/4)));
    }
}

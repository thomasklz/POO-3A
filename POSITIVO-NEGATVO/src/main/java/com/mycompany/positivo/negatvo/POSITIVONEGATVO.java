/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.positivo.negatvo;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class POSITIVONEGATVO {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero= sc.nextInt();
        if(numero>=0){
            System.out.println("El número " + numero+" es positivo");
        }else{
            System.out.println("El número " + numero+" es negativo");
        }
    }
}

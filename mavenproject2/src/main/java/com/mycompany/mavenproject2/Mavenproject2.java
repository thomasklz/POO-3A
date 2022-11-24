/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz");
        int tamano= sc.nextInt();
        int matriz[][] = new int [tamano][tamano];
        int aux;
        aux=(tamano/2);
        
        for (int f = 0; f < tamano; f++) {
            for (int c = 0; c < tamano; c++) {
                matriz[f][c]=0;
                
                if(c==0 || c==tamano-1 || f==aux){
                    matriz[f][c]=1;
                }
               System.out.print(matriz[f][c]);
            }
            System.out.println("");
        }
    }
}

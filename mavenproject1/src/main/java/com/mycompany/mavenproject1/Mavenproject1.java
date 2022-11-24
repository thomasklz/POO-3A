/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Tomas
 */
public class Mavenproject1 {

    public static void main(
           String[] args) {
            int t[][]=new int[5][5];
            int li=5;
        
            for(int i=0;i<5;i++){
                li--;
                for(int l=0;l<5;l++){
                    if(i==l||l==li)
                    {t[i][l]=1;}
                    System.out.print(t[i][l]+"\t");
                }
                System.out.println("");
            }
    }
}

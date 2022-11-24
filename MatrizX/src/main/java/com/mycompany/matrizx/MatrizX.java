
package com.mycompany.matrizx;


public class MatrizX {

    public static void main(String[] args) {
        int[][] v= new int[5][5];
        
        for(int f=0; f<5; f++){
            for(int c=0; c<5; c++){
                if(f==c||f+c==4){
                    v[f][c]=1;
                    
                }
                System.out.print(v[f][c] +  "\t");
            }
            System.out.println("");
        }
    }
}

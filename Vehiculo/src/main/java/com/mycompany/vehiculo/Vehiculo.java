
package com.mycompany.vehiculo;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Vehiculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TVehiculo tv = new TVehiculo();
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el tipo de vehiculo");
            tv.setTipo(sc.nextLine());
            System.out.println("Ingrese el color del vehiculo");
            tv.setColor(sc.nextLine());
            System.out.println("Ingrese la marca del vehiculo");
            tv.setMarca(sc.nextLine());
            System.out.println("Ingrese el year del vehiculo");
            tv.setYear(sc.nextInt());
            System.out.println("Ingrese la cantidad de vehiculos");
            tv.setCantidad(sc.nextInt());
            sc.nextLine();
            
            tv.guardar();
        }
        
        tv.mostrar();
        String marc;
        System.out.println("INgrese la marca");
        marc=sc.nextLine();
        
        tv.buscar(marc);
       
   
        
        
        
       
        
    }
}

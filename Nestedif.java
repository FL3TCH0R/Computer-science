/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nestedif;

/**
 *
 * @author fletc
 */
public class Nestedif {

    public static void main(String[] args) {
      
        int i=10;
        
        if (i==10 || i<15){
        if (i<15)
            System.out.println("i is smaller than 15");
        if (i<12)
           System.out.println("i is smaller than 12 too");
            
        
        
        }
        
       
    }
}

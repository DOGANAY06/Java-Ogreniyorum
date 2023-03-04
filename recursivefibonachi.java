/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

import java.util.Scanner;

/**
 *
 * @author dogan
 */
public class recursivefibonachi {

    /**
     * @param args the command line arguments
     */
    
    public static int fi(int x ){
        if (x==0) {
            return 1;
        }
        if (x==1) {
            return 1;
        }
        return fi(x-1)+fi(x-2);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
             System.out.println(fi(i));
        }
       
    }
    
}

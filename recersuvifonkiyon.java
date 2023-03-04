/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class recersuvifonkiyon {

    /**
     * @param args the command line arguments
     */
    public static int f(int x){
        if (x==10) 
        return 10; 
        System.out.println("x: " +x);
        return x+f(x+1);
    }
    public static void main(String[] args) {
      /* int toplam =0;
        for (int i = 0; i < 10; i++) {
            toplam += i+1;
            System.out.println("toplam : "+toplam + " 1: "+i);
        }
        System.out.println("Sonuç "+toplam);*/
        System.out.println("f(0): "+f(0));
    }
    
}

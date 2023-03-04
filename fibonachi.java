/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class fibonachi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            int sonuc = i+(i-1);
            System.out.println("1. eleman = "+sonuc);
        } //benim tasarım 
        int a = 0;
        int b =1;
        int c;
        for (int i = 0; i < 10; i++) {
            c = a+b;
            a=b;
            b=c;
            System.out.println((i+1)+". eleman "+a);
            
        }
                
    }
    
}

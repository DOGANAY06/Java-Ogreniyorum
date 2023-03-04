/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class fonksiyonornekleri {

    /**
     * @param args the command line arguments
     */
    static int f(int x)
    {
        return 5*x+10;
    }
    static int g(int x,int y)
    {
        return y+2*x;
    }
    static void yaz(){
        System.out.println("MERHABA");
    }
    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(g(10,11));
        yaz();
        System.out.println(f(g(10,11)));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class baslangic_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a =10, b =20,c=30;
        System.out.println("Sonuc toplam "+(a+b));
        System.out.println("Sonuc carp"+ a*b);
        System.out.println("Sonuc çıkarma"+ (a-b));
        System.out.println("Sonuc bölme "+ (float)((float)a/(float)b));
        System.out.println("Bitwise ikilik "+ (a>>2)); //10 un ilik taban karşılığı 1010 bunu böyle yaptı 0101
        System.out.println("Bitwise ikilik "+ (a<<2));
        System.out.println("Bitwise ikilik "+ (a>>>2));
        System.out.println("Boolean "+ (a<b));
        
    }
}

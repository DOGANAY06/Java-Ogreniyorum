/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class yuzdenbirekadar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 99; i >= 1; i-=2) {
            System.out.println(""+i);
        }
        for (int i = 1; i < 100; i++) {
            if (i%3 ==0 && i%7==0) {
                System.out.println("Hem 3 e hem de 7 ye bölünebilen sayılar "+i);
            }
        }
        for (int i = 0; i <6;i++) {
            int a = (int) Math.pow(2, i);
            System.out.println("2 nin " +i + " .kuvveti = " +a );
        }
        for (int i = 1; i < 6; i++) {
            if (i%5 ==0) {
                System.out.println("5'e tam bölünebilen sayılar = " +i);
            }
        }
    }
    
}

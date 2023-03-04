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
public class nothesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lütfen notunuzu giriniz");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        if (i>=90) {
            System.out.println("Karne notunuz AA "+i);
        }
        else if (i>80 && i<90) {
            System.out.println("Karne notunuz BB "+i);
        }
        else if (i>70 && i<80) {
            System.out.println("Karne notunuz CC "+i);
        }
        else{
            System.out.println("Karne notunuz FF "+i);
        }
    }
    
}

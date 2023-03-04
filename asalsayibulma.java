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
public class asalsayibulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Sayı giriniz =");
        Scanner s = new Scanner(System.in);
        int sa = s.nextInt();
        int sayac =0;
        for (int i = 2; i < sa; i++) {
            if (sa%i ==0) {
                sayac++;
                break;
            }
        }
        if (sayac==0) {
            System.out.println("Girilen sayı asaldır = "+sa);
        }
        else{
            System.out.println("Girilen sayı asal değildir = "+sa);
        }
        
    }
    
}

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
public class kalinsesliincesesli {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        System.out.println("Bir harf giriniz ince mi kalın mı kontrol edelim = ");
        Scanner h= new Scanner(System.in);
        char harf = h.next().charAt(0);

        char kalin[] ={'a','ı','o','u'};
        char ince[] = {'e','i','ö','ü'};

        boolean kalinMi = false;

        for (int i = 0; i < kalin.length; i++) {
            if (kalin[i] == harf) {
                kalinMi = true;
                break;
            }
        }

        if (kalinMi) {
            System.out.println("Harf kalın ünlüdür = " + harf);
        } else {
            for (int i = 0; i < ince.length; i++) {
                if (ince[i] == harf) {
                    System.out.println("Harf ince ünlüdür = " + harf);
                    break;
                }
            }
        }
    }
}
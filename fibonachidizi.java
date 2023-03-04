/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class fibonachidizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fi[] = new int[10];
        fi[0] = 1;
        fi[1] = 1;
        System.out.println("0. eleman = "+fi[0]);
        System.out.println("1. eleman = "+fi[1]);
        for (int i = 2; i < 10; i++) {
            fi[i] = fi[i-2] + fi[i-1];
            System.out.println(i+ ". eleman = "+fi[i]);
        }
    }
    
}

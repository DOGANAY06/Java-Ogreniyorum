/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author dogan
 */
public class javastreamapi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*List<Integer> nums =Arrays.asList(10,4,5,7,8,9);
        //stream kullanarak sıralama 
        Stream<Integer> data = nums.stream();
        Stream<Integer> sortedData = data.sorted();
        //bu sıraya sokarak küçükten büyüğe sıralatır
        
        sortedData.forEach(n->System.out.println(n));
        //normal sıralama
        
        Stream<Integer> mappedData = data.map(n->n*2);
        mappedData.forEach(n->System.out.println(n));
        //dizi de ki bütün elemanların 2 katını alıyoruz
        //bunların hepsini tek bir stream de yapabiliriz 
        */
        List<Integer> nums2 =Arrays.asList(10,41,5,7,8,9);
        int sonuc = nums2.stream()
                .filter(n->n%2 ==1) //bura da tek sayıları filtreledim
                .sorted()
                .map(n->n*2)
                .reduce(0,(a,b)->a+b); //değerleri aralarında toplar
                
        System.out.println(sonuc);
    }
    
}

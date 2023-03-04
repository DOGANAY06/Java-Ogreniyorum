/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baslangic1;

/**
 *
 * @author dogan
 */
public class Baslangic1 {

    public static void main(String[] args) {
        int x = 10;
        int y;
        String sadi;
        sadi ="Dogan AY";
        System.out.println("Selamün Aleyküm " +sadi);
        System.out.println("Doğan AY");
        float pi =(float) 3.14;
        double pim = 3.14;
        System.out.println("Selamün Aleyküm " +sadi + " pi degeri " +pi );
        String m = "Benim ismim Doğan";
        m = m.toUpperCase();
        int ilkBosluk = m.indexOf(" ");
        String ilkKelime= m.substring(ilkBosluk); //verdiğimiz yerden sonrasını alır
        System.out.println("Selamün Aleyküm " +sadi + " pi degeri " +pi+ " ilk boşluk" +ilkBosluk);
        System.out.println("ilk kelime değişkeni " +ilkKelime);
        String bastanduranakadar= m.substring(0,ilkBosluk);
        int  sonBosluk = m.lastIndexOf(" "); //en son boşluktan sonra ki kısımdan itibaren al dedik 
        String sonKelime = m.substring(sonBosluk);
        System.out.println("son kelime "+sonKelime);
        System.out.println("10. karakter  : "+m.charAt(10));
        
    }
}

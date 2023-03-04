/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.baslangic1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author dogan
 */
public class dosyadanveriokumayazma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("engtur.txt"); //dosya açıcaz
        try{
             FileReader fr = new FileReader(f);
             int c =fr.read();
             while (c!=-1) {    
                char k = (char)c;
                System.out.println(k+" ");
                c = fr.read(); 
            }
            fr.close();
            f = new File("engtur.txt"); //dosya açıcaz
            BufferedReader br = new BufferedReader( new FileReader(f));
            System.out.println(br.readLine());
            File cikti = new File("cikti.txt");
            FileWriter fw  = new FileWriter(cikti);
            fw.write("dogan ay deneme mesaji");
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
       
    }
    
}

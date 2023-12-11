/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quis.array.multi.dimensi;

/**
 *
 * @author achsa
 */import java.util.Scanner;
public class QuisArrayMultiDimensi {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
       String ruang[][] = new String [1][2];
       String barang = null ;
       int harga = 0 ;
       System.out.println(" System memasukkan  nama barang dan harga");
       
       for (int i=0;i<2;i++){
           for (int j=0; j<1;j++){
               System.out.println("masukkan nama barang = ");
              barang = s.next();
       System.out.print("masukkan harga barang = ");
       harga = s.nextInt(); 
           }
       }
       for (int i=0;i<2;i++){
           for (int j=0; j<1;j++){ 
    System.out.println(barang + " dengan harga = " + harga);
       }
    }
    }
}

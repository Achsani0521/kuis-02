/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.kelompok.no1;

/**
 *
 * @author DIMAS FARREL
 */
public class TugasKelompokNo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        int data[]={7200,4500,9000,1250,6350,2760,6780,4820};
        System.out.println("Pengurutan Harga Barang ");
        System.out.print("Harga Barang sebelum diurutkan : ");
        for(int i=0;i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        for(int i=0; i<data.length; i++){
            for(int j=0;j<data.length-1; j++){
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.print("Pengurutan Harga dari harga terendah : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for(int i=0; i>data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        for(int i=0; i>data.length; i++){
            for(int j=0; j<data.length-1; j++){
                if(data[j]<data[j-1]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        System.out.print("Pengurutan Harga dari Harga Tertinggi terdapat dari barisan paling kanan : ");
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
            }
}
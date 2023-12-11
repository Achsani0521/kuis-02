/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pencarianbarang;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class PencarianBarang {
    public static void main(String[] args) {
        List<String> daftarBarang = new ArrayList<>();
        daftarBarang.add("Teh Pucuk");
        daftarBarang.add("Kopi Kapal Api");
        daftarBarang.add("Indomie Goreng");
        daftarBarang.add("Kecap Sedap");
        daftarBarang.add("Tepung Terigu");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari: ");
        String kataKunci = scanner.nextLine().toLowerCase();
        
        boolean ditemukan = false;
        
        for (String barang : daftarBarang){
            if (barang.toLowerCase().contains(kataKunci)){
                System.out.println("Barang ditemukan: " + barang);
                ditemukan = true;
            }
        }
        if (!ditemukan){
            System.out.println("Barang tidak ditemukan.");
        }
    }
}

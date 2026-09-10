package com.mycompany.minpro;

import hidroponik.manajemenKebun;
import hidroponik.Tanaman;
import java.util.ArrayList;
import java.util.Scanner;

public class MINPRO {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        manajemenKebun manajemen = new manajemenKebun(scanner);

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== Sistem Informasi Pengelolaan Kebun Hidroponik ===");
            System.out.println("1. Tambah Tanaman");
            System.out.println("2. Tampilkan Tanaman");  
            System.out.println("3. Update Tanaman");
            System.out.println("4. Hapus Tanaman");
            System.out.println("5. Tambah Perawatan");
            System.out.println("6. Tampilkan Perawatan");
            System.out.println("7. Update Perawatan");
            System.out.println("8. Hapus Perawatan");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu (1-9): ");
            
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1 -> manajemen.tambahTanaman();
                    case 2 -> manajemen.tampilkanTanaman();
                    case 3 -> manajemen.updateTanaman();
                    case 4 -> manajemen.hapusTanaman();
                    case 5 -> manajemen.tambahPerawatan();
                    case 6 -> manajemen.tampilkanPerawatan();
                    case 7 -> manajemen.updatePerawatan();
                    case 8 -> manajemen.hapusPerawatan();
                    case 9 -> {
                        System.out.println("Terima kasihdan bye");
                        berjalan = false;
                    }
                    default -> System.out.println("Pilihan tidak valid");
                }
            } catch (Exception e) {
                System.out.println("Error Pilihan harus pakai angka");
                scanner.nextLine(); 
            }
        }
        scanner.close();
    }
}
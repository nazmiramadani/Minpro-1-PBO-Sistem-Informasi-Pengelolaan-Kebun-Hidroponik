package hidroponik;

import java.util.ArrayList;
import java.util.Scanner;

public class manajemenKebun {
    private ArrayList<Tanaman> daftarTanaman;
    private ArrayList<Perawatan> daftarPerawatan;
    private Scanner scanner;
    
    public manajemenKebun(Scanner scanner){
        this.daftarTanaman = new ArrayList<>();
        this.daftarPerawatan = new ArrayList<>();
        this.scanner = scanner;
    }
    
//TANAMAN
    public void tambahTanaman(){
        try {
            System.out.print("ID Tanaman (Angka): "); 
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nama Tanaman: "); 
            String nama = scanner.nextLine();

            System.out.print("Jenis Tanaman: "); 
            String jenis = scanner.nextLine();

            Tanaman tanamanBaru = new Tanaman(id, nama, jenis);
            daftarTanaman.add(tanamanBaru);

            System.out.println("Tanaman berhasil ditambahkan");
        } catch (Exception e) {
            System.out.println("Error Pilihan harus pakai angka");
            scanner.nextLine();
        }
    }

    public void tampilkanTanaman(){
        if (daftarTanaman.isEmpty()) {
            System.out.println("Data tanaman masih kosong.");
            return;
        }

        for (int i = 0; i < daftarTanaman.size(); i++) {
            Tanaman t = daftarTanaman.get(i);
            System.out.println("ID Tanaman: " + t.getIdTanaman());
            System.out.println("Nama Tanaman: " + t.getNamaTanaman());
            System.out.println("Jenis Tanaman: " + t.getJenisTanaman());
            System.out.println("-------------------------");
        }
    }

    public void hapusTanaman(){
        try {
            System.out.print("Masukkan ID Tanaman yang dihapus: ");
            int idTarget = scanner.nextInt();
            scanner.nextLine();

            boolean ditemukan = false;
            for(int i = 0; i < daftarTanaman.size(); i++){
                if(daftarTanaman.get(i).getIdTanaman() == idTarget){    
                    daftarTanaman.remove(i);
                    System.out.println("Tanaman berhasil dihapus");
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Data tidak ada");
            }
        } catch (Exception e) {
            System.out.println("Error Pilihan harus pakai angka");
            scanner.nextLine(); 
        }
    }

    public void updateTanaman(){
        try {
            System.out.print("Masukkan ID Tanaman yang diupdate: ");
            int idTarget = scanner.nextInt();
            scanner.nextLine(); 

            for (Tanaman t : daftarTanaman){
                if(t.getIdTanaman() == idTarget){
                    System.out.print("Nama Tanaman Baru: ");
                    String namaBaru = scanner.nextLine(); 
                    
                    System.out.print("Jenis Tanaman Baru: ");
                    String jenisBaru = scanner.nextLine(); 
                    
                    t.setNamaTanaman(namaBaru);
                    t.setJenisTanaman(jenisBaru); 
                    
                    System.out.println("Data berhasil diupdate");
                    return;
                }
            }
            System.out.println("Data tidak ada");
        } catch (Exception e) {
            System.out.println("Error Pilihan harus pakai angka");
            scanner.nextLine(); 
        }
    }

//PERAWATAN
    public void tambahPerawatan(){
        try {
            System.out.print("ID Perawatan (Angka): "); 
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("ID Tanaman yang dirawat (Angka): "); 
            int idTanaman = scanner.nextInt();
            scanner.nextLine();

            boolean tanamanAda = false;
            for (Tanaman t : daftarTanaman) {
                if (t.getIdTanaman() == idTanaman) {
                    tanamanAda = true;
                    break; 
                }
            }

            if (!tanamanAda) {
                System.out.println("ID Tanaman tidak ada");
                return; 
            }

            System.out.print("Nama Perawatan: "); 
            String nama = scanner.nextLine();

            System.out.print("Frekuensi: "); 
            String frekuensi = scanner.nextLine();

            Perawatan perawatanBaru = new Perawatan(id, idTanaman, nama, frekuensi);
            daftarPerawatan.add(perawatanBaru);

            System.out.println("Data Perawatan berhasil ditambahkan");
        } catch (Exception e) {
            System.out.println("Error Pilihan harus pakai angka");
            scanner.nextLine(); 
        }
    }

    public void tampilkanPerawatan(){
        if (daftarPerawatan.isEmpty()) {
            System.out.println("Data perawatan masih kosong.");
            return;
        }

        for (int i = 0; i < daftarPerawatan.size(); i++) {
            Perawatan p = daftarPerawatan.get(i);
            System.out.println("ID Perawatan: " + p.getIdPerawatan());
            System.out.println("ID Tanaman  : " + p.getIdTanaman());
            System.out.println("Nama Perawatan: " + p.getNamaPerawatan());
            System.out.println("Frekuensi: " + p.getFrekuensi());
            System.out.println("-------------------------");
        }
    }

    public void updatePerawatan(){
        try {
            System.out.print("Masukkan ID Perawatan yang ingin diupdate: ");
            int idTarget = scanner.nextInt();
            scanner.nextLine(); 

            for (Perawatan p : daftarPerawatan){
                if(p.getIdPerawatan() == idTarget){
                    System.out.print("ID Tanaman Baru (Angka): "); 
                    int idTanamanBaru = scanner.nextInt();
                    scanner.nextLine();

                    boolean tanamanAda = false;
                    for (Tanaman t : daftarTanaman) {
                        if (t.getIdTanaman() == idTanamanBaru) {
                            tanamanAda = true;
                            break;
                        }
                    }

                    if (!tanamanAda) {
                        System.out.println("ID Tanaman tidak ada");
                        return;
                    }

                    System.out.print("Nama Perawatan Baru: ");
                    String namaBaru = scanner.nextLine(); 
                    
                    System.out.print("Frekuensi Baru: ");
                    String frekuensiBaru = scanner.nextLine(); 
                    
                    p.setIdTanaman(idTanamanBaru);
                    p.setNamaPerawatan(namaBaru);
                    p.setFrekuensi(frekuensiBaru); 
                    
                    System.out.println("Data perawatan berhasil diperbarui");
                    return;
                }
            }
            System.out.println("Data perawatan tidak ada");
        } catch (Exception e) {
            System.out.println("Error Pilihan harus pakai angka");
            scanner.nextLine(); 
        }
    }

    public void hapusPerawatan(){
        try {
            System.out.print("Masukkan ID Perawatan yang dihapus: ");
            int idTarget = scanner.nextInt();
            scanner.nextLine();

            boolean ditemukan = false;
            for(int i = 0; i < daftarPerawatan.size(); i++){
                if(daftarPerawatan.get(i).getIdPerawatan() == idTarget){    
                    daftarPerawatan.remove(i);
                    System.out.println("Data Perawatan berhasil dihapus");
                    ditemukan = true;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Data perawatan tidak ada");
            }
        } catch (Exception e) {
            System.out.println("Error Pilihan harus pakai angka");
            scanner.nextLine(); 
        }
    }
}
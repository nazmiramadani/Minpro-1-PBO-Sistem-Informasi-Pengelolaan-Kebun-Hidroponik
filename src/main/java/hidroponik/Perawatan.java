package hidroponik;

public class Perawatan {
    private int idPerawatan;
    private int idTanaman; 
    private String namaPerawatan;
    private String frekuensi;
    
    public Perawatan(int idPerawatan, int idTanaman, String namaPerawatan, String frekuensi){
        this.idPerawatan = idPerawatan;
        this.idTanaman = idTanaman;
        this.namaPerawatan = namaPerawatan;
        this.frekuensi = frekuensi;
    }
    
    public int getIdPerawatan() {
        return idPerawatan;
    }
    
    public int getIdTanaman() {
        return idTanaman;
    }
    
    public String getNamaPerawatan() {
        return namaPerawatan;
    }
    
    public String getFrekuensi() {
        return frekuensi;
    }

    public void setIdTanaman(int idTanaman) {
        this.idTanaman = idTanaman;
    }

    public void setNamaPerawatan(String namaPerawatan) {
        if (namaPerawatan.isEmpty()) {
            System.out.println("Nama tidak valid");
            return;
        }
        this.namaPerawatan = namaPerawatan;
    }

    public void setFrekuensi(String frekuensi) {
        if (frekuensi.isEmpty()) {
            System.out.println("Frekuensi tidak valid");
            return;
        }
        this.frekuensi = frekuensi;
    }
}
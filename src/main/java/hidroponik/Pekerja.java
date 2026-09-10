package hidroponik;

public class Pekerja {
    private int idPekerja;
    private String namaPekerja;
    private String nomorTelepon;
    private String shiftKerja;
    
    public Pekerja(int idPekerja, String namaPekerja, String nomorTelepon, String shiftKerja){
        this.idPekerja = idPekerja;
        this.namaPekerja = namaPekerja;
        this.nomorTelepon = nomorTelepon;
        this.shiftKerja = shiftKerja;
    }
    
    public int getIdPekerja() {
        return idPekerja;
    }
    
    public String getNamaPekerja() {
        return namaPekerja;
    }
    
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    
    public String getShiftKerja() {
        return shiftKerja;
    }

    public void setNamaPekerja(String namaPekerja) {
        if (namaPekerja.isEmpty()) {
            System.out.println("Nama tidak valid");
            return;
        }
        this.namaPekerja = namaPekerja;
    }

    public void setNomorTelepon(String nomorTelepon) {
        if (nomorTelepon.isEmpty()) {
            System.out.println("Nomor tidak valid");
            return;
        }
        this.nomorTelepon = nomorTelepon;
    }
    
    public void setShiftKerja(String shiftKerja) {
        if (shiftKerja.isEmpty()) {
            System.out.println("Shift tidak valid");
            return;
        }
        this.shiftKerja = shiftKerja;
    }
}
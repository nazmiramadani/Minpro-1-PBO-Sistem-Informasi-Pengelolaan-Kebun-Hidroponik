package hidroponik;

public class Tanaman {
    private int idTanaman;
    private String namaTanaman;
    private String jenisTanaman;
    
    public Tanaman(int idTanaman, String namaTanaman, String jenisTanaman){
        this.idTanaman = idTanaman;
        this.namaTanaman = namaTanaman;
        this.jenisTanaman = jenisTanaman;
    }
    
    public int getIdTanaman() {
        return idTanaman;
    }
    
    public String getNamaTanaman() {
        return namaTanaman;
    }
    
    public String getJenisTanaman() {
        return jenisTanaman;
    }
    
    public void setNamaTanaman(String namaTanaman) {
        if (namaTanaman.isEmpty()){
            System.out.println("Nama tidak valid");
            return;
        }
        this.namaTanaman = namaTanaman;
    }

    public void setJenisTanaman(String jenisTanaman) {
        if (jenisTanaman.isEmpty()) {
            System.out.println("Jenis tidak valid");
            return;
        }
        this.jenisTanaman = jenisTanaman;
    }
}
package UTS_1;

public class Prodi {
    private String kodeProdi, namaProdi,jenjangAkreditasi;
    private int jumlahMhs;


    public Prodi(String kodeProdi , String namaProdi){
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
    }

    public String getKodeProdi(){
        return  kodeProdi;
    }

    public void setKodeProdi(String kodeProdi){
        this.kodeProdi = kodeProdi;
    }

    public String getJenjangAkreditasi(){
        return  jenjangAkreditasi;
    }

    public void setJenjangAkreditasi(String akreditasi){
        this.jenjangAkreditasi =akreditasi;
    }

    public int getJumlahMhs(){
        return  jumlahMhs;
    }

    public void setJumlahMhs(int jumlahMhs){
         this.jumlahMhs = jumlahMhs;
    }

    public String getNamaProdi(){
        return  namaProdi;
    }

    public void setNamaProdi(String namaProdi){
        this.namaProdi = namaProdi;
    }
}

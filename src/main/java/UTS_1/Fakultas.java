package UTS_1;
public class Fakultas {
    private String kodeFakultas , namaFakultas;
    Prodi[]daftarProdi;

    /*
    awal metode setter dan getter untuk atribut fakultas
     */

    public String getKodeFakultas(){
        return  kodeFakultas;
    }

    public void setKodeFakultas(String kodeFakultas){
        this.kodeFakultas = kodeFakultas;
    }

    public Prodi[]getDaftarProdi(){
        return daftarProdi;
    }

    public void setDaftarProdi(Prodi[]daftarProdi){
        this.daftarProdi =daftarProdi;
    }

    public Fakultas(String kodeFakultas , String namaFakultas ,Prodi[]daftarProdi){
        this.kodeFakultas = kodeFakultas;
        this.daftarProdi = daftarProdi;
        this.namaFakultas = namaFakultas;
    }

    public String getNamaFakultas(){
        return  namaFakultas;
    }

    public void setNamaFakultas(String namaFakultas){
        this.namaFakultas  = namaFakultas;
    }
    /*
    Akhir dari metode setter dan getter
     */


    /*
    metode untuk mencari akreditasi "A"
     */

    public static void  cariAkred(String akred, Prodi [] daftarProdi){
        System.out.println(" KODE PRODI " + " - " + " NAMA PRODI " + " - " + " AKREDITASI " + " - " + " JUMLAH MAHASISWAW ");
        for (Prodi prodi : daftarProdi) {
            if (prodi.getJenjangAkreditasi().equalsIgnoreCase(akred)) {
                System.out.println(prodi.getKodeProdi() + " - " +  prodi.getNamaProdi() + " - " + prodi.getJenjangAkreditasi() + " - " +  prodi.getJumlahMhs());
            }
        }


    }

    /*
    metode untuk menghitung rata  - rata jumlah Mahasiswa
     */

    public static  int rata(Prodi[]daftarProdi , int jp){
        int sum = 0;
        int total;
        for (Prodi prodi : daftarProdi) {
            sum = sum + prodi.getJumlahMhs();
        }
        total = sum/jp;
        System.out.println("Rata - Rata Mahasiswa : ");
        return  total;
    }
}
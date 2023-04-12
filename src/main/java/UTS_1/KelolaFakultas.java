package UTS_1;
import java.util.Scanner;
public class KelolaFakultas {
    static int jumlahProdi ,jumlah;
    static String namaProdi , kodeProdi , Akreditasi , namaF,kodeF;

    public static void main(String[] args) {

        Prodi[]prodis;
        Fakultas fakultas;
        Scanner input  = new Scanner(System.in);


        System.out.println("Masukkan jumlah Prodi : ");
        jumlahProdi = input.nextInt();

        prodis = new Prodi[jumlahProdi];
        //fakultas = new Fakultas();

        System.out.print("Nama Fakultas : ");
        namaF = input.next();
        namaF+= input.nextLine();

        System.out.print("Kode Fakultas : ");
        kodeF = input.next();
        kodeF+= input.nextLine();
        fakultas = new Fakultas(namaF  , kodeF,prodis);

        System.out.println("INPUT DATA PRODI : ");
        for(int i  = 0 ; i < prodis.length; i++){
            /*
            Input data Prodi
             */
            System.out.println("Masukkan data prodi ke  : " + (i + 1));

            System.out.print("Kode Prodi : ");
            kodeProdi = input.next();
            kodeProdi += input.nextLine();

            System.out.print("Nama Prodi : ");
            namaProdi   = input.next();
            namaProdi += input.nextLine();

            System.out.print("Akreditasi : ");
            Akreditasi  = input.next();

            System.out.print("Jumlah Mahasiswa : ");
            jumlah = input.nextInt();

            /*
            Input data Fakultas
             */


            prodis[i]  = new Prodi(kodeProdi , namaProdi);
            prodis[i].setKodeProdi(kodeProdi);
            prodis[i].setNamaProdi(namaProdi);
            prodis[i].setJenjangAkreditasi(Akreditasi);
            prodis[i].setJumlahMhs(jumlah);
        }

        /*
        data fakultas dan prodi
         */

        System.out.println("INFORMASI FAKULTAS DAN PRODI ");
        /*
        fakultas
         */
        System.out.println(fakultas.getNamaFakultas() + " - " + fakultas.getKodeFakultas());
        //Fakultas fakultas1 = new Fakultas(null , null,prodis);
        /*
        PRODI DAN AKRED
         */

        System.out.println(" KODE PRODI " + " - " + " NAMA PRODI " + " - "  + "AKREDITASI " + " - " +  "JUMLAH MAHASISWA ");
        System.out.println("==================================================================================================================================");
        for(Prodi prodi: prodis){
            System.out.println(  prodi.getKodeProdi() + "  - " + prodi.getNamaProdi() + " - " + prodi.getJenjangAkreditasi() + " - "  + prodi.getJumlahMhs());
        }
        int hitung =Fakultas.rata(prodis,jumlahProdi);
        System.out.println("==================================================================================================================================");
        System.out.println(hitung);


        System.out.println("Prodi dengan jenjang Akreditasi A ");
        System.out.println("Masukkan Akredi");
        System.out.println("1. AKREDITASI A");
        System.out.println("2. AKREDITASI B");
        System.out.println("3. AKREDITASI C");
        System.out.println("4. AKREDITASI D");
        System.out.println("===================================================================================================================================");
        String cariJenjang = input.next();
        Fakultas.cariAkred(cariJenjang,prodis);
    }
}

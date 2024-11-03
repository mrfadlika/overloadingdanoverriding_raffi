class OperasiMahasiswa {
    public int tambahNilai(int nilai1, int nilai2) {
        int hasilTambah = nilai1 + nilai2;
        System.out.println("Penjumlahan Integer: " + hasilTambah);
        return hasilTambah;
    }

    public double tambahNilaiDouble(double nilai1, double nilai2) {
        double hasilTambah = nilai1 + nilai2;
        System.out.println("Penjumlahan Double: " + hasilTambah);
        return hasilTambah;
    }

    public int kurangNilai(int nilai1, int nilai2) {
        int hasilKurang = nilai1 - nilai2;
        System.out.println("Pengurangan Integer: " + hasilKurang);
        return hasilKurang;
    }

    public double kurangNilaiDouble(double nilai1, double nilai2) {
        double hasilKurang = nilai1 - nilai2;
        System.out.println("Pengurangan Double: " + hasilKurang);
        return hasilKurang;
    }

    public int kaliNilai(int nilai1, int nilai2) {
        int hasilKali = nilai1 * nilai2;
        System.out.println("Perkalian Integer: " + hasilKali);
        return hasilKali;
    }

    public double kaliNilaiDouble(double nilai1, double nilai2) {
        double hasilKali = nilai1 * nilai2;
        System.out.println("Perkalian Double: " + hasilKali);
        return hasilKali;
    }

    public void bagiNilai(int nilai1, int nilai2) {
        if (nilai2 != 0) {
            System.out.println("Pembagian Integer: " + (nilai1 / nilai2));
        } else {
            System.out.println("Pembagian Integer: Error (Penyebut-nya 0)");
        }
    }

    public void bagiNilaiDouble(double nilai1, double nilai2) {
        if (nilai2 != 0) {
            System.out.println("Pembagian Double: " + (nilai1 / nilai2));
        } else {
            System.out.println("Pembagian Double: Error (Penyebut-nya 0)");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OperasiMahasiswa operasi = new OperasiMahasiswa();

        operasi.tambahNilai(5, 3);
        operasi.tambahNilaiDouble(5.5, 3.3);

        operasi.kurangNilai(5, 3);
        operasi.kurangNilaiDouble(5.5, 3.3);

        operasi.kaliNilai(5, 3);
        operasi.kaliNilaiDouble(5.5, 3.3);

        operasi.bagiNilai(10, 2);
        operasi.bagiNilai(10, 0);

        operasi.bagiNilaiDouble(10.5, 2);
        operasi.bagiNilaiDouble(10.5, 0);
    }
}

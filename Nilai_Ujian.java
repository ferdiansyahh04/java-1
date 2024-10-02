import java.util.Scanner;

public class Nilai_Ujian {
    public static void main(String[] args) {
        // Mendeklarasikan array untuk menyimpan nama dan nilai siswa
        String[] NamaMahasiswa = new String[5];
        int[] NilaiUjian = new int[5];
        
        Scanner scanner = new Scanner(System.in);

        // Memasukkan nama dan nilai siswa menggunakan perulangan
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukan Nama Mahasiswa " + (i + 1) + ": ");
            NamaMahasiswa[i] = scanner.nextLine();
            System.out.print("Masukan Nilai Mahasiswa " + NamaMahasiswa[i] + ": ");
            NilaiUjian[i] = scanner.nextInt();
            scanner.nextLine();
        }

        // Menghitung dan menampilkan skor rata-rata
        int sum = 0;
        for (int nilai : NilaiUjian) {
            sum += nilai;
        }
        double NilaiRatarata = (double) sum / NilaiUjian.length;
        System.out.println("Nilai Rata-rata: " + NilaiRatarata);

        // Menghitung dan menampilkan nilai tertinggi dan nama siswa
        int Nilai_Tertinggi = NilaiUjian[0];
        String NilaiTertinggi = NamaMahasiswa[0];
        for (int i = 1; i < NilaiUjian.length; i++) {
            if (NilaiUjian[i] > Nilai_Tertinggi) {
                Nilai_Tertinggi = NilaiUjian[i];
                NilaiTertinggi = NamaMahasiswa[i];
            }
        }
        System.out.println("Nilai Tertinggi: " + Nilai_Tertinggi  + " (" + NilaiTertinggi + ")");

        // Menghitung dan menampilkan nilai terendah dan nama siswa
        int Nilai_Terendah = NilaiUjian[0];
        String NilaiTerendah = NamaMahasiswa[0];
        for (int i = 1; i < NilaiUjian.length; i++) {
            if (NilaiUjian[i] < Nilai_Terendah) {
                Nilai_Terendah = NilaiUjian[i];
                NilaiTerendah = NamaMahasiswa[i];
            }
        }
        System.out.println("Nilai Terendah: " + Nilai_Terendah + " (" + NilaiTerendah + ")");
    }
}

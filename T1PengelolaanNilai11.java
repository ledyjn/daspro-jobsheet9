import java.util.Scanner;

public class T1PengelolaanNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlah;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("Nilai Rata-rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);

        System.out.println("\nDaftar Nilai Mahasiswa dan Status Kelulusan:");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
    }
}
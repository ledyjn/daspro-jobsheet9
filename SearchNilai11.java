import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = sc.nextInt();
        int[] nilai = new int[jumlah];

        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mohon maaf, nilai " + key + " yang dicari tidak ditemukan.");
        }
    }
}
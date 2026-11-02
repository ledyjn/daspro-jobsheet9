import java.util.Scanner;

public class ArrayRataNilai11 {
    public static void main(String[] args) {
        int[] nilaiMhs = new int[10];
        int total = 0;
        double rata2;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        int jumlahLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Banyaknya mahasiswa yang lulus: " + jumlahLulus);

        if (rata2 >= 85) {
            System.out.println("Predikat: SANGAT BAIK");
        } else if (rata2 >= 70) {
            System.out.println("Predikat: BAIK");
        } else {
            System.out.println("Predikat: PERLU PENDAMPINGAN");
        }

        input.close();
    }
}
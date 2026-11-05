import java.util.Scanner;

public class T2KafeKampus11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };
        int[] harga = { 15000, 13000, 10000, 12000, 8000, 18000, 20000 };

        System.out.println("Daftar Menu Kafe:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("\nCari menu: ");
        String cari = sc.nextLine();
        boolean ketemu = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Harga: Rp " + harga[i]);
                ketemu = true;
                break;
            }
        }

        if (!ketemu) {
            System.out.println("Menu tidak tersedia.");
        }

        System.out.print("\nMasukkan jumlah pesanan: ");
        int jml = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jml];
        int total = 0;

        for (int i = 0; i < jml; i++) {
            System.out.print("Pesanan ke-" + (i + 1) + ": ");
            pesanan[i] = sc.nextLine();

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(pesanan[i])) {
                    total += harga[j];
                    break;
                }
            }
        }

        System.out.println("\n--- Daftar Pesanan ---");
        for (int i = 0; i < jml; i++) {
            System.out.println("- " + pesanan[i]);
        }
        System.out.println("Total Biaya: Rp " + total);
    }
}
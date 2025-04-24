import java.util.Scanner;

public class DosenMain14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahunSekarang = 2025;

        Dosen14[] dsn = {
            new Dosen14(1215, "Budi", "Budi@gmail.com", 2015, "Sistem Informasi", tahunSekarang),
            new Dosen14(1222, "Putri", "Putri@gmail.com", 2010, "Matematika", tahunSekarang),
            new Dosen14(1214, "Doni", "Doni@gmail.com", 2022, "Sistem Operasi", tahunSekarang),
        };

        int pilih;

        do {
            System.out.println("=== MENU SISTEM PENGELOLA DOSEN ===");
            System.out.println("1. Tampilkan Data Dosen");
            System.out.println("2. Urutkan Dosen Berdasarkan NIDN");
            System.out.println("3. Cari Dosen Berdasarkan Nama");
            System.out.println("4. Urutkan Dosen Berdasarkan Masa Kerja");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    for (Dosen14 dataDsn : dsn) {
                        dataDsn.tampilDosen();
                    }
                    break;
                case 2:
                    System.out.println("Pengurutan Dosen Berdasarkan NIDN");
                    Dosen14.urutkanDosen(dsn);
                    for (Dosen14 dataDsn : dsn) {
                        dataDsn.tampilDosen();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan Nama Dosen Yang Dicari: ");
                    String cari = input.nextLine();
                    Dosen14.cariDosen(dsn, cari);
                    break;
                case 4:
                    System.out.println("Pengurutan Dosen Berdasarkan Masa Kerja");
                    Dosen14.urutkanBerdasarkanMasaKerja(dsn);
                    for (Dosen14 dataDsn : dsn) {
                        dataDsn.tampilDosen();
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih != 0);

        input.close();
    }
}

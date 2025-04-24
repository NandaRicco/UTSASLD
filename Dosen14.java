public class Dosen14 {
    int nidn;
    String nama;
    String email;
    int tahunMasuk;
    String programStudi;
    int masaKerja;

    public Dosen14(int nidn, String nama, String email, int tahunMasuk, String programStudi, int tahunSekarang) {
        this.nidn = nidn;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.programStudi = programStudi;
        this.masaKerja = tahunSekarang - tahunMasuk;
    }

    void tampilDosen() {
        System.out.println("=================================");
        System.out.println("Nidn         : " + nidn);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Email        : " + email);
        System.out.println("Tahun Masuk  : " + tahunMasuk);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Masa Kerja   : " + masaKerja + " tahun");
        System.out.println("=================================");
    }

    // Memakai bubble sorting berdasarkan NIDN
    static void urutkanDosen(Dosen14[] daftarDosen) {
        for (int i = 0; i < daftarDosen.length - 1; i++) {
            for (int j = 1; j < daftarDosen.length - i; j++) {
                if (daftarDosen[j].nidn < daftarDosen[j - 1].nidn) {
                    Dosen14 tmp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j - 1];
                    daftarDosen[j - 1] = tmp;
                }
            }
        }
    }

    // Memakai sequential searching berdasarkan nama
    static void cariDosen(Dosen14[] dsn, String cari) {
        boolean ditemukan = false;
        for (int i = 0; i < dsn.length; i++) {
            if (dsn[i].nama.equalsIgnoreCase(cari)) {
                dsn[i].tampilDosen();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Dosen dengan nama " + cari + " tidak ditemukan.");
        }
    }

    // Tambahan: urutkan berdasarkan masa kerja (descending)
    static void urutkanBerdasarkanMasaKerja(Dosen14[] daftarDosen) {
        for (int i = 0; i < daftarDosen.length - 1; i++) {
            for (int j = 0; j < daftarDosen.length - i - 1; j++) {
                if (daftarDosen[j].masaKerja < daftarDosen[j + 1].masaKerja) {
                    Dosen14 tmp = daftarDosen[j];
                    daftarDosen[j] = daftarDosen[j + 1];
                    daftarDosen[j + 1] = tmp;
                }
            }
        }
    }
}

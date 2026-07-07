package main;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        boolean running = true;
        do {
            int pilih = 0;
            boolean putar = true;
            do {
                try {
                    String inputMenu = JOptionPane.showInputDialog(
                        "MENU SISTEM\n\n" +
                        "1. Input Mahasiswa\n" +
                        "2. Input Dosen\n" +
                        "3. Input Karyawan\n" +
                        "4. Laporan Mahasiswa\n" +
                        "5. Laporan Dosen\n" +
                        "6. Laporan Karyawan\n" +
                        "7. Keluar\n\n" +
                        "Pilihan : "
                    );

                    if (inputMenu == null) {
                        System.exit(0); 
                    }

                    pilih = Integer.parseInt(inputMenu);
                    if (pilih >= 1 && pilih <= 7) {
                        putar = false;
                    } else {
                        JOptionPane.showMessageDialog(null, "Masukkan pilihan 1-7.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!");
                }
            } while (putar);

            switch(pilih) {
                // case 1: inputDataMahasiswa(); break;
                // case 2: inputDataDosen(); break;
                // case 3: inputDataKaryawan(); break;
                // case 4: cetakLaporanMahasiswa(); break;
                // case 5: cetakLaporanDosen(); break;
                // case 6: cetakLaporanKaryawan(); break;
                case 7: running = false; break;
            }
        } while(running);
    }
}

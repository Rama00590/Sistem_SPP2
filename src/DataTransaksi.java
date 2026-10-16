

import javax.swing.table.DefaultTableModel;

public class DataTransaksi {

    public static DefaultTableModel model =
        new DefaultTableModel(
            new Object[]{
                "Tanggal",
                "NISN",
                "Nama Siswa",
                "Kelas",
                "ID Petugas",
                "Nama Petugas",
                "Bulan&Tahun",
                "Nominal",
                "Status"
                
            }, 0
        );
}

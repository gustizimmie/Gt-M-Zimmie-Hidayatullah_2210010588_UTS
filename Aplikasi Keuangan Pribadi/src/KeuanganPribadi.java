import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Pongo
 */
public class KeuanganPribadi extends javax.swing.JFrame {

    /**
     * Creates new form KeuanganPribadi
     */
    public KeuanganPribadi() {
        initComponents();
        // Memanggil metode `tampil_tanggal` untuk menampilkan tanggal saat ini di UI, memastikan informasi tanggal selalu diperbarui.
        tampil_tanggal();

        // Memanggil metode `tampil_jam` untuk menampilkan jam saat ini di UI, memastikan informasi waktu selalu diperbarui.
        tampil_jam();
    }
   
        
    public void hapus() {
        // Mengosongkan field input untuk Nama Transaksi, sehingga siap untuk diisi dengan data baru.
        txtNamaTransaksi.setText("");
        
        // Mengosongkan field DateChooser (tanggal) dengan mengatur tanggalnya menjadi null, memastikan tidak ada tanggal yang terpilih.
        dateChooser.setDate(null);     
        
        // Mengatur pilihan pertama pada dropdown (combo box) Jenis Transaksi, kembali ke nilai default (biasanya pilihan pertama di dropdown).
        comboJenisTransaksi.setSelectedIndex(0);
        
        // Mengosongkan field input untuk Nominal, memastikan tidak ada nilai yang tersisa di dalamnya.
        txtNominal.setText("");  
        
        // Mengosongkan text area Keterangan, sehingga siap untuk diisi dengan informasi baru.
        areaKeterangan.setText("");
    }
    public void tampil_tanggal() {
            // Mendapatkan tanggal sekarang
            LocalDate tanggalSekarang = LocalDate.now();

            // Menentukan format tanggal
            DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Mengonversi tanggal menjadi String
            String tanggal = tanggalSekarang.format(formatTanggal);

            // Menampilkan tanggal sekarang pada dateChooser
            dateChooser.setDate(java.sql.Date.valueOf(tanggalSekarang));

            // Menampilkan tanggal di label tanggal
            lbTanggal.setText("Tanggal : " + tanggal);
    }
    public void tampil_jam() {
            // Membuat timer untuk memperbarui waktu setiap detik
            Timer timer = new Timer(1000, (ActionEvent evt) -> {
                // Mendapatkan waktu saat ini
                LocalTime waktuSekarang = LocalTime.now();

                // Mengatur format waktu
                String jam = String.format("%02d", waktuSekarang.getHour());
                String menit = String.format("%02d", waktuSekarang.getMinute());
                String detik = String.format("%02d", waktuSekarang.getSecond());

                // Mengatur teks pada label `lbWaktu` dengan format waktu "Waktu : hh:mm:ss"
                lbWaktu.setText("Waktu : " + jam + ":" + menit + ":" + detik);
            });

            // Memulai timer
            timer.start();
    }   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNamaTransaksi = new javax.swing.JTextField();
        txtNominal = new javax.swing.JTextField();
        comboJenisTransaksi = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaKeterangan = new javax.swing.JTextArea();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        lbTanggal = new javax.swing.JLabel();
        lbWaktu = new javax.swing.JLabel();
        btnMuatData = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nama Transaksi ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 108, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Transaksi");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 108, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tanggal Transaksi");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 122, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nominal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 108, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Keterangan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 108, -1));

        txtNamaTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtNamaTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 371, -1));

        txtNominal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNominal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNominalKeyTyped(evt);
            }
        });
        jPanel1.add(txtNominal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 371, -1));

        comboJenisTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboJenisTransaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pemasukan", "Pengeluaran" }));
        comboJenisTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJenisTransaksiActionPerformed(evt);
            }
        });
        jPanel1.add(comboJenisTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 371, -1));
        jPanel1.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 371, 26));

        areaKeterangan.setColumns(20);
        areaKeterangan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        areaKeterangan.setRows(5);
        jScrollPane1.setViewportView(areaKeterangan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 371, 102));

        btnBatal.setBackground(new java.awt.Color(51, 153, 255));
        btnBatal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        jPanel1.add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        btnSimpan.setBackground(new java.awt.Color(51, 153, 255));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        btnHapus.setBackground(new java.awt.Color(51, 153, 255));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        btnKeluar.setBackground(new java.awt.Color(255, 51, 51));
        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, -1));

        btnUbah.setBackground(new java.awt.Color(51, 153, 255));
        btnUbah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel1.add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        btnImport.setBackground(new java.awt.Color(0, 156, 89));
        btnImport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImport.setForeground(new java.awt.Color(255, 255, 255));
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        jPanel1.add(btnImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        btnExport.setBackground(new java.awt.Color(0, 156, 89));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

        tabel.setBackground(new java.awt.Color(204, 204, 204));
        tabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Transaksi", "Taanggal Transaksi", "Jenis Transaksi", "Nominal", "Keterangan"
            }
        ));
        jScrollPane2.setViewportView(tabel);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 498, 102));

        lbTanggal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTanggal.setText("Tanggal");
        jPanel1.add(lbTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 139, -1));

        lbWaktu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbWaktu.setText("Waktu");
        jPanel1.add(lbWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 108, -1));

        btnMuatData.setBackground(new java.awt.Color(51, 51, 255));
        btnMuatData.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMuatData.setForeground(new java.awt.Color(255, 255, 255));
        btnMuatData.setText("Muat Data");
        btnMuatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuatDataActionPerformed(evt);
            }
        });
        jPanel1.add(btnMuatData, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 560, 550));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APLIKASI KEUANGAN PRIBADI");
        jPanel4.add(jLabel2);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
             // Konfirmasi sebelum keluar aplikasi
            int confirm = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0); // Menutup aplikasi
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
            // Membuka dialog untuk memilih lokasi dan nama file
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Simpan File"); // Mengatur judul dialog untuk menyimpan file
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text Files", "txt")); // Memfilter hanya file .txt
            int result = fileChooser.showSaveDialog(null); // Menampilkan dialog untuk memilih lokasi dan nama file

            if (result == JFileChooser.APPROVE_OPTION) { // Jika pengguna memilih lokasi dan nama file
                File file = fileChooser.getSelectedFile(); // Mendapatkan file yang dipilih

                // Menambahkan ekstensi .txt jika belum ada
                if (!file.getName().endsWith(".txt")) {
                    file = new File(file.getAbsolutePath() + ".txt"); // Menambahkan ekstensi .txt secara otomatis
                }

                BufferedWriter writer = null;
                try {
                    writer = new BufferedWriter(new FileWriter(file)); // Membuat BufferedWriter untuk menulis ke file

                    DefaultTableModel model = (DefaultTableModel) tabel.getModel(); // Mendapatkan model tabel untuk data yang ingin disimpan

                    // Menulis data dari tabel ke file
                    for (int i = 0; i < model.getRowCount(); i++) { // Iterasi untuk setiap baris dalam tabel
                        StringBuilder row = new StringBuilder();
                        for (int j = 0; j < model.getColumnCount(); j++) { // Iterasi untuk setiap kolom dalam baris
                            row.append(model.getValueAt(i, j).toString()); // Mendapatkan nilai setiap sel dalam tabel
                            if (j < model.getColumnCount() - 1) { 
                                row.append("\t");  // Pisahkan kolom dengan tab
                            }
                        }
                        writer.write(row.toString()); // Menulis baris data ke file
                        writer.newLine(); // Menambahkan baris baru setelah setiap baris data
                    }
                    // Menampilkan pesan sukses setelah data berhasil diekspor
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diekspor ke File");
                } catch (IOException ex) {
                    // Menampilkan pesan kesalahan jika terjadi masalah saat menyimpan file
                    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat Menyimpan File: " + ex.getMessage());
                } finally {
                    try {
                        if (writer != null) {
                            writer.close(); // Menutup BufferedWriter setelah selesai menulis ke file
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace(); // Menangani pengecualian jika terjadi kesalahan saat menutup writer
                    }
                }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
                // Mendapatkan model tabel yang digunakan untuk mengelola data
                DefaultTableModel model = (DefaultTableModel) tabel.getModel();

                // Mendapatkan indeks baris yang dipilih di tabel
                int selectedRow = tabel.getSelectedRow(); // Mengambil indeks baris yang dipilih oleh pengguna

                // Mengecek apakah ada kolom yang kosong
                if (txtNamaTransaksi.getText().trim().equals("") || dateChooser.getDate() == null
                    || comboJenisTransaksi.getSelectedItem() == null || txtNominal.getText().trim().equals("")
                    || areaKeterangan.getText().trim().equals("")) {

                    // Validasi khusus jika kategori belum dipilih
                    if (comboJenisTransaksi.getSelectedItem().toString().equals("-- Pilih --")) {
                        JOptionPane.showMessageDialog(null, "Silakan pilih jenis transaksi terlebih dahulu!");
                    } else {
                        // Jika ada kolom lainnya yang kosong, tampilkan pesan peringatan
                        JOptionPane.showMessageDialog(null, "Data Yang Anda Masukkan Belum Lengkap! Silahkan Ulangi Lagi!");
                    }
                } else {
                    // Jika ada baris yang dipilih (edit mode)
                    if (selectedRow != -1) {
                        // Mengubah data pada baris yang dipilih
                        model.setValueAt(txtNamaTransaksi.getText(), selectedRow, 0);          // Kolom 1: Nama Transaksi
                        model.setValueAt(dateChooser.getDate(), selectedRow, 1);              // Kolom 2: Tanggal
                        model.setValueAt(comboJenisTransaksi.getSelectedItem().toString(), selectedRow, 2); // Kolom 3: Jenis Transaksi
                        model.setValueAt(txtNominal.getText(), selectedRow, 3);                // Kolom 4: Nominal
                        model.setValueAt(areaKeterangan.getText(), selectedRow, 4);             // Kolom 5: Keterangan

                        JOptionPane.showMessageDialog(null, "Data Keuangan Berhasil Diubah");
                    } else {
                        // Jika tidak ada baris yang dipilih, tambahkan baris baru
                        model.addRow(new Object[]{
                            txtNamaTransaksi.getText(), // Menambahkan Nama Transaksi
                            dateChooser.getDate(),      // Menambahkan Tanggal
                            comboJenisTransaksi.getSelectedItem().toString(), // Menambahkan Jenis Transaksi
                            txtNominal.getText(),       // Menambahkan Nominal
                            areaKeterangan.getText()    // Menambahkan Keterangan
                        });

                        JOptionPane.showMessageDialog(null, "Data Keuangan Berhasil Disimpan");
                    }

                    // Simpan data tabel ke file setelah perubahan
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("dataKeuangan.txt"))) {
                        int rowCount = model.getRowCount();
                        int columnCount = model.getColumnCount();

                        // Tulis header kolom ke file
                        for (int col = 0; col < columnCount; col++) {
                            writer.write(model.getColumnName(col));
                            if (col < columnCount - 1) {
                                writer.write("\t");
                            }
                        }
                        writer.newLine();

                        // Tulis data baris ke file
                        for (int row = 0; row < rowCount; row++) {
                            for (int col = 0; col < columnCount; col++) {
                                writer.write(model.getValueAt(row, col).toString());
                                if (col < columnCount - 1) {
                                    writer.write("\t");
                                }
                            }
                            writer.newLine();
                        }
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan file: " + ex.getMessage());
                    }

                    // Menghapus data yang ada di form setelah data dimasukkan ke tabel
                    hapus(); // Fungsi hapus() mengatur ulang form, membersihkan semua input pengguna
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
            }



        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        hapus();// Fungsi hapus() mengatur ulang form, membersihkan semua input pengguna
        
        // Membatalkan semua pemilihan pada tabel
        tabel.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed


    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
            // Mendapatkan model tabel yang digunakan untuk mengelola data
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();

            // Mendapatkan indeks baris yang dipilih di tabel
            int selectedRow = tabel.getSelectedRow(); // Mendapatkan indeks baris yang dipilih oleh pengguna

            // Mengecek apakah ada baris yang dipilih
            if (selectedRow != -1) { // Jika ada baris yang dipilih (indeks bukan -1)
                // Mengambil data dari baris yang dipilih dan menampilkan ke dalam field
                String namaTransaksi = model.getValueAt(selectedRow, 0).toString();  // Kolom 1: Nama Transaksi
                String tanggal = model.getValueAt(selectedRow, 1).toString();       // Kolom 2: Tanggal
                String jenisTransaksi = model.getValueAt(selectedRow, 2).toString(); // Kolom 3: Jenis Transaksi
                String nominal = model.getValueAt(selectedRow, 3).toString();       // Kolom 4: Nominal
                String keterangan = model.getValueAt(selectedRow, 4).toString();    // Kolom 5: Keterangan

                // Menampilkan data yang diambil di field input untuk diedit
                txtNamaTransaksi.setText(namaTransaksi); // Mengisi field Nama Transaksi dengan nilai yang diambil dari tabel

                // Parsing tanggal yang diambil dari tabel dan menampilkannya di dateChooser
                try {
                    // Format tanggal yang ada di tabel sesuai dengan format yang diinginkan
                    SimpleDateFormat formatTanggal = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                    Date date = formatTanggal.parse(tanggal); // Mengubah string tanggal menjadi objek Date
                    dateChooser.setDate(date);               // Mengisi field Tanggal dengan objek Date yang sudah diparsing
                } catch (ParseException ex) {
                    ex.printStackTrace();
                    // Menampilkan pesan jika format tanggal tidak sesuai
                    JOptionPane.showMessageDialog(null, "Format Tanggal Tidak Valid");
                }

                // Mengisi dropdown Jenis Transaksi dengan nilai yang sesuai dari tabel
                comboJenisTransaksi.setSelectedItem(jenisTransaksi); 

                // Mengisi field Nominal dengan nilai yang diambil dari tabel
                txtNominal.setText(nominal);

                // Mengisi area Keterangan dengan nilai yang diambil dari tabel
                areaKeterangan.setText(keterangan);

                // Menampilkan pesan bahwa data siap untuk diubah
                JOptionPane.showMessageDialog(null, "Silakan Ubah Data dan Klik Simpan");
            } else {
                // Jika tidak ada baris yang dipilih (indeks -1), tampilkan pesan peringatan
                JOptionPane.showMessageDialog(null, "Pilih baris yang ingin diubah terlebih dahulu!");
            }
          // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
            // Mendapatkan model tabel yang digunakan untuk menampilkan data
            DefaultTableModel model = (DefaultTableModel) tabel.getModel();

            // Mendapatkan baris yang dipilih (indeks baris yang dipilih dalam tabel)
            int[] selectedRows = tabel.getSelectedRows(); // Menyimpan indeks baris yang dipilih pengguna

            // Memeriksa apakah ada baris yang dipilih
            if (selectedRows.length == 0) { // Jika tidak ada baris yang dipilih, array selectedRows kosong
                JOptionPane.showMessageDialog(null, "Pilih data keuangan yang ingin dihapus!");
                return; // Keluar dari fungsi jika tidak ada baris yang dipilih
            }

            // Menampilkan dialog konfirmasi untuk menghapus data
            int confirm = JOptionPane.showConfirmDialog(
                    null, // Parent component (null berarti tanpa parent)
                    "Apakah Anda yakin ingin menghapus data yang dipilih?", // Pesan konfirmasi
                    "Konfirmasi Hapus", // Judul dialog
                    JOptionPane.YES_NO_OPTION // Pilihan Yes atau No
            );

            // Memeriksa apakah pengguna memilih "Yes" (setuju untuk menghapus)
            if (confirm == JOptionPane.YES_OPTION) { 
                // Menghapus baris yang dipilih, dimulai dari baris terakhir untuk menghindari masalah pergeseran indeks
                for (int i = selectedRows.length - 1; i >= 0; i--) {
                    int selectedRow = selectedRows[i];
                    model.removeRow(selectedRow); // Menghapus baris yang dipilih dari model tabel
                }

                // Perbarui file setelah penghapusan
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("dataKeuangan.txt"))) {
                    int rowCount = model.getRowCount();
                    int columnCount = model.getColumnCount();

                    // Tulis header kolom ke file
                    for (int col = 0; col < columnCount; col++) {
                        writer.write(model.getColumnName(col));
                        if (col < columnCount - 1) {
                            writer.write("\t");
                        }
                    }
                    writer.newLine();

                    // Tulis ulang data tabel yang tersisa ke file
                    for (int row = 0; row < rowCount; row++) {
                        for (int col = 0; col < columnCount; col++) {
                            writer.write(model.getValueAt(row, col).toString());
                            if (col < columnCount - 1) {
                                writer.write("\t");
                            }
                        }
                        writer.newLine();
                    }

                    JOptionPane.showMessageDialog(null, "Data keuangan berhasil dihapus dan file diperbarui");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memperbarui file: " + ex.getMessage());
                }
            }
    // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
            // Membuka dialog file untuk memilih file txt
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text Files", "txt")); // Memfilter hanya file .txt
            int result = fileChooser.showOpenDialog(null); // Menampilkan dialog file untuk memilih file

            if (result == JFileChooser.APPROVE_OPTION) { // Jika file dipilih
                File file = fileChooser.getSelectedFile(); // Mendapatkan file yang dipilih
                BufferedReader reader = null;

                try {
                    // Membaca file
                    reader = new BufferedReader(new FileReader(file)); // Membaca file teks
                    String line;
                    DefaultTableModel model = (DefaultTableModel) tabel.getModel(); // Mendapatkan model tabel untuk menambahkan data

                    // Menghapus semua baris yang ada di tabel (opsional, bisa diaktifkan jika ingin membersihkan tabel terlebih dahulu)
                    // model.setRowCount(0); // Jika ingin menghapus data lama sebelum menambah yang baru, hilangkan komentar ini

                    while ((line = reader.readLine()) != null) { // Membaca setiap baris dalam file
                        // Memisahkan data berdasarkan delimiter (misalnya koma atau tab)
                        String[] data = line.split("\t"); // Misalnya, data dipisahkan dengan tab (\t)

                        // Memeriksa apakah data memiliki panjang yang benar, sesuai dengan kolom yang dibutuhkan
                        if (data.length == 5) {
                            String namaTransaksi = data[0];  // Nama transaksi
                            String tanggal = data[1];  // Tanggal transaksi
                            String jenisTransaksi = data[2];  // Jenis transaksi (debit/credit)
                            String nominal = data[3];  // Nominal transaksi
                            String keterangan = data[4];  // Keterangan transaksi

                            // Menambahkan data ke dalam tabel
                            model.addRow(new Object[]{namaTransaksi, tanggal, jenisTransaksi, nominal, keterangan});
                        }
                    }

                    // Menampilkan pesan sukses setelah data berhasil diimpor
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diimpor dari File");

                } catch (IOException ex) {
                    // Menampilkan pesan jika terjadi kesalahan saat membaca file
                    JOptionPane.showMessageDialog(null, "Terjadi Kesalahan saat Membaca File: " + ex.getMessage());
                } finally {
                    try {
                        if (reader != null) {
                            reader.close(); // Menutup BufferedReader untuk melepaskan sumber daya
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace(); // Menangani pengecualian jika terjadi kesalahan saat menutup reader
                    }
                }
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportActionPerformed

    private void txtNominalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNominalKeyTyped
            char c = evt.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    evt.consume(); // Hanya izinkan angka dan titik desimal
                }         // TODO add your handling code here:
    }//GEN-LAST:event_txtNominalKeyTyped

    private void comboJenisTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJenisTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJenisTransaksiActionPerformed

    private void btnMuatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuatDataActionPerformed
            try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Data Zimmie\\Kuliah\\Semester 5\\PEMROGRAMAN BERBASIS OBJEK 2\\Latihan\\Gt-M-Zimmie-Hidayatullah_2210010588_UTS\\Aplikasi Keuangan Pribadi\\dataKeuangan.txt"))) {
            String line;
            DefaultTableModel tableModel = (DefaultTableModel) tabel.getModel(); 
            tableModel.setRowCount(0); // Hapus semua data sebelumnya

            // Baca header (baris pertama) dan abaikan
            line = reader.readLine(); // Membaca header
            if (line == null) { // Jika file kosong (tidak ada header)
                JOptionPane.showMessageDialog(this, "Data belum ada dalam file!");
                return; // Keluar dari fungsi
            }

            // Baca data baris demi baris
            boolean dataFound = false; // Indikator apakah data ditemukan
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t"); // Pisahkan berdasarkan tab
                tableModel.addRow(parts); // Tambahkan ke tabel
                dataFound = true; // Set true jika ada data
            }

            if (!dataFound) { // Jika tidak ada data setelah header
                JOptionPane.showMessageDialog(this, "Data belum ada dalam file!");
            } else {
                JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari file TXT!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
         // TODO add your handling code here:
    }//GEN-LAST:event_btnMuatDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeuanganPribadi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeuanganPribadi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaKeterangan;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnMuatData;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> comboJenisTransaksi;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTanggal;
    private javax.swing.JLabel lbWaktu;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtNamaTransaksi;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
}

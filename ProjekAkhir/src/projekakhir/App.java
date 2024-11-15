package projekakhir;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

public class App extends javax.swing.JFrame {
    private Connection conn;
    private int currentUserId;
    
    public App() {
        initComponents();
        conn = koneksi.getConnection();
        loadTabunganIntoComboBox();
        loadDataToTable();
        loadDataTabungan();
        initComboBox();
    }
    
    private void initComboBox() {
    comboBox_tabungan.removeAllItems();
    comboBox_tabungan.addItem("Pilih Tabungan"); 
    }
    
    public void setUserId(int userId) {
        this.currentUserId = userId; 
        loadDataTabungan();          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        waktu_deadline_grup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username_login = new javax.swing.JTextField();
        tombol_login = new javax.swing.JButton();
        password_login = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        keluar1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_tabungan = new javax.swing.JTable();
        keluar2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        comboBox_tabungan = new javax.swing.JComboBox<>();
        jumlah_uang = new javax.swing.JTextField();
        tombol_tabung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        keluar3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tabungan_baru = new javax.swing.JTextField();
        target_uang = new javax.swing.JTextField();
        radio_2minggu = new javax.swing.JRadioButton();
        radio_1bulan = new javax.swing.JRadioButton();
        radio_3bulan = new javax.swing.JRadioButton();
        radio_6bulan = new javax.swing.JRadioButton();
        tombol_tambah = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        keluar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("SIMPLE SAVE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mutia\\Documents\\Dokumen milik Tara\\Semester 3\\PEMVIS\\money.png")); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 320, 280));

        jPanel3.setBackground(new java.awt.Color(238, 238, 238));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel8.setText("Password");

        tombol_login.setText("LOGIN");
        tombol_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_login)
                            .addComponent(password_login, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(tombol_login)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(username_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(password_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(tombol_login)
                .addGap(24, 24, 24))
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 390, 270));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setText("LOGIN DULU SKUY");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        keluar1.setText("EXIT");
        keluar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar1ActionPerformed(evt);
            }
        });
        jPanel6.add(keluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTabbedPane1.addTab("LOGIN", jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mutia\\Documents\\Dokumen milik Tara\\Semester 3\\PEMVIS\\money.png")); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 330, 260));

        tabel_tabungan.setBackground(new java.awt.Color(236, 236, 236));
        tabel_tabungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tabungan", "Target", "Pencapaian", "Waktu Deadline"
            }
        ));
        tabel_tabungan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_tabunganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_tabungan);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 450, 320));

        keluar2.setText("EXIT");
        keluar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar2ActionPerformed(evt);
            }
        });
        jPanel7.add(keluar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTabbedPane1.addTab("DASHBOARD", jPanel7);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\mutia\\Documents\\Dokumen milik Tara\\Semester 3\\PEMVIS\\money.png")); // NOI18N
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 330, 260));

        jPanel4.setBackground(new java.awt.Color(235, 235, 235));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel9.setText("Tabungan");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel10.setText("Jumlah Uang");

        comboBox_tabungan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih tabungan--", "Item 2", "Item 3", "Item 4" }));

        tombol_tabung.setText("TABUNG");
        tombol_tabung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tabungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBox_tabungan, 0, 166, Short.MAX_VALUE)
                            .addComponent(jumlah_uang)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(tombol_tabung)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboBox_tabungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jumlah_uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(tombol_tabung)
                .addGap(23, 23, 23))
        );

        jPanel9.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 89, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setText("MAU NABUNG LAGI ?");
        jPanel9.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        keluar3.setText("EXIT");
        keluar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar3ActionPerformed(evt);
            }
        });
        jPanel9.add(keluar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTabbedPane1.addTab("TABUNG", jPanel9);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\mutia\\Documents\\Dokumen milik Tara\\Semester 3\\PEMVIS\\money.png")); // NOI18N
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 330, 260));

        jPanel5.setBackground(new java.awt.Color(234, 234, 234));

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel13.setText("Tabungan Baru");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel14.setText("Target");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel15.setText("Waktu Deadline");

        waktu_deadline_grup.add(radio_2minggu);
        radio_2minggu.setText("2 Minggu");

        waktu_deadline_grup.add(radio_1bulan);
        radio_1bulan.setText("1 Bulan");

        waktu_deadline_grup.add(radio_3bulan);
        radio_3bulan.setText("3 Bulan");

        waktu_deadline_grup.add(radio_6bulan);
        radio_6bulan.setText("6 Bulan");

        tombol_tambah.setText("TAMBAH");
        tombol_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(38, 38, 38)
                        .addComponent(tabungan_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_2minggu)
                            .addComponent(target_uang, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio_1bulan)
                            .addComponent(radio_3bulan)
                            .addComponent(radio_6bulan)
                            .addComponent(tombol_tambah))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tabungan_baru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(target_uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(radio_2minggu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_1bulan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_3bulan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radio_6bulan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(tombol_tambah)
                .addGap(16, 16, 16))
        );

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 400, 280));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setText("TAMBAH LIST TABUNGAN MU ?");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        keluar4.setText("EXIT");
        keluar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluar4ActionPerformed(evt);
            }
        });
        jPanel8.add(keluar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTabbedPane1.addTab("TAMBAH TABUNGAN", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_loginActionPerformed
        String username = username_login.getText();
        String password = new String(password_login.getPassword());
        loginOrRegister(username, password);
        username_login.setText("");
        password_login.setText("");
    }//GEN-LAST:event_tombol_loginActionPerformed

    // Registrasi dan Login
    private void loginOrRegister(String username, String password) {
        try {
            String checkQuery = "SELECT id FROM tb_login WHERE username = ? AND password = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            checkStmt.setString(2, password);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                currentUserId = rs.getInt("id");
                JOptionPane.showMessageDialog(null, "Login berhasil", "Info", JOptionPane.INFORMATION_MESSAGE);
                loadTabunganIntoComboBox();
                loadDataTabungan();
            } else {
                String insertQuery = "INSERT INTO tb_login (username, password) VALUES (?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
                insertStmt.setString(1, username);
                insertStmt.setString(2, password);
                insertStmt.executeUpdate();

                ResultSet generatedKeys = insertStmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    currentUserId = generatedKeys.getInt(1);
                }

            JOptionPane.showMessageDialog(null, "Akun baru dibuat dan login berhasil.", "Info", JOptionPane.INFORMATION_MESSAGE);
            insertStmt.close();

            loadTabunganIntoComboBox();
            loadDataTabungan();
        }
        rs.close();
        checkStmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal login atau registrasi: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void tombol_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambahActionPerformed
        try {
            String tabungan = tabungan_baru.getText();  
            String targetInput = target_uang.getText(); 
            String waktuDeadline = getSelectedDeadline();

            if (tabungan.isEmpty() || targetInput.isEmpty() || waktuDeadline == null) {
                JOptionPane.showMessageDialog(null, "Semua data harus diisi.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double target = Double.parseDouble(targetInput);

            // Query untuk menambahkan tabungan baru ke database, termasuk user_id
            String insertQuery = "INSERT INTO tb_tambah_tabungan (tabungan, target, waktu_deadline, user_id) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insertQuery);

            stmt.setString(1, tabungan);         // Set nama tabungan
            stmt.setDouble(2, target);           // Set target
            stmt.setString(3, waktuDeadline);    // Set waktu deadline
            stmt.setInt(4, currentUserId);       // Set user_id dari pengguna yang sedang login

            stmt.executeUpdate();  // Menjalankan query insert
            stmt.close();

            JOptionPane.showMessageDialog(null, "Tabungan baru berhasil ditambahkan.", "Info", JOptionPane.INFORMATION_MESSAGE);

            // Tambahkan tabungan baru ke comboBox dan tabel tampilan
            addTabunganToComboBox(tabungan);
            loadDataToTable();  // Muat ulang tabel untuk menampilkan data terbaru

            // Kosongkan input setelah tabungan ditambahkan
            tabungan_baru.setText("");
            target_uang.setText("");
            waktu_deadline_grup.clearSelection();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Target harus berupa angka.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan tabungan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tombol_tambahActionPerformed

    private void tombol_tabungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tabungActionPerformed
        try {
            String selectedTabungan = (String) comboBox_tabungan.getSelectedItem();
            if (selectedTabungan == null || selectedTabungan.equals("Pilih Tabungan")) {
                JOptionPane.showMessageDialog(null, "Pilih tabungan yang ingin ditambahkan.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String tabunganInput = jumlah_uang.getText();
            if (tabunganInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Masukkan nominal uang yang ingin ditabung.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                return;
            }
            double tambahanTabungan = Double.parseDouble(tabunganInput);
            String insertQuery = "INSERT INTO tb_tabung (tabungan, jumlah_uang, user_id) VALUES (?, ?, ?)";
            PreparedStatement stmtInsert = conn.prepareStatement(insertQuery);
            stmtInsert.setString(1, selectedTabungan);
            stmtInsert.setDouble(2, tambahanTabungan);
            stmtInsert.setInt(3, currentUserId);
            stmtInsert.executeUpdate();
            stmtInsert.close();

            JOptionPane.showMessageDialog(null, "Uang berhasil disimpan ke tabungan.", "Info", JOptionPane.INFORMATION_MESSAGE);
            
            loadDataTabungan();

            jumlah_uang.setText("");
            comboBox_tabungan.setSelectedIndex(0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Nominal tabungan harus berupa angka.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menambahkan tabungan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tombol_tabungActionPerformed
    
    private void addTabunganToComboBox(String namaTabungan) {
        comboBox_tabungan.addItem(namaTabungan);
    }

    private void loadTabunganIntoComboBox() {
        try {
            comboBox_tabungan.removeAllItems();
            comboBox_tabungan.addItem("Pilih Tabungan"); 

            String query = "SELECT tabungan FROM tb_tambah_tabungan WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, currentUserId); 
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String namaTabungan = rs.getString("tabungan");
                comboBox_tabungan.addItem(namaTabungan);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data tabungan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateTabelTabungan(double tabungan, double target, double progresPencapaian, long remainingDays) {
        DefaultTableModel model = (DefaultTableModel) tabel_tabungan.getModel();
        model.setRowCount(0);
        
        model.addRow(new Object[]{
            tabungan,            
            target,               
            String.format("%.2f", progresPencapaian) + "%", 
            remainingDays       
        });
    }
    
//    Tanggal sesuai Deadline
    private String getSelectedDeadline() {
        Calendar calendar = Calendar.getInstance(); 

        if (radio_2minggu.isSelected()) {
            calendar.add(Calendar.WEEK_OF_YEAR, 2);
        } else if (radio_1bulan.isSelected()) {
            calendar.add(Calendar.MONTH, 1); 
        } else if (radio_3bulan.isSelected()) {
            calendar.add(Calendar.MONTH, 3); 
        } else if (radio_6bulan.isSelected()) {
            calendar.add(Calendar.MONTH, 6); 
        } else {
            return null; 
        }

        Date deadlineDate = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(deadlineDate);
    }
    
    private void tabel_tabunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_tabunganMouseClicked
        int row = tabel_tabungan.rowAtPoint(evt.getPoint());
        if (row == -1) {
        JOptionPane.showMessageDialog(null, "Pilih tabungan yang ingin dihapus.", "Kesalahan", JOptionPane.WARNING_MESSAGE);
        return;
        }
        System.out.println("Baris yang diklik: " + row);
        int confirm = JOptionPane.showConfirmDialog(null, 
            "Apakah Anda yakin ingin menghapus tabungan ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String namaTabungan = (String) tabel_tabungan.getValueAt(row, 0);

                String deleteTbTabungQuery = "DELETE FROM tb_tabung WHERE tabungan = ?";
                PreparedStatement stmtTabung = conn.prepareStatement(deleteTbTabungQuery);
                stmtTabung.setString(1, namaTabungan);
                stmtTabung.executeUpdate();
                stmtTabung.close();

                String deleteTbTambahTabunganQuery = "DELETE FROM tb_tambah_tabungan WHERE tabungan = ?";
                PreparedStatement stmtTambahTabungan = conn.prepareStatement(deleteTbTambahTabunganQuery);
                stmtTambahTabungan.setString(1, namaTabungan);
                stmtTambahTabungan.executeUpdate();
                stmtTambahTabungan.close();

                DefaultTableModel model = (DefaultTableModel) tabel_tabungan.getModel();
                model.removeRow(row);
                comboBox_tabungan.removeItem(namaTabungan);

                String resetAutoIncrementTbTambahTabunganQuery = "ALTER TABLE tb_tambah_tabungan AUTO_INCREMENT = 1";
                Statement stmtResetTambah = conn.createStatement();
                stmtResetTambah.executeUpdate(resetAutoIncrementTbTambahTabunganQuery);
                stmtResetTambah.close();

                String resetAutoIncrementTbTabungQuery = "ALTER TABLE tb_tabung AUTO_INCREMENT = 1";
                Statement stmtResetTabung = conn.createStatement();
                stmtResetTabung.executeUpdate(resetAutoIncrementTbTabungQuery);
                stmtResetTabung.close();

                JOptionPane.showMessageDialog(null, "Tabungan berhasil dihapus.", "Info", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal menghapus tabungan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tabel_tabunganMouseClicked

    private void keluar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar1ActionPerformed
        dispose();
    }//GEN-LAST:event_keluar1ActionPerformed

    private void keluar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar2ActionPerformed
        dispose();
    }//GEN-LAST:event_keluar2ActionPerformed

    private void keluar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar3ActionPerformed
        dispose();
    }//GEN-LAST:event_keluar3ActionPerformed

    private void keluar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluar4ActionPerformed
        dispose();
    }//GEN-LAST:event_keluar4ActionPerformed

    private void loadDataTabungan() {
        try {
            String query = "SELECT t.tabungan, t.target, t.waktu_deadline, COALESCE(SUM(b.jumlah_uang), 0) AS total_tabungan " +
                           "FROM tb_tambah_tabungan t " +
                           "LEFT JOIN tb_tabung b ON t.tabungan = b.tabungan AND t.user_id = b.user_id " +
                           "WHERE t.user_id = ? " +
                           "GROUP BY t.tabungan, t.target, t.waktu_deadline";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, currentUserId); 
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tabel_tabungan.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                String namaTabungan = rs.getString("tabungan");
                double target = rs.getDouble("target");
                double jumlahTabungan = rs.getDouble("total_tabungan");
                String waktuDeadline = rs.getString("waktu_deadline");

                double pencapaian = (jumlahTabungan / target) * 100;

                model.addRow(new Object[]{
                    namaTabungan,
                    target,
                    String.format("%.2f", pencapaian) + "%",
                    waktuDeadline
                });
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }

// hitung pencapaian
    private double calculatePencapaian(String tabungan, double target) {
        double tabunganSaatIni = 0; 
        return (tabunganSaatIni / target) * 100;
    }

//    input data ke tabel
    private void loadDataToTable() {
        try {
            String query = "SELECT tabungan, target, waktu_deadline FROM tb_tambah_tabungan WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, currentUserId);
            ResultSet rs = stmt.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabel_tabungan.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                String tabungan = rs.getString("tabungan");
                double target = rs.getDouble("target");
                String waktu_deadline = rs.getString("waktu_deadline");

                double totalUangDitabung = getTotalUangDitabung(tabungan);
                double pencapaian = (totalUangDitabung / target) * 100;

                model.addRow(new Object[]{
                    tabungan, 
                    target, 
                    String.format("%.2f%%", pencapaian), 
                    waktu_deadline
                });
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal memuat data: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // menghitung total uang yang telah ditabung 
    private double getTotalUangDitabung(String tabungan) {
        double total = 0;
        try {
            String query = "SELECT SUM(jumlah_uang) AS total FROM tb_tabung WHERE user_id = ? AND tabungan = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, currentUserId);  
            stmt.setString(2, tabungan);   
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                total = rs.getDouble("total"); 
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghitung tabungan: " + e.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        return total;
    }
    
    private String getSelectedDeadlineFromWaktuDeadline(String waktu_deadline) {
    Calendar calendar = Calendar.getInstance(); 

    switch (waktu_deadline) {
        case "2 Minggu":
            calendar.add(Calendar.WEEK_OF_YEAR, 2);
            break;
        case "1 Bulan":
            calendar.add(Calendar.MONTH, 1);
            break;
        case "3 Bulan":
            calendar.add(Calendar.MONTH, 3);
            break;
        case "6 Bulan":
            calendar.add(Calendar.MONTH, 6);
            break;
        default:
            return null;
    }

    Date deadlineDate = calendar.getTime();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(deadlineDate);
}
    
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox_tabungan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jumlah_uang;
    private javax.swing.JButton keluar1;
    private javax.swing.JButton keluar2;
    private javax.swing.JButton keluar3;
    private javax.swing.JButton keluar4;
    private javax.swing.JPasswordField password_login;
    private javax.swing.JRadioButton radio_1bulan;
    private javax.swing.JRadioButton radio_2minggu;
    private javax.swing.JRadioButton radio_3bulan;
    private javax.swing.JRadioButton radio_6bulan;
    private javax.swing.JTable tabel_tabungan;
    private javax.swing.JTextField tabungan_baru;
    private javax.swing.JTextField target_uang;
    private javax.swing.JButton tombol_login;
    private javax.swing.JButton tombol_tabung;
    private javax.swing.JButton tombol_tambah;
    private javax.swing.JTextField username_login;
    private javax.swing.ButtonGroup waktu_deadline_grup;
    // End of variables declaration//GEN-END:variables

    
}

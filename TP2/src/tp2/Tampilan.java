/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP2;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class Tampilan extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = TP2.Koneksi();
    
    /**
     * Creates new form Tampilan
     */
    
    public Tampilan() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(false);
        jLabel6.setVisible(true);
        jComboBox1.setVisible(true);

        //btn2.setVisible(false);// soal bonus
        //btn3.setVisible(false);// soal bonus
    }

    public void judul() {//untuk desain yang akan ditampilkan
        Object[] judul = {
          "No", "Merk", "Plat", "Warna", "Jenis"
        };
        tabModel = new DefaultTableModel(null, judul);
        jTable1.setModel(tabModel);//nampilin tabel
    }

    public void tampilData(String where) {//data yang diambil untuk ditampilkan
        try {
        st = cn.createStatement();
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        rs = st.executeQuery("SELECT * FROM dt_Mobil " + where);
    
        while (rs.next()) {
          Object[] data = {
            rs.getString("id_Mobil"),
            rs.getString("merk"),
            rs.getString("plat"),
            rs.getString("warna"),
            rs.getString("jenis"),
          };
        
        tabModel.addRow(data);
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        welcome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pan2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pan3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pan1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tMerk = new javax.swing.JTextField();
        tPlat = new javax.swing.JTextField();
        tWarna = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        welcome.setText("Selamat Datang!");

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Form");
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("Table");
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Info");
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Mobil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(btn1).addGap(35, 35, 35)
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btn3).addGap(22, 22, 22))
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(50, 50, 50).addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        jPanel1Layout.createSequentialGroup().addContainerGap(25, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn1).addComponent(btn2).addComponent(btn3))
                                .addContainerGap()));

        pan2.setBackground(new java.awt.Color(153, 255, 255));

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setBorder(new javax.swing.border.MatteBorder(null));
        jTable1.setModel(
                new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan2Layout
                        .createSequentialGroup().addContainerGap().addComponent(jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE)));
        pan2Layout.setVerticalGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan2Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE).addComponent(jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap()));

        pan3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nama : Diffa Al Farrisztqi");// soal no 1

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));// soal no 1
        jLabel7.setText("NIM  : 1900618");

       ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/tp2/IMG_6789 1.jpg"));
       Image image = imageIcon.getImage();
       Image newImage = image.getScaledInstance(200,200, java.awt.Image.SCALE_AREA_AVERAGING);
       imageIcon = new ImageIcon(newImage);
       img.setIcon(imageIcon);
        
        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan3Layout.createSequentialGroup().addGap(20, 20, 20)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(img)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        pan3Layout.setVerticalGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(30, 30, 30).addComponent(img)
                        .addGap(50, 50, 50).addComponent(jLabel5)
                        .addGap(18, 18, 18).addComponent(jLabel7)
                        .addContainerGap(63, Short.MAX_VALUE)));

        pan1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Merk");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Plat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Warna");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jenis");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biasa", "Balap", "Sport", "Truk" }));// soal
                                                                                                                        // no
                                                                                                                        // 2

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout
                .setHorizontalGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pan1Layout.createSequentialGroup().addGap(32, 32, 32)
                                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4)
                                        .addComponent(jLabel6))
                                .addGap(32, 32, 32)
                                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addGroup(pan1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tMerk).addComponent(tPlat).addComponent(tWarna,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(41, Short.MAX_VALUE)));
        pan1Layout.setVerticalGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan1Layout.createSequentialGroup().addGap(53, 53, 53)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2).addComponent(tMerk, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3).addComponent(tPlat, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4).addComponent(tWarna, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(jButton1).addGap(16, 16, 16)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pan1,
                        javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(pan2,
                        javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(84, 84, 84)
                                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(8, Short.MAX_VALUE))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(pan3,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addGap(0, 143, Short.MAX_VALUE).addComponent(pan1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                        javax.swing.GroupLayout.Alignment.TRAILING,
                        layout.createSequentialGroup().addGap(0, 144, Short.MAX_VALUE).addComponent(pan2,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(267, 267, 267).addComponent(welcome)
                                .addContainerGap(194, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        pan1.setVisible(true);
        pan2.setVisible(false);
        pan3.setVisible(false);
        btn2.setVisible(false);// soal no 6
        btn3.setVisible(false);// soal no 6
    }

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        judul();
        tampilData("");//nampilin data
        pan1.setVisible(false);
        pan2.setVisible(true);
        pan3.setVisible(false);
    }

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        pan1.setVisible(false);
        pan2.setVisible(false);
        pan3.setVisible(true);
    }

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String merk = tMerk.getText();
        String plat = tPlat.getText();
        String warna = tWarna.getText();
        String jenis = (String) jComboBox1.getSelectedItem();// soal no 4
        if (merk.isEmpty() || plat.isEmpty() || warna.isEmpty()) {// soal bonus
            return;// soal bonus
        }
        
        try {
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO dt_Mobil VALUES(NULL,'"
                + tMerk.getText() + "','"
                + tPlat.getText() + "','"   
                + tWarna.getText() + "','"
                + jComboBox1.getSelectedItem() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
        }catch (Exception e) {
            e.printStackTrace();
        }

        tMerk.setText("");
        tPlat.setText("");
        tWarna.setText("");
        btn2.setVisible(true);// soal bonus
        btn3.setVisible(true);// soal bonus
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tampilan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tampilan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JTextField tMerk;
    private javax.swing.JTextField tPlat;
    private javax.swing.JTextField tWarna;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel img;
    // End of variables declaration
}
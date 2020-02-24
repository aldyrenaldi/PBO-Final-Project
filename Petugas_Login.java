package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prana
 */
public class Petugas_Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Petugas_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idPanitia = new javax.swing.JTextField();
        loginPetugas = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(254, 254, 254));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(729, 443));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("Masukan ID Petugas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("ID Petugas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        idPanitia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idPanitia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPanitiaActionPerformed(evt);
            }
        });
        jPanel2.add(idPanitia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 183, -1));

        loginPetugas.setBackground(new java.awt.Color(1, 1, 1));
        loginPetugas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginPetugas.setForeground(new java.awt.Color(254, 254, 254));
        loginPetugas.setText("Masuk");
        loginPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPetugasActionPerformed(evt);
            }
        });
        jPanel2.add(loginPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 95, -1));

        homeBtn.setBackground(new java.awt.Color(1, 1, 1));
        homeBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(254, 254, 254));
        homeBtn.setText("Back");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel2.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, -1));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selamat Datang di Aplikasi Pemilihan Umum");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/petugas.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 190, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPetugasActionPerformed

    private void idPanitiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPanitiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPanitiaActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeBtnActionPerformed

    //Button
    public JButton getLoginPetugas() {
        return loginPetugas;
    }

    public JButton getHomeBtn() {
        return homeBtn;
    }
    
    //get Text
    
    public String getuPetugas() {
        return idPanitia.getText();
    }
    
    //Listener
    public void Listener(ActionListener A)
    {
        homeBtn.addActionListener(A);
        loginPetugas.addActionListener(A);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeBtn;
    private javax.swing.JTextField idPanitia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginPetugas;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporaja;

import Controller.Application;

/**
 *
 * @author Kian Nailaizza
 */
public class OptionMenu extends javax.swing.JInternalFrame {

    Application app;
    /**
     * Creates new form OptionMenu
     */
    public OptionMenu(Application app) {
        this.app = app;
        initComponents();
        jLabel1.setText("Halo, " + app.getUser().getLastname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLapor = new javax.swing.JButton();
        btnForum = new javax.swing.JButton();
        btnTelepon = new javax.swing.JButton();
        btnProfil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTelepon1 = new javax.swing.JButton();

        setTitle("Menu");

        btnLapor.setText("Lapor");
        btnLapor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporActionPerformed(evt);
            }
        });

        btnForum.setText("Forum");
        btnForum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForumActionPerformed(evt);
            }
        });

        btnTelepon.setText("Telepon");
        btnTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeleponActionPerformed(evt);
            }
        });

        btnProfil.setText("Profile");
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Halo, Test");

        btnTelepon1.setText("Log Out");
        btnTelepon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelepon1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnForum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLapor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProfil, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTelepon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProfil)
                .addGap(18, 18, 18)
                .addComponent(btnLapor)
                .addGap(18, 18, 18)
                .addComponent(btnForum)
                .addGap(18, 18, 18)
                .addComponent(btnTelepon)
                .addGap(18, 18, 18)
                .addComponent(btnTelepon1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporActionPerformed
        // TODO add your handling code here:
        LaporForm laporForm = new LaporForm(app);
        laporForm.setVisible(true);
        this.getDesktopPane().add(laporForm);
        this.toBack();
        laporForm.toFront();
    }//GEN-LAST:event_btnLaporActionPerformed

    private void btnForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForumActionPerformed
        // TODO add your handling code here:
        Forum forum = new Forum(app);
        forum.setVisible(true);
        this.getDesktopPane().add(forum);
        this.toBack();
        forum.toFront();
    }//GEN-LAST:event_btnForumActionPerformed

    private void btnTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeleponActionPerformed
        // TODO add your handling code here:
        Telepon telepon = new Telepon(app);
        telepon.setVisible(true);
        this.getDesktopPane().add(telepon);
        this.toBack();
        telepon.toFront();
    }//GEN-LAST:event_btnTeleponActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
        ProfilePage profilePage = new ProfilePage(app);
        profilePage.setVisible(true);
        this.getDesktopPane().add(profilePage);
        this.toBack();
        profilePage.toFront();
    }//GEN-LAST:event_btnProfilActionPerformed

    private void btnTelepon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelepon1ActionPerformed
        app.logout();
        this.dispose();
    }//GEN-LAST:event_btnTelepon1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForum;
    private javax.swing.JButton btnLapor;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnTelepon;
    private javax.swing.JButton btnTelepon1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporaja;

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
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();
=======
        btnProfil = new javax.swing.JButton();
>>>>>>> 71453e3d49cb250e87ae56483655af964160e1eb

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

<<<<<<< HEAD
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Halo, test ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
=======
        btnProfil.setText("Profile");
        btnProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilActionPerformed(evt);
            }
        });
>>>>>>> 71453e3d49cb250e87ae56483655af964160e1eb

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnForum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLapor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addGap(201, 201, 201)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnForum, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnLapor, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(btnProfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(btnProfil)
>>>>>>> 71453e3d49cb250e87ae56483655af964160e1eb
                .addGap(18, 18, 18)
                .addComponent(btnLapor)
                .addGap(18, 18, 18)
                .addComponent(btnForum)
                .addGap(18, 18, 18)
                .addComponent(btnTelepon)
<<<<<<< HEAD
                .addContainerGap(115, Short.MAX_VALUE))
=======
                .addGap(87, 87, 87))
>>>>>>> 71453e3d49cb250e87ae56483655af964160e1eb
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporActionPerformed
        // TODO add your handling code here:
        LaporForm laporForm = new LaporForm();
        laporForm.setVisible(true);
        laporForm.toFront();
        this.getDesktopPane().add(laporForm);
        this.toBack();
    }//GEN-LAST:event_btnLaporActionPerformed

    private void btnForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForumActionPerformed
        // TODO add your handling code here:
        Forum forum = new Forum(app);
        forum.setVisible(true);
        forum.toFront();
        this.getDesktopPane().add(forum);
        this.toBack();
    }//GEN-LAST:event_btnForumActionPerformed

    private void btnTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeleponActionPerformed
        // TODO add your handling code here:
        Telepon telepon = new Telepon(app);
        telepon.setVisible(true);
        telepon.toFront();
        this.getDesktopPane().add(telepon);
        this.toBack();
    }//GEN-LAST:event_btnTeleponActionPerformed

    private void btnProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilActionPerformed
        // TODO add your handling code here:
        ProfilePage profilePage = new ProfilePage();
        profilePage.setVisible(true);
        this.getDesktopPane().add(profilePage);
        this.dispose();
    }//GEN-LAST:event_btnProfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForum;
    private javax.swing.JButton btnLapor;
    private javax.swing.JButton btnProfil;
    private javax.swing.JButton btnTelepon;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

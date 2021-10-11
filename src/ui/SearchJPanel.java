/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.CarCatalog;

/**
 *
 * @author vigneshguna
 */
public class SearchJPanel extends javax.swing.JPanel {
    
    CarCatalog catalog;

    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel(CarCatalog catalog) {
        initComponents();
        this.catalog = catalog;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblLocat = new javax.swing.JLabel();
        txtLocat = new javax.swing.JTextField();
        lblminiText = new javax.swing.JLabel();
        rdbtnBoston = new javax.swing.JRadioButton();
        rdbtnCambridge = new javax.swing.JRadioButton();
        rdbtnNewYork = new javax.swing.JRadioButton();
        btnFind = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTitle.setText("Find your Cab");

        lblLocat.setText("Your Location *");

        txtLocat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocatActionPerformed(evt);
            }
        });

        lblminiText.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblminiText.setText("Some popular cities");

        rdbtnBoston.setText("Boston");

        rdbtnCambridge.setText("Cambridge");

        rdbtnNewYork.setText("New York");

        btnFind.setText("Find");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblLocat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLocat, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtnBoston)
                        .addGap(18, 18, 18)
                        .addComponent(rdbtnCambridge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbtnNewYork)
                        .addGap(60, 60, 60)
                        .addComponent(btnFind))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(lblminiText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocat)
                    .addComponent(txtLocat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbtnBoston)
                    .addComponent(rdbtnCambridge)
                    .addComponent(rdbtnNewYork)
                    .addComponent(btnFind))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblminiText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLocat;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblminiText;
    private javax.swing.JRadioButton rdbtnBoston;
    private javax.swing.JRadioButton rdbtnCambridge;
    private javax.swing.JRadioButton rdbtnNewYork;
    private javax.swing.JTextField txtLocat;
    // End of variables declaration//GEN-END:variables
}

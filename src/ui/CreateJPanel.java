/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

/**
 *
 * @author vigneshguna
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel() {
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

        lblTitle = new javax.swing.JLabel();
        lblSerialNum = new javax.swing.JLabel();
        lblCurrentCity = new javax.swing.JLabel();
        lblIsAvail = new javax.swing.JLabel();
        lblManuf = new javax.swing.JLabel();
        lblManufYear = new javax.swing.JLabel();
        lblNoOfSeats = new javax.swing.JLabel();
        lblModelNumb = new javax.swing.JLabel();
        lblIsExpiredMaintCerti = new javax.swing.JLabel();
        txtManuf = new javax.swing.JTextField();
        txtSerialNum = new javax.swing.JTextField();
        txtManufYear = new javax.swing.JTextField();
        txtNoOfSeats = new javax.swing.JTextField();
        txtModelNum = new javax.swing.JTextField();
        txtCurrentCity = new javax.swing.JTextField();
        rdbAvailY = new javax.swing.JRadioButton();
        rdbAvailN = new javax.swing.JRadioButton();
        rdbExpiredMaintCertiY = new javax.swing.JRadioButton();
        rdbExpiredMaintCertiN = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTitle.setText("Create Car");

        lblSerialNum.setText("Serial Number");

        lblCurrentCity.setText("Current City");

        lblIsAvail.setText("is Available");

        lblManuf.setText("Manufacturer");

        lblManufYear.setText("Manufactured Year");

        lblNoOfSeats.setText("Number of Seats");

        lblModelNumb.setText("Model Number");

        lblIsExpiredMaintCerti.setText("is Expired Maintenance Certificate");

        txtManuf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufActionPerformed(evt);
            }
        });

        txtSerialNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumActionPerformed(evt);
            }
        });

        txtManufYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufYearActionPerformed(evt);
            }
        });

        txtNoOfSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfSeatsActionPerformed(evt);
            }
        });

        txtModelNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumActionPerformed(evt);
            }
        });

        txtCurrentCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentCityActionPerformed(evt);
            }
        });

        rdbAvailY.setText("Yes");

        rdbAvailN.setText("No");

        rdbExpiredMaintCertiY.setText("Yes");

        rdbExpiredMaintCertiN.setText("No");

        jButton1.setText("Add Car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIsExpiredMaintCerti)
                            .addComponent(lblIsAvail)
                            .addComponent(lblManuf)
                            .addComponent(lblManufYear)
                            .addComponent(lblNoOfSeats)
                            .addComponent(lblModelNumb)
                            .addComponent(lblSerialNum)
                            .addComponent(lblCurrentCity))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtManuf, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtManufYear, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtNoOfSeats, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtModelNum, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txtCurrentCity, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbAvailY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbAvailN))
                            .addComponent(txtSerialNum)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbExpiredMaintCertiY)
                                .addGap(18, 18, 18)
                                .addComponent(rdbExpiredMaintCertiN))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSerialNum)
                    .addComponent(txtSerialNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentCity)
                    .addComponent(txtCurrentCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIsAvail)
                    .addComponent(rdbAvailY)
                    .addComponent(rdbAvailN))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManuf)
                    .addComponent(txtManuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufYear)
                    .addComponent(txtManufYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoOfSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelNumb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIsExpiredMaintCerti, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbExpiredMaintCertiY)
                        .addComponent(rdbExpiredMaintCertiN)))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSerialNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumActionPerformed

    private void txtManufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufActionPerformed

    private void txtManufYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufYearActionPerformed

    private void txtNoOfSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoOfSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoOfSeatsActionPerformed

    private void txtModelNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumActionPerformed

    private void txtCurrentCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurrentCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblCurrentCity;
    private javax.swing.JLabel lblIsAvail;
    private javax.swing.JLabel lblIsExpiredMaintCerti;
    private javax.swing.JLabel lblManuf;
    private javax.swing.JLabel lblManufYear;
    private javax.swing.JLabel lblModelNumb;
    private javax.swing.JLabel lblNoOfSeats;
    private javax.swing.JLabel lblSerialNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rdbAvailN;
    private javax.swing.JRadioButton rdbAvailY;
    private javax.swing.JRadioButton rdbExpiredMaintCertiN;
    private javax.swing.JRadioButton rdbExpiredMaintCertiY;
    private javax.swing.JTextField txtCurrentCity;
    private javax.swing.JTextField txtManuf;
    private javax.swing.JTextField txtManufYear;
    private javax.swing.JTextField txtModelNum;
    private javax.swing.JTextField txtNoOfSeats;
    private javax.swing.JTextField txtSerialNum;
    // End of variables declaration//GEN-END:variables
}

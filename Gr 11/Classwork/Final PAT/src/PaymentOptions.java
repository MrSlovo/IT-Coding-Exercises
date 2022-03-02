

import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class PaymentOptions extends javax.swing.JFrame {

    /**
     * Creates new form PaymentOptions
     */
    public PaymentOptions() {
        initComponents();
        this.setMinimumSize(new Dimension(968, 757));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeading = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        scrPaymentOptions = new javax.swing.JScrollPane();
        txaPayments = new javax.swing.JTextArea();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblHeading.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(239, 128, 47));
        lblHeading.setText("Payment Options");

        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("x");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(884, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                    .addContainerGap(345, Short.MAX_VALUE)
                    .addComponent(lblHeading)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                    .addContainerGap(55, Short.MAX_VALUE)
                    .addComponent(lblHeading)
                    .addContainerGap(51, Short.MAX_VALUE)))
        );

        getContentPane().add(pnlHeading);
        pnlHeading.setBounds(0, 0, 970, 150);

        txaPayments.setEditable(false);
        txaPayments.setBackground(new java.awt.Color(0, 102, 153));
        txaPayments.setColumns(20);
        txaPayments.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txaPayments.setForeground(new java.awt.Color(255, 255, 255));
        txaPayments.setRows(5);
        txaPayments.setText("  \n  Payment can be made via:\n\n  PayFast: EFT with PayFast enables you to make instant EFT payments that \n  clear immediately. FNB, Nedbank, Standard Bank & Investec are supported.\n\n  COD (Cash on Delivery): Offered as a payment option for certain orders, \n  delivered within certain areas, cash payments are accepted. No card or \n  digital payment facilities are available at this time.\n\n  PayPal, MasterPass by MasterCard");
        scrPaymentOptions.setViewportView(txaPayments);

        getContentPane().add(scrPaymentOptions);
        scrPaymentOptions.setBounds(226, 300, 600, 256);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/dom.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 146, 970, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        

        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_lblExitMouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JScrollPane scrPaymentOptions;
    private javax.swing.JTextArea txaPayments;
    // End of variables declaration//GEN-END:variables
}

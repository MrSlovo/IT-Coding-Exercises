/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class WelcomeMessageAdmin extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeMessage
     */
    private String email;
    
    public WelcomeMessageAdmin(String email) {
        this.email = email;
        initComponents();
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

        pnlWelcomeAdmin = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        btnProceed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlWelcomeAdmin.setBackground(new java.awt.Color(239, 128, 47));
        pnlWelcomeAdmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 153), 15));

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(0, 102, 153));
        lblWelcome.setText("Welcome Admin User: ");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 102, 153));

        btnProceed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnProceed.setText("Proceed");
        btnProceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProceedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlWelcomeAdminLayout = new javax.swing.GroupLayout(pnlWelcomeAdmin);
        pnlWelcomeAdmin.setLayout(pnlWelcomeAdminLayout);
        pnlWelcomeAdminLayout.setHorizontalGroup(
            pnlWelcomeAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeAdminLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWelcomeAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        pnlWelcomeAdminLayout.setVerticalGroup(
            pnlWelcomeAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeAdminLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlWelcomeAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(btnProceed)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlWelcomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlWelcomeAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProceedMouseClicked


        this.dispose();
        new Admin(email).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnProceedMouseClicked

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProceed;
    public javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlWelcomeAdmin;
    // End of variables declaration//GEN-END:variables
}

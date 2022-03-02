
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import javax.swing.JOptionPane;

public class GymLoginScreen extends javax.swing.JFrame {

  public GymLoginScreen() {
    initComponents();
    rbtnYes.setSelected(true);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    buttonGroup2 = new javax.swing.ButtonGroup();
    buttonGroup3 = new javax.swing.ButtonGroup();
    buttonGroup4 = new javax.swing.ButtonGroup();
    buttonGroup5 = new javax.swing.ButtonGroup();
    lblHeading = new javax.swing.JLabel();
    lblMembershipID = new javax.swing.JLabel();
    lblDateofBirth = new javax.swing.JLabel();
    lblDisplaysSymptomes = new javax.swing.JLabel();
    lblBodyTemperature = new javax.swing.JLabel();
    txtMembershipID = new javax.swing.JTextField();
    dpDateOfBirth = new org.jdesktop.swingx.JXDatePicker();
    sldrBodyTemperature = new javax.swing.JSlider();
    rbtnYes = new javax.swing.JRadioButton();
    rbtnNo = new javax.swing.JRadioButton();
    btnLogin = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    lblHeading.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
    lblHeading.setText("VIRGIN ACTIVE MEMBER VALIDATION: ");

    lblMembershipID.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    lblMembershipID.setText("Membership ID: ");

    lblDateofBirth.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    lblDateofBirth.setText("Date of Birth: ");

    lblDisplaysSymptomes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    lblDisplaysSymptomes.setText("Displays Symptomes: ");

    lblBodyTemperature.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
    lblBodyTemperature.setText("Body Temperature: ");

    txtMembershipID.setText("Enter ID Number");
    txtMembershipID.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtMembershipIDActionPerformed(evt);
      }
    });

    sldrBodyTemperature.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
    sldrBodyTemperature.setMajorTickSpacing(1);
    sldrBodyTemperature.setMaximum(40);
    sldrBodyTemperature.setMinimum(30);
    sldrBodyTemperature.setMinorTickSpacing(1);
    sldrBodyTemperature.setPaintLabels(true);
    sldrBodyTemperature.setPaintTicks(true);
    sldrBodyTemperature.setToolTipText("");

    buttonGroup1.add(rbtnYes);
    rbtnYes.setText("Yes");
    rbtnYes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rbtnYesActionPerformed(evt);
      }
    });

    buttonGroup1.add(rbtnNo);
    rbtnNo.setText("No");

    btnLogin.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
    btnLogin.setText("Login");
    btnLogin.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLoginActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblMembershipID)
              .addComponent(lblDateofBirth)
              .addComponent(lblDisplaysSymptomes))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addComponent(rbtnYes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnNo))
              .addComponent(dpDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
              .addComponent(txtMembershipID)))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(64, 64, 64)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(sldrBodyTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGap(64, 64, 64))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 66, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(lblHeading)
            .addGap(67, 67, 67))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(lblBodyTemperature)
            .addGap(165, 165, 165))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lblHeading)
        .addGap(89, 89, 89)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtMembershipID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblMembershipID))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblDateofBirth)
          .addComponent(dpDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblDisplaysSymptomes)
          .addComponent(rbtnNo)
          .addComponent(rbtnYes))
        .addGap(48, 48, 48)
        .addComponent(lblBodyTemperature)
        .addGap(18, 18, 18)
        .addComponent(sldrBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(42, 42, 42)
        .addComponent(btnLogin)
        .addContainerGap(95, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void txtMembershipIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMembershipIDActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtMembershipIDActionPerformed

  private void rbtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnYesActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_rbtnYesActionPerformed

  private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

    try {
      // Validates all input fields
      validateMembershipID(txtMembershipID.getText());
      validateDate(dpDateOfBirth.getDate());
      validateSymptoms(rbtnYes.isSelected());
      validateTemperature(sldrBodyTemperature.getValue());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }//GEN-LAST:event_btnLoginActionPerformed
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
      java.util.logging.Logger.getLogger(GymLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(GymLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(GymLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(GymLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GymLoginScreen().setVisible(true);
      }
    });
  }

  public static void validateMembershipID(String membershipID) throws Exception {
    // Validates the memebershipID length
    if (membershipID.length() != 10) {
      throw new Exception("Error in Membership ID: ID has to be 10 characters long");
    }

    // Validates characters in membershipID
    for (int i = 0; i < membershipID.length(); i++) {
      char c = membershipID.charAt(i);
      if (!Character.isDigit(c)) {
        throw new Exception("Error in Membership ID: ID cannot contain non-numeric characters");
      }
    }
  }

  public static void validateSymptoms(Boolean symptoms) throws Exception {
    if (symptoms) {
      throw new Exception("Error in Sympton Check: Members who display COVID related symptoms are not allowed inside");
    }
  }

  public static void validateTemperature(double temperature) throws Exception {
    if (temperature > 37) {
      throw new Exception("Error in Temperature Check: Members temperature is too high");
    } else if (temperature < 36) {
      throw new Exception("Error in Temperature Check: Members temperature is too low");
    }
  }

  public static void validateDate(Date birthDate) throws Exception {
    // Checks that user is over 16 years of age
    int age = calculateAge(LocalDate.of(birthDate.getYear() + 1900, birthDate.getMonth() + 1, birthDate.getDate()));
    if (age < 16) {
      throw new Exception("Member must be over 16 to access the facilities");
    }
  }

  public static int calculateAge(LocalDate birthDate) {
    if ((birthDate != null)) {
      return Period.between(birthDate, LocalDate.now()).getYears();
    } else {
      return 0;
    }
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnLogin;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.ButtonGroup buttonGroup3;
  private javax.swing.ButtonGroup buttonGroup4;
  private javax.swing.ButtonGroup buttonGroup5;
  private org.jdesktop.swingx.JXDatePicker dpDateOfBirth;
  private javax.swing.JLabel lblBodyTemperature;
  private javax.swing.JLabel lblDateofBirth;
  private javax.swing.JLabel lblDisplaysSymptomes;
  private javax.swing.JLabel lblHeading;
  private javax.swing.JLabel lblMembershipID;
  private javax.swing.JRadioButton rbtnNo;
  private javax.swing.JRadioButton rbtnYes;
  private javax.swing.JSlider sldrBodyTemperature;
  private javax.swing.JTextField txtMembershipID;
  // End of variables declaration//GEN-END:variables
}

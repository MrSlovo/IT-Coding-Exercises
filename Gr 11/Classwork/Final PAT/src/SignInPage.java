

import java.awt.Dimension;




import java.sql.SQLException;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 21nic
 */
public class SignInPage extends javax.swing.JFrame {

    public TennisAlliance dbObjTennis;
    public String email;

    /**
     * Creates new form SignInPage
     */
    public SignInPage() {
        this.email = email;

        initComponents();
        this.setMinimumSize(new Dimension(1077, 862));
        dbObjTennis = new TennisAlliance(email);
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

        lblEmail = new javax.swing.JLabel();
        lblCompulsoryEmail = new javax.swing.JLabel();
        txtEnterEmailSignIn = new javax.swing.JTextField();
        lblEnterPasword = new javax.swing.JLabel();
        lblCompulsoryPassword = new javax.swing.JLabel();
        lblErrorPassSignIn = new javax.swing.JLabel();
        pwdEnterPassSignIn = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();
        pnlHeading = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblErrorEmailSignIn = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmail.setBackground(new java.awt.Color(0, 102, 255));
        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Enter Email Address");
        getContentPane().add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        lblCompulsoryEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryEmail.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryEmail.setText("*");
        getContentPane().add(lblCompulsoryEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 18, -1));

        txtEnterEmailSignIn.setBackground(new java.awt.Color(0, 102, 153));
        txtEnterEmailSignIn.setForeground(new java.awt.Color(255, 255, 255));
        txtEnterEmailSignIn.setPreferredSize(new java.awt.Dimension(6, 21));
        getContentPane().add(txtEnterEmailSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, 30));

        lblEnterPasword.setBackground(new java.awt.Color(0, 102, 255));
        lblEnterPasword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEnterPasword.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterPasword.setText("Enter Password");
        getContentPane().add(lblEnterPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 30));

        lblCompulsoryPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryPassword.setText("*");
        getContentPane().add(lblCompulsoryPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 18, -1));

        lblErrorPassSignIn.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorPassSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblErrorPassSignIn.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lblErrorPassSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 780, 40));

        pwdEnterPassSignIn.setBackground(new java.awt.Color(0, 102, 153));
        pwdEnterPassSignIn.setForeground(new java.awt.Color(255, 255, 255));
        pwdEnterPassSignIn.setPreferredSize(new java.awt.Dimension(130, 30));
        getContentPane().add(pwdEnterPassSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, -1));

        btnSignIn.setBackground(new java.awt.Color(239, 128, 47));
        btnSignIn.setFont(new java.awt.Font("Verdana", 1, 60)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(0, 102, 153));
        btnSignIn.setText("SIGN IN");
        btnSignIn.setBorder(null);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 480, 70));

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblHeading.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(239, 128, 47));
        lblHeading.setText("SIGN IN TO YOUR ACCOUNT");

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
                .addGap(38, 38, 38)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 82, Short.MAX_VALUE))
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 140));

        lblErrorEmailSignIn.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorEmailSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblErrorEmailSignIn.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lblErrorEmailSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 780, 40));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/shapo.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1080, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed

         String email = txtEnterEmailSignIn.getText(); //getting the text from the text field and storing the value as a string
        String password = pwdEnterPassSignIn.getText(); ////getting the text from the text field and storing the value as a string

           

        boolean flag = true;//boolean will be used to check if the substring is letters only 
        if (email.isEmpty()) {// presence check to see if a field has been left blank.
            lblErrorEmailSignIn.setText("*ERROR: This field cannot be left blank.");//error message for presence check 
        } else {
            if ((email.length() < 6)) {//if the length is <6
                lblErrorEmailSignIn.setText("*ERROR: Your email address cannnot be less than 6 characters in length.");
            } else {

                for (int i = 0; i < email.length(); i++) {//looping until the length of the name 
                    // checks to see if the character isnt a letter
                    if (!Character.isLetterOrDigit(email.charAt(i))) {//if the character is not a letter or then flag is false
                        flag = false;
                    }
                }
                int length = email.length();
                int count = 0;
                boolean checkAt = false;

                for (int i = 0; i < length; i++) {
                    if ((email.charAt(i)) == '@') {
                        count++;
                        checkAt = true;
                    }

                }
                if (count > 1) {
                   lblErrorEmailSignIn.setText("*ERROR: Your email address cannot have more than 1 @");
                } else {
                    if (count == 0) {
                        lblErrorEmailSignIn.setText("*ERROR: Your email address must have an @ in it!");
                    } else {
                        if (count == 1 && checkAt) {
                            lblErrorEmailSignIn.setText("");
                        }
                    }

                }

            }

        }

        if (password.isEmpty()) {//presence check to see if a field has been left blank.

            lblErrorPassSignIn.setText("*ERROR: This field cannot be left blank.");    //error messgae occurs if field has been left blank
        } 
        else{
            lblErrorPassSignIn.setText("");
        }
        
        if (lblErrorEmailSignIn.getText().equals("") && lblErrorPassSignIn.getText().equals(""))
        try{
            dbObjTennis.checkDB(email, password);
          MainPage mP = new MainPage(email, password);
            
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }



    }//GEN-LAST:event_btnSignInActionPerformed

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
    private javax.swing.JButton btnSignIn;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCompulsoryEmail;
    private javax.swing.JLabel lblCompulsoryPassword;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnterPasword;
    private javax.swing.JLabel lblErrorEmailSignIn;
    private javax.swing.JLabel lblErrorPassSignIn;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPasswordField pwdEnterPassSignIn;
    private javax.swing.JTextField txtEnterEmailSignIn;
    // End of variables declaration//GEN-END:variables
}
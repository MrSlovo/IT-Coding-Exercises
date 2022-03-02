
import java.awt.Dimension;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import java.util.Date;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 21nic
 */
public class CreateAccount extends javax.swing.JFrame {

    Date today = null;
    public TennisAlliance dbObjTennis;//getting the name of the database
 public String email;
 

    public CreateAccount() {
this.email = email;
        initComponents();
        this.setMinimumSize(new Dimension(1079, 907));
        dbObjTennis = new TennisAlliance(email);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdBgpGender = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        txtEnterName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblCreateAccount = new javax.swing.JLabel();
        rbnFemale = new javax.swing.JRadioButton();
        rbnMale = new javax.swing.JRadioButton();
        lblSelectGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblErrorName = new javax.swing.JLabel();
        lblCompulsoryName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblEnterPasword = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        txtEnterEmail = new javax.swing.JTextField();
        txtEnterLastName = new javax.swing.JTextField();
        lblCompulsoryLastName = new javax.swing.JLabel();
        lblCompulsoryEmail = new javax.swing.JLabel();
        lblCompulsoryGender = new javax.swing.JLabel();
        lblCompulsoryDOB = new javax.swing.JLabel();
        lblCompulsoryPassword = new javax.swing.JLabel();
        lblCompulsoryRetypePass = new javax.swing.JLabel();
        lblErrorPass = new javax.swing.JLabel();
        lblErrorLastName = new javax.swing.JLabel();
        lblErrorGender = new javax.swing.JLabel();
        lblErrorRetypePass = new javax.swing.JLabel();
        lblErrorDOB = new javax.swing.JLabel();
        lblErrorEmail = new javax.swing.JLabel();
        pwdRetypePass = new javax.swing.JPasswordField();
        btnCreateAccount = new javax.swing.JButton();
        pwdEnterPass = new javax.swing.JPasswordField();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jXDatePickerDOB = new org.jdesktop.swingx.JXDatePicker();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        setResizable(false);
        getContentPane().setLayout(null);

        pnlMain.setBackground(new java.awt.Color(239, 128, 47));
        pnlMain.setLayout(null);

        txtEnterName.setBackground(new java.awt.Color(0, 153, 255));
        txtEnterName.setForeground(new java.awt.Color(255, 255, 255));
        txtEnterName.setPreferredSize(new java.awt.Dimension(6, 21));
        pnlMain.add(txtEnterName);
        txtEnterName.setBounds(10, 160, 220, 30);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Enter First Name");
        pnlMain.add(lblName);
        lblName.setBounds(20, 120, 180, 41);

        lblCreateAccount.setFont(new java.awt.Font("Rockwell", 1, 48)); // NOI18N
        lblCreateAccount.setForeground(new java.awt.Color(239, 128, 47));
        lblCreateAccount.setText("CREATE AN ACCOUNT");
        pnlMain.add(lblCreateAccount);
        lblCreateAccount.setBounds(60, 30, 610, 70);

        rbnFemale.setBackground(new java.awt.Color(0, 153, 255));
        rdBgpGender.add(rbnFemale);
        rbnFemale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbnFemale.setForeground(new java.awt.Color(255, 255, 255));
        rbnFemale.setText("FEMALE");
        pnlMain.add(rbnFemale);
        rbnFemale.setBounds(10, 430, 80, 23);

        rbnMale.setBackground(new java.awt.Color(0, 153, 255));
        rdBgpGender.add(rbnMale);
        rbnMale.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbnMale.setForeground(new java.awt.Color(255, 255, 255));
        rbnMale.setText("MALE");
        pnlMain.add(rbnMale);
        rbnMale.setBounds(10, 400, 80, 23);

        lblSelectGender.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSelectGender.setForeground(new java.awt.Color(255, 255, 255));
        lblSelectGender.setText("Select gender");
        pnlMain.add(lblSelectGender);
        lblSelectGender.setBounds(20, 360, 145, 29);

        lblEmail.setBackground(new java.awt.Color(0, 102, 255));
        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Enter Email Address");
        pnlMain.add(lblEmail);
        lblEmail.setBounds(20, 270, 212, 30);

        lblErrorName.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorName.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorName);
        lblErrorName.setBounds(240, 160, 830, 40);

        lblCompulsoryName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryName.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryName.setText("*");
        pnlMain.add(lblCompulsoryName);
        lblCompulsoryName.setBounds(200, 130, 18, 22);

        lblLastName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setText("Enter Last Name");
        pnlMain.add(lblLastName);
        lblLastName.setBounds(20, 200, 178, 29);

        lblEnterPasword.setBackground(new java.awt.Color(0, 102, 255));
        lblEnterPasword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEnterPasword.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterPasword.setText("Enter Password");
        pnlMain.add(lblEnterPasword);
        lblEnterPasword.setBounds(20, 690, 165, 30);

        lblDOB.setBackground(new java.awt.Color(0, 102, 255));
        lblDOB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("Enter Date of Birth");
        pnlMain.add(lblDOB);
        lblDOB.setBounds(20, 480, 200, 30);

        lblConfirmPassword.setBackground(new java.awt.Color(0, 102, 255));
        lblConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("Retype Password");
        pnlMain.add(lblConfirmPassword);
        lblConfirmPassword.setBounds(20, 780, 183, 30);

        txtEnterEmail.setBackground(new java.awt.Color(0, 153, 255));
        txtEnterEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEnterEmail.setPreferredSize(new java.awt.Dimension(6, 21));
        pnlMain.add(txtEnterEmail);
        txtEnterEmail.setBounds(10, 310, 220, 30);

        txtEnterLastName.setBackground(new java.awt.Color(0, 153, 255));
        txtEnterLastName.setForeground(new java.awt.Color(255, 255, 255));
        txtEnterLastName.setPreferredSize(new java.awt.Dimension(6, 21));
        pnlMain.add(txtEnterLastName);
        txtEnterLastName.setBounds(10, 240, 220, 30);

        lblCompulsoryLastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryLastName.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryLastName.setText("*");
        pnlMain.add(lblCompulsoryLastName);
        lblCompulsoryLastName.setBounds(200, 210, 18, 22);

        lblCompulsoryEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryEmail.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryEmail.setText("*");
        pnlMain.add(lblCompulsoryEmail);
        lblCompulsoryEmail.setBounds(230, 270, 18, 22);

        lblCompulsoryGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryGender.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryGender.setText("*");
        pnlMain.add(lblCompulsoryGender);
        lblCompulsoryGender.setBounds(170, 360, 18, 22);

        lblCompulsoryDOB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryDOB.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryDOB.setText("*");
        pnlMain.add(lblCompulsoryDOB);
        lblCompulsoryDOB.setBounds(220, 480, 18, 22);

        lblCompulsoryPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryPassword.setText("*");
        pnlMain.add(lblCompulsoryPassword);
        lblCompulsoryPassword.setBounds(190, 690, 18, 22);

        lblCompulsoryRetypePass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCompulsoryRetypePass.setForeground(new java.awt.Color(255, 51, 51));
        lblCompulsoryRetypePass.setText("*");
        pnlMain.add(lblCompulsoryRetypePass);
        lblCompulsoryRetypePass.setBounds(210, 780, 18, 22);

        lblErrorPass.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorPass.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorPass);
        lblErrorPass.setBounds(140, 720, 440, 40);

        lblErrorLastName.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorLastName.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorLastName);
        lblErrorLastName.setBounds(260, 240, 780, 40);

        lblErrorGender.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorGender.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorGender);
        lblErrorGender.setBounds(190, 350, 533, 40);

        lblErrorRetypePass.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorRetypePass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorRetypePass.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorRetypePass);
        lblErrorRetypePass.setBounds(160, 810, 320, 40);

        lblErrorDOB.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorDOB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorDOB.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorDOB);
        lblErrorDOB.setBounds(250, 470, 533, 40);

        lblErrorEmail.setBackground(new java.awt.Color(204, 255, 255));
        lblErrorEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorEmail.setForeground(new java.awt.Color(255, 255, 0));
        pnlMain.add(lblErrorEmail);
        lblErrorEmail.setBounds(240, 310, 800, 40);

        pwdRetypePass.setBackground(new java.awt.Color(0, 153, 255));
        pwdRetypePass.setPreferredSize(new java.awt.Dimension(130, 30));
        pnlMain.add(pwdRetypePass);
        pwdRetypePass.setBounds(10, 820, 130, 30);

        btnCreateAccount.setBackground(new java.awt.Color(239, 128, 47));
        btnCreateAccount.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnCreateAccount.setText("CREATE ACCOUNT");
        btnCreateAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 51), new java.awt.Color(0, 153, 255), new java.awt.Color(255, 51, 51), new java.awt.Color(0, 153, 255)));
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        pnlMain.add(btnCreateAccount);
        btnCreateAccount.setBounds(590, 720, 280, 70);

        pwdEnterPass.setBackground(new java.awt.Color(0, 153, 255));
        pwdEnterPass.setPreferredSize(new java.awt.Dimension(130, 30));
        pnlMain.add(pwdEnterPass);
        pwdEnterPass.setBounds(10, 730, 130, 30);

        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setText("-");
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        pnlMain.add(lblMinimize);
        lblMinimize.setBounds(1000, 0, 22, 73);

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("x");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        pnlMain.add(lblExit);
        lblExit.setBounds(1030, 0, 24, 58);
        pnlMain.add(jXDatePickerDOB);
        jXDatePickerDOB.setBounds(20, 540, 120, 22);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/king.jpg"))); // NOI18N
        pnlMain.add(lblBackground);
        lblBackground.setBounds(0, 0, 1080, 910);

        getContentPane().add(pnlMain);
        pnlMain.setBounds(0, 0, 1080, 910);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        
       

        Date now = new Date();// getting a date for the current system date
        if (txtEnterName.getText().isEmpty()) {//presence check to see if a field has been left blank. 

            lblErrorName.setText("*ERROR: This field cannot be left blank.");    //error messgae occurs if field has been left blank 
        } else {
            lblErrorName.setText("");
        }

        if (txtEnterLastName.getText().isEmpty()) {//presence check to see if a field has been left blank. 

            lblErrorLastName.setText("*ERROR: This field cannot be left blank.");    //error messgae occurs if field has been left blank 
        } else {
            lblErrorLastName.setText("");
        }

        if (rdBgpGender.isSelected(null)) {//if neither button is selected in the button group then error message 
            lblErrorGender.setText("*ERROR: This field cannot be left blank.");//display suitable error message 
        } else {
            lblErrorGender.setText("");//take away error messgage
        }

        for (int i = 0; i < txtEnterName.getText().length(); i++) {//looping until the length of the name 
            // checks to see if the character isnt a letter

            if ((Character.isLetter(txtEnterName.getText().charAt(i)) == false
                    && (Character.isWhitespace(txtEnterName.getText().charAt(i)) == false))) {// if it is not a letter it will give the error message below
                lblErrorName.setText("*ERROR: The name cannot be be comprised of non-lettters. ie special characters and/or numbers)");
            }
        }

        for (int i = 0; i < txtEnterLastName.getText().length(); i++) {//looping until the length of the last name 
            // checks to see if the character isnt a letter

            if ((Character.isLetter(txtEnterLastName.getText().charAt(i)) == false
                    && (Character.isWhitespace(txtEnterLastName.getText().charAt(i)) == false))) {// if it is not a letter it will give the error message below
                lblErrorLastName.setText("*ERROR: The last name cannot be be comprised of non-lettters. ie special characters and/or numbers)");
            }
        }

        String emailCreateAccount = txtEnterEmail.getText(); //getting the text from the text field and storing the value as a string


        boolean flag = true;//boolean will be used to check if the substring is letters only 
        if (emailCreateAccount.isEmpty()) {// presence check to see if a field has been left blank.
            lblErrorEmail.setText("*ERROR: This field cannot be left blank.");//error message for presence check 
        } else {
            if ((emailCreateAccount.length() < 6)) {//if the length is <6
                lblErrorEmail.setText("*ERROR: Your email address cannnot be less than 6 characters in length.");
            } else {

                for (int i = 0; i < emailCreateAccount.length(); i++) {//looping until the length of the name 
                    // checks to see if the character isnt a letter
                    if (!Character.isLetterOrDigit(emailCreateAccount.charAt(i))) {//if the character is not a letter or then flag is false
                        flag = false;
                    }
                }
                int length = emailCreateAccount.length();
                int count = 0;
                boolean checkAt = false;

                for (int i = 0; i < length; i++) {
                    if ((emailCreateAccount.charAt(i)) == '@') {
                        count++;
                        checkAt = true;
                    }

                }
                if (count > 1) {
                    lblErrorEmail.setText("*ERROR: Your email address cannot have more than 1 @");
                } else {
                    if (count == 0) {
                        lblErrorEmail.setText("*ERROR: Your email address must have an @ in it!");
                    } else {
                        if (count == 1 && checkAt) {
                            lblErrorEmail.setText("");
                        }
                    }

                }

            }

        }
        Boolean temp = true;
 String passwordCreateAccount= pwdEnterPass.getText(); //getting the text from the text field and storing the value as a string
        if (passwordCreateAccount.isEmpty()) {//presence check to see if a field has been left blank. 

            lblErrorPass.setText("*ERROR: This field cannot be left blank.");    //error messgae occurs if field has been left blank 
        } else {
            lblErrorPass.setText("");
            if (passwordCreateAccount.length() <= 5) {
                lblErrorPass.setText("*ERROR: Your password must be longer than 5 characters");
            } else {
                for (int i = 0; i < passwordCreateAccount.length(); i++) {
                    if (!Character.isLetterOrDigit(passwordCreateAccount.charAt(i))) {
                        temp = false;
                        lblErrorPass.setText("*ERROR: Your password must not contain any special characters)");
                    }
                }

                boolean test1 = false;

                for (int j = 0; j < passwordCreateAccount.length(); j++) {
                    if (Character.isUpperCase(passwordCreateAccount.charAt(j))) {
                        test1 = true;
                    }
                    if (!test1) {
                        lblErrorPass.setText("*ERROR: Your password must have atleast 1 capital letter in it!)");
                    } else {
                        lblErrorPass.setText("");
                    }

                }

            }
        }

        if (pwdRetypePass.getText().isEmpty()) {//presence check to see if a field has been left blank. 

            lblErrorRetypePass.setText("*ERROR: This field cannot be left blank.");    //error messgae occurs if field has been left blank 
        } else {
            lblErrorRetypePass.setText("");

            if (pwdEnterPass.getText().equals(pwdRetypePass.getText())) {
                lblErrorRetypePass.setText("");
            } else {
                lblErrorRetypePass.setText("*ERROR: Your passwords do NOT match!");
            }
        }

        if (jXDatePickerDOB.getDate() == null) {//checks to see if no value
            lblErrorDOB.setText("*ERROR: This field cannot be left blank.");//display suitable error message 
        } else {

            if (now.after(jXDatePickerDOB.getDate())) {//if the date entered has already occured ie in the past or current day 
                lblErrorDOB.setText(""); // display error message 
            } else {
                lblErrorDOB.setText("*ERROR: INVALID date of birth!"); // display error message 
            }
        }

        if (lblErrorName.getText().equals("") && lblErrorPass.getText().equals("") && lblErrorGender.getText().equals("") && lblErrorLastName.getText().equals("") && lblErrorDOB.getText().equals("") && lblErrorRetypePass.getText().equals("") && lblErrorEmail.getText().equals("")) {

            java.util.Date date = jXDatePickerDOB.getDate();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            int random1;
            String TSANum;
            random1 = 1 + (int) (Math.random() * 100000);

            TSANum = "TSA" + random1;

            JOptionPane.showMessageDialog(null, "Registration successful! \n Your Unique TSANumber is " + TSANum + "\n Make Sure you Remember this Number");//displays the validation message in the form of a message. 
            dispose();//clears the main screen 

            String tempName = txtEnterName.getText();
            String tempLastName = txtEnterLastName.getText();
            String tempEmail = txtEnterEmail.getText();
            boolean tempGender = false;
            if (rbnMale.isSelected()) {
                tempGender = true;
            }

            String tempPassword = pwdEnterPass.getText();
            String tempTSANum = TSANum;

            try {
                dbObjTennis.addCustomer(tempName, tempLastName, tempEmail, tempGender, sqlDate, tempPassword, tempTSANum);
                // this adds the results of the get texts to the record using .addRecord;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }


    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_lblExitMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private org.jdesktop.swingx.JXDatePicker jXDatePickerDOB;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCompulsoryDOB;
    private javax.swing.JLabel lblCompulsoryEmail;
    private javax.swing.JLabel lblCompulsoryGender;
    private javax.swing.JLabel lblCompulsoryLastName;
    private javax.swing.JLabel lblCompulsoryName;
    private javax.swing.JLabel lblCompulsoryPassword;
    private javax.swing.JLabel lblCompulsoryRetypePass;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEnterPasword;
    private javax.swing.JLabel lblErrorDOB;
    private javax.swing.JLabel lblErrorEmail;
    private javax.swing.JLabel lblErrorGender;
    private javax.swing.JLabel lblErrorLastName;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPass;
    private javax.swing.JLabel lblErrorRetypePass;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSelectGender;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPasswordField pwdEnterPass;
    private javax.swing.JPasswordField pwdRetypePass;
    private javax.swing.JRadioButton rbnFemale;
    private javax.swing.JRadioButton rbnMale;
    private javax.swing.ButtonGroup rdBgpGender;
    private javax.swing.JTextField txtEnterEmail;
    private javax.swing.JTextField txtEnterLastName;
    private javax.swing.JTextField txtEnterName;
    // End of variables declaration//GEN-END:variables
}

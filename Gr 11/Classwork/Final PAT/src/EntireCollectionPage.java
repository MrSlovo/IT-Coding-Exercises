
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
public class EntireCollectionPage extends javax.swing.JFrame {

    /**
     * Creates new form EntireCollectionPage
     */
    public TennisAlliance dbEquipObj;
    private String email;
   private String password;
    public EntireCollectionPage(String email, String password) {
        this.password = password;
        this.email = email;
        dbEquipObj  = new TennisAlliance(email);
        initComponents();
        this.setMinimumSize(new Dimension(1453, 893));
        this.setLocationRelativeTo(null);
    }
    

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeading = new javax.swing.JPanel();
        lblHeading = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        pnlRackets = new javax.swing.JPanel();
        lblLinkRackets = new javax.swing.JLabel();
        lblNeedMoreInfoRackets = new javax.swing.JLabel();
        lblRackets = new javax.swing.JLabel();
        pnlCaps = new javax.swing.JPanel();
        lblLinkCaps = new javax.swing.JLabel();
        lblNeedMoreInfoCaps = new javax.swing.JLabel();
        lblCaps = new javax.swing.JLabel();
        pnlBalls = new javax.swing.JPanel();
        lblLinkBalls = new javax.swing.JLabel();
        lblNeedMoreInfoBalls1 = new javax.swing.JLabel();
        lblBalls = new javax.swing.JLabel();
        pnlStrings = new javax.swing.JPanel();
        lblLinkStrings = new javax.swing.JLabel();
        lblNeedMoreInfoStrings = new javax.swing.JLabel();
        lblStrings = new javax.swing.JLabel();
        pnlBags = new javax.swing.JPanel();
        lblLinkBags = new javax.swing.JLabel();
        lblNeedMoreInfoBags = new javax.swing.JLabel();
        lblBags = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(239, 128, 47));
        lblHeading.setText("Our Entire Collection");
        lblHeading.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinimize)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(lblHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pnlRackets.setBackground(new java.awt.Color(0, 102, 153));
        pnlRackets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 128, 47), 3));
        pnlRackets.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLinkRackets.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinkRackets.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkRackets.setText("Click here");
        lblLinkRackets.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkRackets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkRacketsMouseClicked(evt);
            }
        });

        lblNeedMoreInfoRackets.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNeedMoreInfoRackets.setText("To browse our full Racket Collection");

        lblRackets.setBackground(new java.awt.Color(0, 0, 0));
        lblRackets.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRackets.setText("Rackets");

        javax.swing.GroupLayout pnlRacketsLayout = new javax.swing.GroupLayout(pnlRackets);
        pnlRackets.setLayout(pnlRacketsLayout);
        pnlRacketsLayout.setHorizontalGroup(
            pnlRacketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRacketsLayout.createSequentialGroup()
                .addGroup(pnlRacketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRacketsLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(lblRackets, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRacketsLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblLinkRackets))
                    .addGroup(pnlRacketsLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblNeedMoreInfoRackets)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlRacketsLayout.setVerticalGroup(
            pnlRacketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRacketsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRackets)
                .addGap(266, 266, 266)
                .addComponent(lblNeedMoreInfoRackets)
                .addGap(42, 42, 42)
                .addComponent(lblLinkRackets)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        pnlCaps.setBackground(new java.awt.Color(0, 102, 153));
        pnlCaps.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 128, 47), 3));
        pnlCaps.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLinkCaps.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinkCaps.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkCaps.setText("Click here");
        lblLinkCaps.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkCaps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkCapsMouseClicked(evt);
            }
        });

        lblNeedMoreInfoCaps.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNeedMoreInfoCaps.setText("To Browse our full Caps Collection");

        lblCaps.setBackground(new java.awt.Color(0, 0, 0));
        lblCaps.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCaps.setText("Caps");

        javax.swing.GroupLayout pnlCapsLayout = new javax.swing.GroupLayout(pnlCaps);
        pnlCaps.setLayout(pnlCapsLayout);
        pnlCapsLayout.setHorizontalGroup(
            pnlCapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapsLayout.createSequentialGroup()
                .addGroup(pnlCapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapsLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lblCaps, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCapsLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblLinkCaps))
                    .addGroup(pnlCapsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNeedMoreInfoCaps)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlCapsLayout.setVerticalGroup(
            pnlCapsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCaps)
                .addGap(265, 265, 265)
                .addComponent(lblNeedMoreInfoCaps)
                .addGap(50, 50, 50)
                .addComponent(lblLinkCaps)
                .addContainerGap(414, Short.MAX_VALUE))
        );

        pnlBalls.setBackground(new java.awt.Color(0, 102, 153));
        pnlBalls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 128, 47), 3));
        pnlBalls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLinkBalls.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinkBalls.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkBalls.setText("Click here");
        lblLinkBalls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkBalls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkBallsMouseClicked(evt);
            }
        });

        lblNeedMoreInfoBalls1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNeedMoreInfoBalls1.setText("To browse our full Balls Collection");

        lblBalls.setBackground(new java.awt.Color(0, 0, 0));
        lblBalls.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBalls.setText("Balls");

        javax.swing.GroupLayout pnlBallsLayout = new javax.swing.GroupLayout(pnlBalls);
        pnlBalls.setLayout(pnlBallsLayout);
        pnlBallsLayout.setHorizontalGroup(
            pnlBallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBallsLayout.createSequentialGroup()
                .addGroup(pnlBallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBallsLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(lblBalls, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBallsLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblLinkBalls)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBallsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblNeedMoreInfoBalls1)
                .addGap(19, 19, 19))
        );
        pnlBallsLayout.setVerticalGroup(
            pnlBallsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBallsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBalls)
                .addGap(265, 265, 265)
                .addComponent(lblNeedMoreInfoBalls1)
                .addGap(48, 48, 48)
                .addComponent(lblLinkBalls)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStrings.setBackground(new java.awt.Color(0, 102, 153));
        pnlStrings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 128, 47), 3));
        pnlStrings.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLinkStrings.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinkStrings.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkStrings.setText("Click here");
        lblLinkStrings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkStrings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkStringsMouseClicked(evt);
            }
        });

        lblNeedMoreInfoStrings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNeedMoreInfoStrings.setText("To Browse our full Strings Collection");

        lblStrings.setBackground(new java.awt.Color(0, 0, 0));
        lblStrings.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblStrings.setText("Strings");

        javax.swing.GroupLayout pnlStringsLayout = new javax.swing.GroupLayout(pnlStrings);
        pnlStrings.setLayout(pnlStringsLayout);
        pnlStringsLayout.setHorizontalGroup(
            pnlStringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStringsLayout.createSequentialGroup()
                .addGroup(pnlStringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStringsLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblStrings, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStringsLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblLinkStrings))
                    .addGroup(pnlStringsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNeedMoreInfoStrings)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlStringsLayout.setVerticalGroup(
            pnlStringsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStringsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStrings)
                .addGap(266, 266, 266)
                .addComponent(lblNeedMoreInfoStrings)
                .addGap(56, 56, 56)
                .addComponent(lblLinkStrings)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        pnlBags.setBackground(new java.awt.Color(0, 102, 153));
        pnlBags.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(239, 128, 47), 3));
        pnlBags.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLinkBags.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLinkBags.setForeground(new java.awt.Color(255, 255, 255));
        lblLinkBags.setText("Click here");
        lblLinkBags.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLinkBags.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkBagsMouseClicked(evt);
            }
        });

        lblNeedMoreInfoBags.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNeedMoreInfoBags.setText("To browse our full Bags Collection");

        lblBags.setBackground(new java.awt.Color(0, 0, 0));
        lblBags.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBags.setText("Bags");

        javax.swing.GroupLayout pnlBagsLayout = new javax.swing.GroupLayout(pnlBags);
        pnlBags.setLayout(pnlBagsLayout);
        pnlBagsLayout.setHorizontalGroup(
            pnlBagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBagsLayout.createSequentialGroup()
                .addGroup(pnlBagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBagsLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblBags, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBagsLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(lblLinkBags))
                    .addGroup(pnlBagsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNeedMoreInfoBags)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlBagsLayout.setVerticalGroup(
            pnlBagsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBagsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBags)
                .addGap(263, 263, 263)
                .addComponent(lblNeedMoreInfoBags)
                .addGap(63, 63, 63)
                .addComponent(lblLinkBags)
                .addContainerGap(403, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRackets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBalls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCaps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlStrings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBags, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStrings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnlBalls, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlCaps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlRackets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnlBags, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblLinkRacketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkRacketsMouseClicked
 new RacketsInfo(email, password).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lblLinkRacketsMouseClicked

    private void lblLinkCapsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkCapsMouseClicked
        new CapsInfo(email, password).setVisible(true);
    }//GEN-LAST:event_lblLinkCapsMouseClicked

    private void lblLinkBallsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkBallsMouseClicked
        new BallsInfo(email, password).setVisible(true);
    }//GEN-LAST:event_lblLinkBallsMouseClicked

    private void lblLinkStringsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkStringsMouseClicked
       new StringsInfo(email, password).setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_lblLinkStringsMouseClicked

    private void lblLinkBagsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkBagsMouseClicked
new BagsInfo(email, password).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_lblLinkBagsMouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBags;
    private javax.swing.JLabel lblBalls;
    private javax.swing.JLabel lblCaps;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblLinkBags;
    private javax.swing.JLabel lblLinkBalls;
    private javax.swing.JLabel lblLinkCaps;
    private javax.swing.JLabel lblLinkRackets;
    private javax.swing.JLabel lblLinkStrings;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblNeedMoreInfoBags;
    private javax.swing.JLabel lblNeedMoreInfoBalls1;
    private javax.swing.JLabel lblNeedMoreInfoCaps;
    private javax.swing.JLabel lblNeedMoreInfoRackets;
    private javax.swing.JLabel lblNeedMoreInfoStrings;
    private javax.swing.JLabel lblRackets;
    private javax.swing.JLabel lblStrings;
    private javax.swing.JPanel pnlBags;
    private javax.swing.JPanel pnlBalls;
    private javax.swing.JPanel pnlCaps;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JPanel pnlRackets;
    private javax.swing.JPanel pnlStrings;
    // End of variables declaration//GEN-END:variables
}

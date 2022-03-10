
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;
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
public class RacketsInfo extends javax.swing.JFrame {

  

    /**
     * Creates new form RacketsInfo
     */
    public TennisAlliance dbObjTennis;
    
    public String email;
    public String password;

  

    public RacketsInfo(String email, String password) {
 this.password = password; 
        this.email = email;
       initComponents();
        dbObjTennis = new TennisAlliance(email);
        dbObjTennis.showRacketsAlphabetical(tblDisplayRackets);
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

        rdBgpFilterOptions = new javax.swing.ButtonGroup();
        scrDisplayRackets = new javax.swing.JScrollPane();
        tblDisplayRackets = new javax.swing.JTable();
        btnJuniorRackets = new javax.swing.JRadioButton();
        btnPriceAsc = new javax.swing.JRadioButton();
        btnPriceDesc = new javax.swing.JRadioButton();
        btnWeightDesc = new javax.swing.JRadioButton();
        btnWhite = new javax.swing.JRadioButton();
        btnBlack = new javax.swing.JRadioButton();
        btnBlue = new javax.swing.JRadioButton();
        btnRed = new javax.swing.JRadioButton();
        btnGreen = new javax.swing.JRadioButton();
        btnAddToCart = new javax.swing.JButton();
        pnlHeading = new javax.swing.JPanel();
        lblFilters = new javax.swing.JLabel();
        lblRacketsPage = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        btnFaqPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDisplayRackets.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblDisplayRackets.setForeground(new java.awt.Color(239, 128, 47));
        tblDisplayRackets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RacketName", "RacketWeight(g)", "RacketColour", "RacketPrice(Rands)", "StringPattern", "SwingWeight_kg*cm2", "Vibration_Hz", "Power_%", "RacketModel", "Length_cm", "AvailableStock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisplayRackets.getTableHeader().setReorderingAllowed(false);
        scrDisplayRackets.setViewportView(tblDisplayRackets);
        if (tblDisplayRackets.getColumnModel().getColumnCount() > 0) {
            tblDisplayRackets.getColumnModel().getColumn(0).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(0).setPreferredWidth(140);
            tblDisplayRackets.getColumnModel().getColumn(1).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(2).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(3).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(4).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(5).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(6).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(7).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(8).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(9).setResizable(false);
            tblDisplayRackets.getColumnModel().getColumn(10).setResizable(false);
        }

        rdBgpFilterOptions.add(btnJuniorRackets);
        btnJuniorRackets.setText("Junior Rackets");
        btnJuniorRackets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJuniorRacketsMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnPriceAsc);
        btnPriceAsc.setText("Price Ascending");
        btnPriceAsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPriceAscMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnPriceDesc);
        btnPriceDesc.setText("Price Descending");
        btnPriceDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPriceDescMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnWeightDesc);
        btnWeightDesc.setText("Weight Descending");
        btnWeightDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWeightDescMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnWhite);
        btnWhite.setForeground(new java.awt.Color(255, 255, 255));
        btnWhite.setText("Colour: White");
        btnWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWhiteMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnBlack);
        btnBlack.setText("Colour: Black");
        btnBlack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlackMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnBlue);
        btnBlue.setForeground(new java.awt.Color(77, 27, 235));
        btnBlue.setText("Colour: Blue");
        btnBlue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlueMouseClicked(evt);
            }
        });

        rdBgpFilterOptions.add(btnRed);
        btnRed.setForeground(new java.awt.Color(215, 28, 28));
        btnRed.setText("Colour: Red");
        btnRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRedMouseClicked(evt);
            }
        });

        btnGreen.setBackground(new java.awt.Color(204, 204, 204));
        rdBgpFilterOptions.add(btnGreen);
        btnGreen.setForeground(new java.awt.Color(47, 167, 47));
        btnGreen.setText("Colour: Green");
        btnGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGreenMouseClicked(evt);
            }
        });

        btnAddToCart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddToCart.setText("Add selected Item to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblFilters.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFilters.setForeground(new java.awt.Color(239, 128, 47));
        lblFilters.setText("Filters:");

        lblRacketsPage.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblRacketsPage.setForeground(new java.awt.Color(239, 128, 47));
        lblRacketsPage.setText("Rackets Page");

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
                .addContainerGap()
                .addComponent(lblFilters)
                .addGap(639, 639, 639)
                .addComponent(lblRacketsPage, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 748, Short.MAX_VALUE)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFilters)
                .addContainerGap())
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRacketsPage, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        lblSearch.setText("Search for Racket By Racket Name");

        btnCheckout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCheckout.setText("Checkout");
        btnCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseClicked(evt);
            }
        });

        btnFaqPage.setText("FAQ");
        btnFaqPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaqPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnFaqPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddToCart)
                .addGap(459, 459, 459)
                .addComponent(btnCheckout)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPriceAsc)
                            .addComponent(btnPriceDesc)
                            .addComponent(btnJuniorRackets)
                            .addComponent(btnWeightDesc)
                            .addComponent(btnWhite)
                            .addComponent(btnBlack)
                            .addComponent(btnBlue)
                            .addComponent(btnRed)
                            .addComponent(btnGreen)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(scrDisplayRackets)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnPriceAsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPriceDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnJuniorRackets)
                        .addGap(1, 1, 1)
                        .addComponent(btnWeightDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnWhite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGreen)
                        .addGap(51, 51, 51)
                        .addComponent(lblSearch)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrDisplayRackets, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFaqPage))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddToCart))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPriceAscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPriceAscMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsPriceAsc(tblDisplayRackets);
    }//GEN-LAST:event_btnPriceAscMouseClicked

    private void btnPriceDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPriceDescMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsPriceDesc(tblDisplayRackets);
    }//GEN-LAST:event_btnPriceDescMouseClicked

    private void btnJuniorRacketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuniorRacketsMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsJunior(tblDisplayRackets);
    }//GEN-LAST:event_btnJuniorRacketsMouseClicked

    private void btnWeightDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWeightDescMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsWeightDesc(tblDisplayRackets);
    }//GEN-LAST:event_btnWeightDescMouseClicked

    private void btnWhiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWhiteMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsWhite(tblDisplayRackets);
    }//GEN-LAST:event_btnWhiteMouseClicked

    private void btnBlackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlackMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsBlack(tblDisplayRackets);  // TODO add your handling code here:
    }//GEN-LAST:event_btnBlackMouseClicked

    private void btnBlueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlueMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsBlue(tblDisplayRackets);   // TODO add your handling code here:
    }//GEN-LAST:event_btnBlueMouseClicked

    private void btnRedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRedMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsRed(tblDisplayRackets);
    }//GEN-LAST:event_btnRedMouseClicked

    private void btnGreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGreenMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsGreen(tblDisplayRackets);    // TODO add your handling code here:
    }//GEN-LAST:event_btnGreenMouseClicked

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        int columnRacket = 0;
        int columnPrice = 3;
        int row = tblDisplayRackets.getSelectedRow();
//int tempOrderPrice = tblDisplayRackets.getModel().getValueAt(row, columnPrice).toString;
        String tempOrderRacket = tblDisplayRackets.getModel().getValueAt(row, columnRacket).toString();
        String tempEmail = email;
        String tempOrderPrice = tblDisplayRackets.getModel().getValueAt(row, columnPrice).toString();

        try {
            dbObjTennis.addOrder(tempEmail, tempOrderRacket, tempOrderPrice);

            // this adds the results of the get texts to the record using .addRecord;
        } catch (SQLException ex) {
            
        }

    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
      String search = txtSearch.getText();
        //making the variable equal to the text/search that was entered by the user
      //where result is like the help type entered by user

        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        model.setRowCount(0);

        dbObjTennis.showRacketsSearch(tblDisplayRackets, search);//displaying search inside the table that was created to display the reuslts of the search
    }//GEN-LAST:event_txtSearchKeyPressed

    private void btnCheckoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseClicked

        new CheckOutPage(email, password).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckoutMouseClicked

    private void btnFaqPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaqPageActionPerformed
        new FAQ().setVisible(true);
    }//GEN-LAST:event_btnFaqPageActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JRadioButton btnBlack;
    private javax.swing.JRadioButton btnBlue;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnFaqPage;
    private javax.swing.JRadioButton btnGreen;
    private javax.swing.JRadioButton btnJuniorRackets;
    private javax.swing.JRadioButton btnPriceAsc;
    private javax.swing.JRadioButton btnPriceDesc;
    private javax.swing.JRadioButton btnRed;
    private javax.swing.JRadioButton btnWeightDesc;
    private javax.swing.JRadioButton btnWhite;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFilters;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblRacketsPage;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.ButtonGroup rdBgpFilterOptions;
    private javax.swing.JScrollPane scrDisplayRackets;
    private javax.swing.JTable tblDisplayRackets;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
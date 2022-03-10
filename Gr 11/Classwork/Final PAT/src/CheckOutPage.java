
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21nic
 */
public class CheckOutPage extends javax.swing.JFrame {

    /**
     * Creates new form CheckOutPage
     */
    public TennisAlliance dbObjTennis;
    
    private String email;
    private String password; 
   

    public CheckOutPage(String email, String password) {
       
        this.email = email ;
        this.password = password; 
        initComponents();
       
                dbObjTennis = new TennisAlliance(email);
        dbObjTennis.showOrders( email, tblOrders);   
        lblTotalPriceResults.setText("R " +dbObjTennis.calcTotalPrice(email));
        lblTotalItemsResult.setText((dbObjTennis.calcTotalItems(email)));
        lblUserNameHeading.setText(dbObjTennis.getName(email, password));
        this.setMinimumSize(new Dimension(1271, 880));
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
        lblUserNameHeading = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblHeading1 = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        lblTotalItemsResult = new javax.swing.JLabel();
        lblTotalPriceResults = new javax.swing.JLabel();
        btnConfirmOrder = new javax.swing.JButton();
        lblTotalItems = new javax.swing.JLabel();
        btnFaqPage = new javax.swing.JButton();
        btnDeleteSelected = new javax.swing.JButton();
        scrOrders = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        lblBackground = new javax.swing.JLabel();
        lblTotalPriceResults1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pnlHeading.setBackground(new java.awt.Color(0, 102, 153));

        lblUserNameHeading.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblUserNameHeading.setForeground(new java.awt.Color(239, 128, 47));

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

        lblHeading1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblHeading1.setForeground(new java.awt.Color(239, 128, 47));
        lblHeading1.setText("Here are your orders");

        javax.swing.GroupLayout pnlHeadingLayout = new javax.swing.GroupLayout(pnlHeading);
        pnlHeading.setLayout(pnlHeadingLayout);
        pnlHeadingLayout.setHorizontalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadingLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(lblHeading1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserNameHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pnlHeadingLayout.setVerticalGroup(
            pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlHeadingLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(pnlHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserNameHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(pnlHeading);
        pnlHeading.setBounds(0, 0, 1270, 150);

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPrice.setText("Your order total is:");
        getContentPane().add(lblTotalPrice);
        lblTotalPrice.setBounds(30, 450, 210, 25);

        lblTotalItemsResult.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTotalItemsResult.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalItemsResult);
        lblTotalItemsResult.setBounds(240, 410, 220, 30);

        lblTotalPriceResults.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTotalPriceResults.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalPriceResults);
        lblTotalPriceResults.setBounds(240, 450, 230, 30);

        btnConfirmOrder.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnConfirmOrder.setText("Confirm Order");
        btnConfirmOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmOrderMouseClicked(evt);
            }
        });
        getContentPane().add(btnConfirmOrder);
        btnConfirmOrder.setBounds(360, 770, 230, 40);

        lblTotalItems.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTotalItems.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalItems.setText("Total Items in Cart:");
        getContentPane().add(lblTotalItems);
        lblTotalItems.setBounds(30, 410, 220, 25);

        btnFaqPage.setText("FAQ ");
        btnFaqPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaqPageActionPerformed(evt);
            }
        });
        getContentPane().add(btnFaqPage);
        btnFaqPage.setBounds(0, 820, 57, 23);

        btnDeleteSelected.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDeleteSelected.setText("Delete Selected Item from Cart");
        btnDeleteSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSelectedActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteSelected);
        btnDeleteSelected.setBounds(870, 720, 310, 29);

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Your order(s)", "Order Price(Rands)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.getTableHeader().setReorderingAllowed(false);
        scrOrders.setViewportView(tblOrders);
        if (tblOrders.getColumnModel().getColumnCount() > 0) {
            tblOrders.getColumnModel().getColumn(0).setResizable(false);
            tblOrders.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(scrOrders);
        scrOrders.setBounds(790, 360, 452, 310);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesForPAT/gael three.jpg"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 150, 1270, 720);

        lblTotalPriceResults1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTotalPriceResults1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblTotalPriceResults1);
        lblTotalPriceResults1.setBounds(240, 450, 230, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);//minimizes the screen
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked

        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnConfirmOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmOrderMouseClicked

        if(lblTotalPriceResults.getText().contains("null")){
            JOptionPane.showMessageDialog(null, "Your cart is empty! \nPlease add an item to your cart before checking out");
        }else{
     new OrderSuccessful(email, password).setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmOrderMouseClicked

    private void btnFaqPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaqPageActionPerformed
        new FAQ().setVisible(true);
    }//GEN-LAST:event_btnFaqPageActionPerformed

    private void btnDeleteSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSelectedActionPerformed
 DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        int columnOrder = 0;
      
        int row = tblOrders.getSelectedRow();
        
        String tempOrder = tblOrders.getModel().getValueAt(row, columnOrder).toString();
          
        try {
            dbObjTennis.deleteItem(email, tempOrder);
            model.setRowCount(0);
            dbObjTennis.showOrders(email, tblOrders);
             lblTotalPriceResults.setText("R "+dbObjTennis.calcTotalPrice(email));
        lblTotalItemsResult.setText(dbObjTennis.calcTotalItems(email));
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteSelectedActionPerformed
  
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmOrder;
    private javax.swing.JButton btnDeleteSelected;
    private javax.swing.JButton btnFaqPage;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblHeading1;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblTotalItems;
    public javax.swing.JLabel lblTotalItemsResult;
    private javax.swing.JLabel lblTotalPrice;
    public javax.swing.JLabel lblTotalPriceResults;
    public javax.swing.JLabel lblTotalPriceResults1;
    private javax.swing.JLabel lblUserNameHeading;
    private javax.swing.JPanel pnlHeading;
    private javax.swing.JScrollPane scrOrders;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}


import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TennisAlliance {

    private Connection conn = null;
    private Statement stmt = null;
    private String email;
    private String password; 
    //this was the method  i made in order to connect to my Databases.

    //Default Constructor. (Sets variables of the class to their default values) This method is used to connect to the MS Access “TennisAlliance” database. It returns the connection status of the MS Access db.
    //This method is public because it needs to be accessed outside of this class.
    public TennisAlliance(String  email ) {
        this.email = email;
        String driver1 = "jdbc:ucanaccess://" + "TennisAlliance.accdb";

        try {
            conn = DriverManager.getConnection(driver1);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database has not been connected" + ex);
        }

    }

    ResultSet executeQuery(String sqlStmt) throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sqlStmt);
        return rs;
    }
    //This method accepts String update. This method is void and it is used to execute a sql statement. It is a method that assists other methods such as addCustomer() in executing its sql statement. 
    //This method is public because it needs to be accessed outside of this class
    void updateRecord(String update) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate(update);
        st.close();
    }

    //this is the method that i made in order to add a customer record to my database
    public void addCustomer(String tempName, String tempLast, String tempEmail, boolean tempGender, Date tempDate, String tempPassword, String tempTSANum) throws SQLException {
//This method is used to add a customer’s details to the CustomerDetails Database. This method accepts String tempName, String tempLast, String tempEmail, boolean tempGender, Date tempDate, String tempPassword, String tempTSANum. These are the values entered by the user and these values get added to the database in this method. 
//The details are stored in the database upon account creation. These details are later used to verify users. A suitable error message is displayed if unable to add the details to the db. This method is public because it needs to be accessed outside of this class.
//Get results of the SQL statement
try{
        String query = "INSERT INTO tblUserInfo (FirstName, LastName, CustomerEmailAddress, Male, DOB, CustomerPassword, TSANumber) VALUES ('" + tempName + "','" + tempLast + "','" + tempEmail + "'," + tempGender + ",'" + tempDate + "','" + tempPassword + "','" + tempTSANum + "');";
        this.updateRecord(query);
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}

    }

   public void checkDB(String email, String password) throws SQLException {
     this.email = email;
     this.password = password;
       
       // Void method that has String email, and String password as its parameters. It is used to check whether the user details entered in the SignInPage.java match the corresponding email- password combination in the CustomerDetails database. It displays a success page if the details match those in the database. If unsuccessful then it displays a suitable error message. 
       //This method is public because it needs to be accessed outside of this class.
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT FirstName, TSANumber, CustomerEmailAddress, CustomerPassword FROM tblUserInfo WHERE CustomerEmailAddress = '"+email+"' AND CustomerPassword = '"+password+"'");

            if (rs.next()) {
WelcomeMessage wM = new WelcomeMessage(email, password);
wM.lblName.setText(rs.getString(1));
wM.lblTSANumResult.setText(rs.getString(2));
wM.setVisible(true);

                
            }else{
                 JOptionPane.showMessageDialog(null, "Email and Password do not match! \n(The email-password combination that you have entered does not match details upon account creation!)");
        }
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
                }
        

    }
     public void checkDBAdmin(String email, String password) throws SQLException{//Void method that has String email, and String password as its parameters. 
        //It is used to check whether the admin details entered in the AdminSignInPage.java match the corresponding email- password combination in the AdminDetails database. It displays a success page if the details match those in  the database. If unsuccessful then it displays a suitable error message. 
        //This method is public because it needs to be accessed outside of this class.
    try{
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT AdminEmail, AdminPassword FROM tblAdminSignIn WHERE AdminEmail = '"+email+"' AND AdminPassword = '"+password+"'");
        
           
            if (rs.next()) {
                WelcomeMessageAdmin wA = new WelcomeMessageAdmin(email);
                wA.lblName.setText(rs.getString(1));
                wA.setVisible(true);
                

            } else {
                JOptionPane.showMessageDialog(null, "Email Address and password do not match!");
            }
    } catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }
          
}

    public String getTSA(String email, String password ) {
        this.password = password; 
        this.email = email;
//This method accepts String email and String password. It uses string email to get the TSANumber of the user with email string email.It returns the result of the sql statement which would be the user’s TSANumber. If unable to get the user’s TSANum, a suitable error message is displayed.
//This method is public because it needs to be accessed outside of this class.
        String output = "";
        try {
            stmt = conn.createStatement();
            String sql = "SELECT TSANumber FROM tblUserInfo WHERE CustomerEmailAddress ='" + email + "'AND CustomerPassword ='" +password+ "' ";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                output = rs.getString(1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return output;
    }
  public String getName(String email, String password) {
      this.password = password; 
      this.email = email;
//This method accepts String email and String password. It uses string email to get the name of the user with email string email.
//It returns the result of the sql statement which would be the user’s name. If unable to get the user’s Name, a suitable error message is displayed. This method is public because it needs to be accessed outside of this class.


        String output = "";
        try {
            stmt = conn.createStatement();
            String sql = "SELECT FirstName FROM tblUserInfo WHERE CustomerEmailAddress ='" + email + "' AND CustomerPassword ='" +password+ "' ";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                output = rs.getString(1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return output;
    }
      //this is the method that i made in order to add the user and their order to the tblOrders in Access once they select add to cart button.
    public void addOrder(String email, String tempOrder, String tempOrderPrice) throws SQLException {
//Void method used to add the selected item to the user’s cart. Receives String email, String tempOrder, String tempOrderPrice as parameters. String email is used to determine which user’s cart should be updated based on the email address.The String tempOrder and tempOrderPrice is used to determine which item and row in the JTable should be added to the user’s cart. 
//The name of item, and price are added to the user’s cart matching with corresp email address. If unable to add to cart then a suitable error message is displayed. This method is public because it needs to be accessed outside of this class.

        try {
            String query = "INSERT INTO tblOrders (userEmail, userOrder, orderPrice) VALUES ('"+email+"','"+tempOrder+"',"+tempOrderPrice+");";
            this.updateRecord(query);

            JOptionPane.showMessageDialog(null, "Item has been added to your cart successfully");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //This method is typed. It accepts String email and JTable tblOrders. It is used to get the data that will populate the JTable. It makes use of the Orders class’ mutator methods and adds an object of type Orders to the ArrayList whilst the sql statement is still receiving data from the database. Adds the userOrder and Price for the user with email String email to the arrayList. This method returns the ArrayList. 
    //This method is public because it needs to be accessed outside of this class.
    public ArrayList<Orders> orderList(String email, JTable tblOrders) {
        ArrayList<Orders> orderLists = new ArrayList<>();
        this.email = email;
        try {
//Get results of the SQL statement
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT userOrder, orderPrice FROM tblOrders WHERE userEmail ='"+email+"'");

            Orders orders;
            while (rs.next()) {
                orders = new Orders(rs.getString("userOrder"),
                        rs.getInt("orderPrice"));

                orderLists.add(orders);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Your cart is empty!");
        }
        return orderLists;
    }

    //Accepts String email and JTable tblOrders. 
//This void method is used to display the arrayList orderLists in the JTable tblOrders. A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time. Suitable error message is shown if the user has no items in his/her cart.
    //This method is public because it needs to be accessed outside of this class

    public void showOrders(String email, JTable tblOrders) {
        this.email= email;
        ArrayList<Orders> listOrder = orderList(email, tblOrders);
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        Object[] row = new Object[2];
        for (int i = 0; i < listOrder.size(); i++) {

            row[0] = listOrder.get(i).getUserOrder();
            row[1] = listOrder.get(i).getOrderPrice();

            model.addRow(row);
        }
    }

    //Accepts String email as a parameter. Typed method is used to display the total price of the user’s cart. The value of the total price of all of the items in the user’s cart is returned. The email address is used to determine which user’s cart’s total needs to be displayed. If the user's cart is empty then a suitable error message is displayed. 
    //This method is public because it needs to be accessed outside of this class.
     public String calcTotalPrice(String email) {
        
      String output = "";
        try {
            stmt = conn.createStatement();
            String  sql=  "SELECT SUM(orderPrice) FROM tblOrders WHERE userEmail ='"+email+"'";
            ResultSet rs = stmt.executeQuery(sql);
           if(rs.next()){
               output = rs.getString(1);
           }
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
return output;
     }
     
     //Accepts String email as a parameter. Typed method is used to display the total amount of items in the user’s cart. The value of the total items in the user's cart is returned. The email address is used to determine which  user's cart’s total items needs to be displayed. If the user's cart is empty then a suitable error message is displayed. 
     //This method is public because it needs to be accessed outside of this class.
     public String calcTotalItems(String email) {
        
      String output = "";
        try {
            stmt = conn.createStatement();
            String  sql=  "SELECT COUNT(orderPrice) FROM tblOrders WHERE userEmail ='"+email+"'";
            ResultSet rs = stmt.executeQuery(sql);
           if(rs.next()){
               output = rs.getString(1);
           }
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
return output;
     }
     
     //Void method that is used to clear the user’s cart once they have made an order and want to continue shopping. 
//Accepts String email as a parameter. String email is used to determine which user’s cart should be cleared. If the cart is unable to be cleared, then display a suitable error message. This method is public because it needs to be accessed outside of this class.

     public void deleteUserCart(String email) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblOrders WHERE userEmail ='"+email+"'";
            this.updateRecord(query);

            JOptionPane.showMessageDialog(null, "Your cart has successfully been cleared! \nPlease feel free to continue shopping");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
       public void deleteItem(String email, String tempOrder) throws SQLException {
//Void method that accepts String email, tempOrder. This method is used to delete the selected row from the JTable tblOrders. This method deletes the row where the order is equal to the one selected in the JTable and the user’s email address matches the email address String email. If unable to delete the item from the cart then it displays a suitable error message. 
//This method is public because it needs to be accessed outside of this class.
//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblOrders WHERE userEmail ='"+email+"' AND userOrder ='"+tempOrder+"'";
            this.updateRecord(query);

             JOptionPane.showMessageDialog(null, "Item has been removed from your cart");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
        }
    }
   


    //this is the method that sorts through all of the rackets in the database and orders it alphabetically. 
   //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by name alphabetically. Adds all fields of the Rackets class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class. 

    public ArrayList<Rackets> racketListAlphabetical() {
        ArrayList<Rackets> racketsListAlphabetical = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT RacketName, [RacketWeight(g)], RacketColour, [RacketPrice(Rands)], StringPattern, [SwingWeight_kg*cm2], [Vibration_Hz], [Power_%], RacketModel, [Length_cm], AvailableStock FROM tblRackets ORDER BY RacketName";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListAlphabetical.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListAlphabetical;
    }

    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListAlphabetical in the JTable tblDisplayRackets. A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. 
    //This method is public because it needs to be accessed outside of this class

    public void showRacketsAlphabetical(JTable tblDisplayRackets) {
        ArrayList<Rackets> listAlphabetical = racketListAlphabetical();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listAlphabetical.size(); i++) {

            row[0] = listAlphabetical.get(i).getName();
            row[1] = listAlphabetical.get(i).getRacketWeight();
            row[2] = listAlphabetical.get(i).getColour();
            row[3] = listAlphabetical.get(i).getPrice();
            row[4] = listAlphabetical.get(i).getStringPattern();
            row[5] = listAlphabetical.get(i).getSwingWeight();
            row[6] = listAlphabetical.get(i).getVibration();
            row[7] = listAlphabetical.get(i).getPower();
            row[8] = listAlphabetical.get(i).getRacketModel();
            row[9] = listAlphabetical.get(i).getLength();
            row[10] = listAlphabetical.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. 
    //It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  
    //Sql returns data sorted by price asc. Adds all fields of the Rackets class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.


    public ArrayList<Rackets> racketListPriceAsc() {
        ArrayList<Rackets> racketsListPriceAsc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets ORDER BY [RacketPrice(Rands)]";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListPriceAsc.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListPriceAsc;
    }
//Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListPrice in the JTable tblDisplayRackets.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsPriceAsc(JTable tblDisplayRackets) {
        ArrayList<Rackets> listPrice = racketListPriceAsc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listPrice.size(); i++) {

            row[0] = listPrice.get(i).getName();
            row[1] = listPrice.get(i).getRacketWeight();
            row[2] = listPrice.get(i).getColour();
            row[3] = listPrice.get(i).getPrice();
            row[4] = listPrice.get(i).getStringPattern();
            row[5] = listPrice.get(i).getSwingWeight();
            row[6] = listPrice.get(i).getVibration();
            row[7] = listPrice.get(i).getPower();
            row[8] = listPrice.get(i).getRacketModel();
            row[9] = listPrice.get(i).getLength();
            row[10] = listPrice.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database. 
    //Sql returns data sorted by price Desc. Adds all fields of the Rackets class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListPriceDesc() {
        ArrayList<Rackets> racketsListPriceDesc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets ORDER BY [RacketPrice(Rands)] DESC";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListPriceDesc.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListPriceDesc;
    }

    
    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListPriceDescOrder in the JTable tblDisplayRackets. A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty.
    //This method is public because it needs to be accessed outside of this class.

    public void showRacketsPriceDesc(JTable tblDisplayRackets) {
        ArrayList<Rackets> listPriceDescOrder = racketListPriceDesc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listPriceDescOrder.size(); i++) {

            row[0] = listPriceDescOrder.get(i).getName();
            row[1] = listPriceDescOrder.get(i).getRacketWeight();
            row[2] = listPriceDescOrder.get(i).getColour();
            row[3] = listPriceDescOrder.get(i).getPrice();
            row[4] = listPriceDescOrder.get(i).getStringPattern();
            row[5] = listPriceDescOrder.get(i).getSwingWeight();
            row[6] = listPriceDescOrder.get(i).getVibration();
            row[7] = listPriceDescOrder.get(i).getPower();
            row[8] = listPriceDescOrder.get(i).getRacketModel();
            row[9] = listPriceDescOrder.get(i).getLength();
            row[10] = listPriceDescOrder.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  Sql returns data for junior rackets. Adds all fields of the Rackets class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListJunior() {
        ArrayList<Rackets> racketsListsJunior = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets Where LOWER(RacketName) LIKE '*junior*' OR LOWER(RacketName) LIKE '*lite*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListsJunior.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListsJunior;
    }

    
    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListJunior in the JTable tblDisplayRackets. A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty.
    //This method is public because it needs to be accessed outside of this class.

    public void showRacketsJunior(JTable tblDisplayRackets) {
        ArrayList<Rackets> listJunior = racketListJunior();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listJunior.size(); i++) {

            row[0] = listJunior.get(i).getName();
            row[1] = listJunior.get(i).getRacketWeight();
            row[2] = listJunior.get(i).getColour();
            row[3] = listJunior.get(i).getPrice();
            row[4] = listJunior.get(i).getStringPattern();
            row[5] = listJunior.get(i).getSwingWeight();
            row[6] = listJunior.get(i).getVibration();
            row[7] = listJunior.get(i).getPower();
            row[8] = listJunior.get(i).getRacketModel();
            row[9] = listJunior.get(i).getLength();
            row[10] = listJunior.get(i).getAvailableStock();
            model.addRow(row);
        }
    }
    
    //This method is typed. It has no parameters. 
    //It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database. 
    //Sql returns data by weight desc. Adds all fields of the Rackets class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.


    public ArrayList<Rackets> racketListWeightDesc() {
        ArrayList<Rackets> racketsListWeightDesc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets ORDER BY [RacketWeight(g)] DESC";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListWeightDesc.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListWeightDesc;
    }

    
    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListWeightDescOrder in the JTable tblDisplayRackets. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsWeightDesc(JTable tblDisplayRackets) {
        ArrayList<Rackets> listWeightDescOrder = racketListWeightDesc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listWeightDescOrder.size(); i++) {

            row[0] = listWeightDescOrder.get(i).getName();
            row[1] = listWeightDescOrder.get(i).getRacketWeight();
            row[2] = listWeightDescOrder.get(i).getColour();
            row[3] = listWeightDescOrder.get(i).getPrice();
            row[4] = listWeightDescOrder.get(i).getStringPattern();
            row[5] = listWeightDescOrder.get(i).getSwingWeight();
            row[6] = listWeightDescOrder.get(i).getVibration();
            row[7] = listWeightDescOrder.get(i).getPower();
            row[8] = listWeightDescOrder.get(i).getRacketModel();
            row[9] = listWeightDescOrder.get(i).getLength();
            row[10] = listWeightDescOrder.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  Sql returns data for white rackets. Adds all fields of the Rackets class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListWhite() {
        ArrayList<Rackets> racketsListWhite = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets Where LOWER(RacketColour) LIKE '*white*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListWhite.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListWhite;
    }

    
    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListWhite in the JTable tblDisplayRackets.
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsWhite(JTable tblDisplayRackets) {
        ArrayList<Rackets> listWhite = racketListWhite();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listWhite.size(); i++) {

            row[0] = listWhite.get(i).getName();
            row[1] = listWhite.get(i).getRacketWeight();
            row[2] = listWhite.get(i).getColour();
            row[3] = listWhite.get(i).getPrice();
            row[4] = listWhite.get(i).getStringPattern();
            row[5] = listWhite.get(i).getSwingWeight();
            row[6] = listWhite.get(i).getVibration();
            row[7] = listWhite.get(i).getPower();
            row[8] = listWhite.get(i).getRacketModel();
            row[9] = listWhite.get(i).getLength();
            row[10] = listWhite.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  Sql returns data for black rackets. Adds all fields of the Rackets class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListBlack() {
        ArrayList<Rackets> racketsListBlack = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets Where LOWER(RacketColour) LIKE '*black*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListBlack.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListBlack;
    }

    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListBlack in the JTable tblDisplayRackets.
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsBlack(JTable tblDisplayRackets) {
        ArrayList<Rackets> listBlack = racketListBlack();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listBlack.size(); i++) {

            row[0] = listBlack.get(i).getName();
            row[1] = listBlack.get(i).getRacketWeight();
            row[2] = listBlack.get(i).getColour();
            row[3] = listBlack.get(i).getPrice();
            row[4] = listBlack.get(i).getStringPattern();
            row[5] = listBlack.get(i).getSwingWeight();
            row[6] = listBlack.get(i).getVibration();
            row[7] = listBlack.get(i).getPower();
            row[8] = listBlack.get(i).getRacketModel();
            row[9] = listBlack.get(i).getLength();
            row[10] = listBlack.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    
    
    //This method is typed. It has no parameters. 
    //It is used to get the data that will populate the JTable. 
    //It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  Sql returns data for blue rackets. Adds all fields of the Rackets class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListBlue() {
        ArrayList<Rackets> racketsListBlue = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets Where LOWER(RacketColour) LIKE '*blue*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListBlue.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListBlue;
    }

    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListBlue in the JTable tblDisplayRackets. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsBlue(JTable tblDisplayRackets) {
        ArrayList<Rackets> listBlue = racketListBlue();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listBlue.size(); i++) {

            row[0] = listBlue.get(i).getName();
            row[1] = listBlue.get(i).getRacketWeight();
            row[2] = listBlue.get(i).getColour();
            row[3] = listBlue.get(i).getPrice();
            row[4] = listBlue.get(i).getStringPattern();
            row[5] = listBlue.get(i).getSwingWeight();
            row[6] = listBlue.get(i).getVibration();
            row[7] = listBlue.get(i).getPower();
            row[8] = listBlue.get(i).getRacketModel();
            row[9] = listBlue.get(i).getLength();
            row[10] = listBlue.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  Sql returns data for red rackets. Adds all fields of the Rackets class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListRed() {
        ArrayList<Rackets> racketsListRed = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets Where LOWER(RacketColour) LIKE '*red*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListRed.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListRed;
    }

    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListRed in the JTable tblDisplayRackets.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsRed(JTable tblDisplayRackets) {
        ArrayList<Rackets> listRed = racketListRed();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listRed.size(); i++) {

            row[0] = listRed.get(i).getName();
            row[1] = listRed.get(i).getRacketWeight();
            row[2] = listRed.get(i).getColour();
            row[3] = listRed.get(i).getPrice();
            row[4] = listRed.get(i).getStringPattern();
            row[5] = listRed.get(i).getSwingWeight();
            row[6] = listRed.get(i).getVibration();
            row[7] = listRed.get(i).getPower();
            row[8] = listRed.get(i).getRacketModel();
            row[9] = listRed.get(i).getLength();
            row[10] = listRed.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database.  Sql returns data for green rackets. Adds all fields of the Rackets class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> racketListGreen() {
        ArrayList<Rackets> racketsListGreen = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT *"//query statemnt for searching using WHERE
                    + " FROM tblRackets Where LOWER(RacketColour) LIKE '*green*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                racketsListGreen.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return racketsListGreen;
    }

    //Accepts JTable tblDisplayRackets 
//This void method is used to display the arrayList ListGreen in the JTable tblDisplayRackets. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsGreen(JTable tblDisplayRackets) {
        ArrayList<Rackets> listGreen = racketListGreen();
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listGreen.size(); i++) {

            row[0] = listGreen.get(i).getName();
            row[1] = listGreen.get(i).getRacketWeight();
            row[2] = listGreen.get(i).getColour();
            row[3] = listGreen.get(i).getPrice();
            row[4] = listGreen.get(i).getStringPattern();
            row[5] = listGreen.get(i).getSwingWeight();
            row[6] = listGreen.get(i).getVibration();
            row[7] = listGreen.get(i).getPower();
            row[8] = listGreen.get(i).getRacketModel();
            row[9] = listGreen.get(i).getLength();
            row[10] = listGreen.get(i).getAvailableStock();
            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. 
    //Sql returns data sorted by name alphabetically. Adds all fields of the Balls class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> ballListAlphabetical() {
        ArrayList<Balls> ballsListAlphabetical = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls ORDER BY BallName";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListAlphabetical.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListAlphabetical;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBallsAlphabetical in the JTable tblDisplayBalls. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsAlphabetical(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsAlphabetical = ballListAlphabetical();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsAlphabetical.size(); i++) {

            row[0] = listBallsAlphabetical.get(i).getName();
            row[1] = listBallsAlphabetical.get(i).isHighAlt();
            row[2] = listBallsAlphabetical.get(i).getColour();
            row[3] = listBallsAlphabetical.get(i).getPrice();
            row[4] = listBallsAlphabetical.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price asc. Adds all fields of the Balls class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> ballListPriceAsc() {
        ArrayList<Balls> ballsListPriceAsc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls ORDER BY [PricePerCan(Rands)]";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListPriceAsc.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListPriceAsc;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBallsPriceAsc in the JTable tblDisplayBalls.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.
    public void showBallsPriceAsc(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsPriceAsc = ballListPriceAsc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsPriceAsc.size(); i++) {

            row[0] = listBallsPriceAsc.get(i).getName();
            row[1] = listBallsPriceAsc.get(i).isHighAlt();
            row[2] = listBallsPriceAsc.get(i).getColour();
            row[3] = listBallsPriceAsc.get(i).getPrice();
            row[4] = listBallsPriceAsc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price desc. Adds all fields of the Balls class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> ballListPriceDesc() {
        ArrayList<Balls> ballsListPriceDesc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls ORDER BY [PricePerCan(Rands)] DESC";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListPriceDesc.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListPriceDesc;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBallsPriceDesc in the JTable tblDisplayBalls. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsPriceDesc(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsPriceDesc = ballListPriceDesc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsPriceDesc.size(); i++) {

            row[0] = listBallsPriceDesc.get(i).getName();
            row[1] = listBallsPriceDesc.get(i).isHighAlt();
            row[2] = listBallsPriceDesc.get(i).getColour();
            row[3] = listBallsPriceDesc.get(i).getPrice();
            row[4] = listBallsPriceDesc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all high altitude balls. Adds all fields of the Balls class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> ballListHighAlt() {
        ArrayList<Balls> ballsListHighAlt = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls WHERE HighAltitude = TRUE";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListHighAlt.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListHighAlt;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBallsHighAlt in the JTable tblDisplayBalls. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsHighAlt(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsHighAlt = ballListHighAlt();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsHighAlt.size(); i++) {

            row[0] = listBallsHighAlt.get(i).getName();
            row[1] = listBallsHighAlt.get(i).isHighAlt();
            row[2] = listBallsHighAlt.get(i).getColour();
            row[3] = listBallsHighAlt.get(i).getPrice();
            row[4] = listBallsHighAlt.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for white balls. Adds all fields of the Balls class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> ballListWhite() {
        ArrayList<Balls> ballsListWhite = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls WHERE Lower(CanColour) like '*white*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListWhite.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListWhite;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBallsWhite in the JTable tblDisplayBalls. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsWhite(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsWhite = ballListWhite();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsWhite.size(); i++) {

            row[0] = listBallsWhite.get(i).getName();
            row[1] = listBallsWhite.get(i).isHighAlt();
            row[2] = listBallsWhite.get(i).getColour();
            row[3] = listBallsWhite.get(i).getPrice();
            row[4] = listBallsWhite.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for green balls. Adds all fields of the Balls class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> ballListGreen() {
        ArrayList<Balls> ballsListGreen = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls WHERE Lower(CanColour) like '*green*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListGreen.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListGreen;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBallsGreen in the JTable tblDisplayBalls. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsGreen(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsGreen = ballListGreen();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsGreen.size(); i++) {

            row[0] = listBallsGreen.get(i).getName();
            row[1] = listBallsGreen.get(i).isHighAlt();
            row[2] = listBallsGreen.get(i).getColour();
            row[3] = listBallsGreen.get(i).getPrice();
            row[4] = listBallsGreen.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for black balls. Adds all fields of the Balls class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class
    public ArrayList<Balls> ballListBlack() {
        ArrayList<Balls> ballsListBlack = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock FROM tblBalls WHERE Lower(CanColour) like '*black*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                ballsListBlack.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ballsListBlack;
    }

    //Accepts JTable tblDisplayBalls 
//This void method is used to display the arrayList ListBagsBlack in the JTable tblDisplayBalls. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsBlack(JTable tblDisplayBalls) {
        ArrayList<Balls> listBallsBlack = ballListBlack();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBallsBlack.size(); i++) {

            row[0] = listBallsBlack.get(i).getName();
            row[1] = listBallsBlack.get(i).isHighAlt();
            row[2] = listBallsBlack.get(i).getColour();
            row[3] = listBallsBlack.get(i).getPrice();
            row[4] = listBallsBlack.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by name alphabetically. Adds all fields of the Bags class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Bags> bagListAlphabetical() {
        ArrayList<Bags> bagsListAlphabetical = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags ORDER BY BagName";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListAlphabetical.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListAlphabetical;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsAlphabetical in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsAlphabetical(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsAlphabetical = bagListAlphabetical();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsAlphabetical.size(); i++) {

            row[0] = listBagsAlphabetical.get(i).getName();
            row[1] = listBagsAlphabetical.get(i).getColour();
            row[2] = listBagsAlphabetical.get(i).getRacketSpace();
            row[3] = listBagsAlphabetical.get(i).getPrice();
            row[4] = listBagsAlphabetical.get(i).getAvailableStock();

            model.addRow(row);
        }
    }
//This method is typed. It has no parameters. It is used to get the data that will populate the JTable. 
    //It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price asc. Adds all fields of the Bags class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.

    public ArrayList<Bags> bagListPriceAsc() {
        ArrayList<Bags> bagsListPriceAsc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags ORDER BY [BagPrice(Rands)] ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListPriceAsc.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListPriceAsc;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsPriceAsc in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsPriceAsc(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsPriceAsc = bagListPriceAsc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsPriceAsc.size(); i++) {

            row[0] = listBagsPriceAsc.get(i).getName();
            row[1] = listBagsPriceAsc.get(i).getColour();
            row[2] = listBagsPriceAsc.get(i).getRacketSpace();
            row[3] = listBagsPriceAsc.get(i).getPrice();
            row[4] = listBagsPriceAsc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price desc. Adds all fields of the Bags class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Bags> bagListPriceDesc() {
        ArrayList<Bags> bagsListPriceDesc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags ORDER BY [BagPrice(Rands)] DESC ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListPriceDesc.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListPriceDesc;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsPriceDesc in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsPriceDesc(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsPriceDesc = bagListPriceDesc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsPriceDesc.size(); i++) {

            row[0] = listBagsPriceDesc.get(i).getName();
            row[1] = listBagsPriceDesc.get(i).getColour();
            row[2] = listBagsPriceDesc.get(i).getRacketSpace();
            row[3] = listBagsPriceDesc.get(i).getPrice();
            row[4] = listBagsPriceDesc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all big bags(with racketspace >=10)
 //Adds all fields of the Bags class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.

    public ArrayList<Bags> bagListBig() {
        ArrayList<Bags> bagsListBig = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags WHERE RacketSpace>=10 ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListBig.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListBig;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsBig in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable.
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsBig(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsBig = bagListBig();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsBig.size(); i++) {

            row[0] = listBagsBig.get(i).getName();
            row[1] = listBagsBig.get(i).getColour();
            row[2] = listBagsBig.get(i).getRacketSpace();
            row[3] = listBagsBig.get(i).getPrice();
            row[4] = listBagsBig.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all small bags(with racketspace <6)
 //Adds all fields of the Bags class to the array list. This method returns the ArrayList. 
    //This method is public because it needs to be accessed outside of this class

    public ArrayList<Bags> bagListSmall() {
        ArrayList<Bags> bagsListSmall = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags WHERE RacketSpace>0 AND RacketSpace<6 ";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListSmall.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListSmall;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsSmall in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsSmall(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsSmall = bagListSmall();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsSmall.size(); i++) {

            row[0] = listBagsSmall.get(i).getName();
            row[1] = listBagsSmall.get(i).getColour();
            row[2] = listBagsSmall.get(i).getRacketSpace();
            row[3] = listBagsSmall.get(i).getPrice();
            row[4] = listBagsSmall.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all medium bags(with racketspace =8 OR racketspace = 6)
 //Adds all fields of the Bags class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.

    public ArrayList<Bags> bagListMedium() {
        ArrayList<Bags> bagsListMedium = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags WHERE RacketSpace=6 OR RacketSpace = 8";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListMedium.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListMedium;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsMedium in the JTable tblDisplayBags.
        //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsMedium(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsMedium = bagListMedium();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsMedium.size(); i++) {

            row[0] = listBagsMedium.get(i).getName();
            row[1] = listBagsMedium.get(i).getColour();
            row[2] = listBagsMedium.get(i).getRacketSpace();
            row[3] = listBagsMedium.get(i).getPrice();
            row[4] = listBagsMedium.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all white bags. Adds all fields of the Bags class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Bags> bagListWhite() {
        ArrayList<Bags> bagsListWhite = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags WHERE LOWER(BagColour) LIKE '*white*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListWhite.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListWhite;
    }

    
    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsWhite in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsWhite(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsWhite = bagListWhite();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsWhite.size(); i++) {

            row[0] = listBagsWhite.get(i).getName();
            row[1] = listBagsWhite.get(i).getColour();
            row[2] = listBagsWhite.get(i).getRacketSpace();
            row[3] = listBagsWhite.get(i).getPrice();
            row[4] = listBagsWhite.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all red bags. Adds all fields of the Bags class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class
    public ArrayList<Bags> bagListBlack() {
        ArrayList<Bags> bagsListBlack = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags WHERE LOWER(BagColour) LIKE '*black*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListBlack.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListBlack;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsRed in the JTable tblDisplayBags.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsBlack(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsBlack = bagListBlack();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsBlack.size(); i++) {

            row[0] = listBagsBlack.get(i).getName();
            row[1] = listBagsBlack.get(i).getColour();
            row[2] = listBagsBlack.get(i).getRacketSpace();
            row[3] = listBagsBlack.get(i).getPrice();
            row[4] = listBagsBlack.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns all black bags. Adds all fields of the Bags class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Bags> bagListRed() {
        ArrayList<Bags> bagsListRed = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock FROM tblBags WHERE LOWER(BagColour) LIKE '*red*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));

                bagsListRed.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return bagsListRed;
    }

    //Accepts JTable tblDisplayBags 
//This void method is used to display the arrayList ListBagsBlack in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBagsRed(JTable tblDisplayBags) {
        ArrayList<Bags> listBagsRed = bagListRed();
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBagsRed.size(); i++) {

            row[0] = listBagsRed.get(i).getName();
            row[1] = listBagsRed.get(i).getColour();
            row[2] = listBagsRed.get(i).getRacketSpace();
            row[3] = listBagsRed.get(i).getPrice();
            row[4] = listBagsRed.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by name alphabetically. Adds all fields of the Strings class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Strings> StringListAlphabetical() {
        ArrayList<Strings> stringsListAlphabetical = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings ORDER BY StringName";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListAlphabetical.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListAlphabetical;
    }

    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsAlphabetical in the JTable tblDisplayStrings. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    //Displays a list of strings from tblStrings(Equipment Database) alphabetically in JTable tblDisplay Strings
    public void showStringsAlphabetical(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsAlphabetical = StringListAlphabetical();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsAlphabetical.size(); i++) {

            row[0] = listStringsAlphabetical.get(i).getName();
            row[1] = listStringsAlphabetical.get(i).getStringComposition();
            row[2] = listStringsAlphabetical.get(i).getColour();
            row[3] = listStringsAlphabetical.get(i).getStringGuage();
            row[4] = listStringsAlphabetical.get(i).getPrice();
            row[5] = listStringsAlphabetical.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price asc. Adds all fields of the Strings class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Strings> StringListPriceAsc() {
        ArrayList<Strings> stringsListPriceAsc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings ORDER BY [StringPrice(Rands)]";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListPriceAsc.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListPriceAsc;
    }
    
    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsPriceAsc in the JTable tblDisplayStrings. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. 
    //This method is public because it needs to be accessed outside of this class

    // display the strings by ascending order of price in JTable tblDisplayStrings
    public void showStringsPriceAsc(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsPriceAsc = StringListPriceAsc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsPriceAsc.size(); i++) {

            row[0] = listStringsPriceAsc.get(i).getName();
            row[1] = listStringsPriceAsc.get(i).getStringComposition();
            row[2] = listStringsPriceAsc.get(i).getColour();
            row[3] = listStringsPriceAsc.get(i).getStringGuage();
            row[4] = listStringsPriceAsc.get(i).getPrice();
            row[5] = listStringsPriceAsc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }
    
    //display the strings by descending order of price in JTable tblDisplayStrings
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price Desc. Adds all fields of the Strings class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Strings> StringListPriceDesc() {
        ArrayList<Strings> stringsListPriceDesc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings ORDER BY [StringPrice(Rands)] DESC";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListPriceDesc.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListPriceDesc;
    }

    
    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsPriceDesc in the JTable tblDisplayStrings.
    //A new object array is created which gets the values that are to be read into the jTable.
    //The object array is looped through adding data to each column each time until the object array is empty. 
    //This method is public because it needs to be accessed outside of this class.

   // Displays strings with a gauge equal to or thicker than 1.3mm in JTable tblDisplayStrings
    public void showStringsPriceDesc(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsPriceDesc = StringListPriceDesc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsPriceDesc.size(); i++) {

            row[0] = listStringsPriceDesc.get(i).getName();
            row[1] = listStringsPriceDesc.get(i).getStringComposition();
            row[2] = listStringsPriceDesc.get(i).getColour();
            row[3] = listStringsPriceDesc.get(i).getStringGuage();
            row[4] = listStringsPriceDesc.get(i).getPrice();
            row[5] = listStringsPriceDesc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns strings with a gauge>=1.3mm. Adds all fields of the Strings class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Strings> StringListThickGuage() {
        ArrayList<Strings> stringsListThickGuage = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings WHERE [StringGauge(mm)]>= 1.3";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListThickGuage.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListThickGuage;
    }

    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsThickGuage in the JTable tblDisplayStrings.
        //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showStringsThickGuage(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsThickGuage = StringListThickGuage();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsThickGuage.size(); i++) {

            row[0] = listStringsThickGuage.get(i).getName();
            row[1] = listStringsThickGuage.get(i).getStringComposition();
            row[2] = listStringsThickGuage.get(i).getColour();
            row[3] = listStringsThickGuage.get(i).getStringGuage();
            row[4] = listStringsThickGuage.get(i).getPrice();
            row[5] = listStringsThickGuage.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns strings that are made out of natural gut. Adds all fields of the Strings class to the array list. This method returns the ArrayList.
    //This method is public because it needs to be accessed outside of this class.
    //Displays all strings made out of natural gut to the user in JTable tblDisplayStrings
    public ArrayList<Strings> StringListNaturalGut() {
        ArrayList<Strings> stringsListNaturalGut = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings WHERE LOWER(StringComposition) LIKE '*natural gut*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListNaturalGut.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListNaturalGut;
    }

    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsNaturalGut in the JTable tblDisplayStrings.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showStringsNaturalGut(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsNaturalGut = StringListNaturalGut();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsNaturalGut.size(); i++) {

            row[0] = listStringsNaturalGut.get(i).getName();
            row[1] = listStringsNaturalGut.get(i).getStringComposition();
            row[2] = listStringsNaturalGut.get(i).getColour();
            row[3] = listStringsNaturalGut.get(i).getStringGuage();
            row[4] = listStringsNaturalGut.get(i).getPrice();
            row[5] = listStringsNaturalGut.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for black strings. Adds all fields of the Strings class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    //Displays all black strings to the user in JTable tblDisplayStrings
    public ArrayList<Strings> StringListBlack() {
        ArrayList<Strings> stringsListBlack = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings WHERE LOWER(StringColour) LIKE '*black*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListBlack.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListBlack;
    }
//Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsBlack in the JTable tblDisplayStrings.
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showStringsBlack(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsBlack = StringListBlack();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsBlack.size(); i++) {

            row[0] = listStringsBlack.get(i).getName();
            row[1] = listStringsBlack.get(i).getStringComposition();
            row[2] = listStringsBlack.get(i).getColour();
            row[3] = listStringsBlack.get(i).getStringGuage();
            row[4] = listStringsBlack.get(i).getPrice();
            row[5] = listStringsBlack.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. 
    //It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for red strings. Adds all fields of the Strings class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
     //Displays all red strings to the user in JTable tblDisplayStrings
    public ArrayList<Strings> StringListRed() {
        ArrayList<Strings> stringsListRed = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings WHERE LOWER(StringColour) LIKE '*red*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListRed.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListRed;
    }

    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsRed in the JTable tblDisplayStrings. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showStringsRed(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsRed = StringListRed();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsRed.size(); i++) {

            row[0] = listStringsRed.get(i).getName();
            row[1] = listStringsRed.get(i).getStringComposition();
            row[2] = listStringsRed.get(i).getColour();
            row[3] = listStringsRed.get(i).getStringGuage();
            row[4] = listStringsRed.get(i).getPrice();
            row[5] = listStringsRed.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for blue strings. Adds all fields of the Strings class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
     //Displays all blue strings to the user in JTable tblDisplayStrings
    public ArrayList<Strings> StringListBlue() {
        ArrayList<Strings> stringsListBlue = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock FROM tblStrings WHERE LOWER(StringColour) LIKE '*blue*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                stringsListBlue.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return stringsListBlue;
    }

    //Accepts JTable tblDisplayStrings 
//This void method is used to display the arrayList ListStringsBlue in the JTable tblDisplayStrings.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showStringsBlue(JTable tblDisplayStrings) {
        ArrayList<Strings> listStringsBlue = StringListBlue();
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStringsBlue.size(); i++) {

            row[0] = listStringsBlue.get(i).getName();
            row[1] = listStringsBlue.get(i).getStringComposition();
            row[2] = listStringsBlue.get(i).getColour();
            row[3] = listStringsBlue.get(i).getStringGuage();
            row[4] = listStringsBlue.get(i).getPrice();
            row[5] = listStringsBlue.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    
    //This method is typed. It accepts String search. It is used to get the data that will populate the JTable with user search results. It makes use of the Rackets class’ mutator methods and adds an object of type Rackets to the ArrayList whilst the sql statement is still receiving data from the database. 
    //Sql returns data that is similar to search input by user by equipment name. Adds all fields of the Rackets class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Rackets> listRacketsSearch(String search) {
        ArrayList<Rackets> listsSearchRackets = new ArrayList<>();

        try {
//Get results of the SQL statement

            stmt = conn.createStatement();
            String query = "SELECT * FROM tblRackets WHERE LOWER(RacketName) like '*"+search+"*'";
            ResultSet rs = stmt.executeQuery(query);
            Rackets rackets;
            while (rs.next()) {
                rackets = new Rackets(rs.getString("RacketName"), rs.getInt("RacketWeight(g)"),
                        rs.getString("RacketColour"), rs.getInt("RacketPrice(Rands)"), rs.getString("StringPattern"), rs.getInt("SwingWeight_kg*cm2"),
                        rs.getInt("Vibration_Hz"), rs.getInt("Power_%"), rs.getDate("RacketModel"), rs.getInt("Length_cm"), rs.getInt("AvailableStock"));

                listsSearchRackets.add(rackets);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listsSearchRackets;
    }

    //Accepts JTable tblDisplayRackets and String sql
//This void method is used to display the arrayList listRackets in the JTable tblDisplayRackets. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //This data is the results of string sql applied to Rackets. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showRacketsSearch(JTable tblDisplayRackets, String sql) {
        ArrayList<Rackets> listRackets = listRacketsSearch(sql);
        DefaultTableModel model = (DefaultTableModel) tblDisplayRackets.getModel();
        Object[] row = new Object[11];
        for (int i = 0; i < listRackets.size(); i++) {

            row[0] = listRackets.get(i).getName();
            row[1] = listRackets.get(i).getRacketWeight();
            row[2] = listRackets.get(i).getColour();
            row[3] = listRackets.get(i).getPrice();
            row[4] = listRackets.get(i).getStringPattern();
            row[5] = listRackets.get(i).getSwingWeight();
            row[6] = listRackets.get(i).getVibration();
            row[7] = listRackets.get(i).getPower();
            row[8] = listRackets.get(i).getRacketModel();
            row[9] = listRackets.get(i).getLength();
            row[10] = listRackets.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It accepts String search. It is used to get the data that will populate the JTable with user search results. 
    //It makes use of the Balls class’ mutator methods and adds an object of type Balls to the ArrayList whilst the sql statement is still receiving data from the database. 
    //Sql returns data that is similar to search input by user by equipment name. Adds all fields of the Balls class to the array list. This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Balls> listBallsSearch(String search) {
        ArrayList<Balls> listsSearchBalls = new ArrayList<>();

        try {
//Get results of the SQL statement

            stmt = conn.createStatement();
            String query = "SELECT * FROM tblBalls WHERE LOWER(BallName) like '*" + search + "*'";
            ResultSet rs = stmt.executeQuery(query);
            Balls balls;
            while (rs.next()) {
                balls = new Balls(rs.getString("BallName"), rs.getBoolean("HighAltitude"),
                        rs.getString("CanColour"), rs.getInt("PricePerCan(Rands)"), rs.getInt("AvailableStock"));

                listsSearchBalls.add(balls);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listsSearchBalls;
    }

    //Accepts JTable tblDisplayBalls and String sql
//This void method is used to display the arrayList listBalls in the JTable tblDisplayBalls.
    //A new object array is created which gets the values that are to be read into the jTable.
    //This data is the results of string sql applied to Balls. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showBallsSearch(JTable tblDisplayBalls, String sql) {
        ArrayList<Balls> listBalls = listBallsSearch(sql);
        DefaultTableModel model = (DefaultTableModel) tblDisplayBalls.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBalls.size(); i++) {

            row[0] = listBalls.get(i).getName();
            row[1] = listBalls.get(i).isHighAlt();
            row[2] = listBalls.get(i).getColour();
            row[3] = listBalls.get(i).getPrice();
            row[4] = listBalls.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It accepts String search. It is used to get the data that will populate the JTable with user search results. It makes use of the Strings class’ mutator methods and adds an object of type Strings to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data that is similar to search input by user by equipment name. Adds all fields of the Strings class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Strings> listStringsSearch(String search) {
        ArrayList<Strings> listsSearchStrings = new ArrayList<>();

        try {
//Get results of the SQL statement
            stmt = conn.createStatement();
            String query = "SELECT * FROM tblStrings WHERE LOWER(StringName) like '*" + search + "*'";
            ResultSet rs = stmt.executeQuery(query);
            Strings strings;
            while (rs.next()) {
                strings = new Strings(rs.getString("StringName"), rs.getString("StringComposition"),
                        rs.getString("StringColour"), rs.getDouble("StringGauge(mm)"), rs.getInt("StringPrice(Rands)"), rs.getInt("AvailableStock"));

                listsSearchStrings.add(strings);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listsSearchStrings;
    }

    //Accepts JTable tblDisplayStrings and String sql
//this void method is used to display the arrayList listStrings in the JTable tblDisplayStrings. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //This data is the results of string sql applied to Strings. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showStringsSearch(JTable tblDisplayStrings, String sql) {
        ArrayList<Strings> listStrings = listStringsSearch(sql);
        DefaultTableModel model = (DefaultTableModel) tblDisplayStrings.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < listStrings.size(); i++) {

            row[0] = listStrings.get(i).getName();
            row[1] = listStrings.get(i).getStringComposition();
            row[2] = listStrings.get(i).getColour();
            row[3] = listStrings.get(i).getStringGuage();
            row[4] = listStrings.get(i).getPrice();
            row[5] = listStrings.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It accepts String search. It is used to get the data that will populate the JTable with user search results. It makes use of the Bags class’ mutator methods and adds an object of type Bags to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data that is similar to search input by user by equipment name. Adds all fields of the Bags class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class
    public ArrayList<Bags> listBagsSearch(String search) {
        ArrayList<Bags> listsSearchBags = new ArrayList<>();

        try {
//Get results of the SQL statement
            stmt = conn.createStatement();
            String query = "SELECT * FROM tblBags WHERE LOWER(BagName) like '*" + search + "*'";
            ResultSet rs = stmt.executeQuery(query);
            Bags bags;
            while (rs.next()) {
                bags = new Bags(rs.getString("BagName"), rs.getString("BagColour"),
                        rs.getInt("RacketSpace"), rs.getInt("BagPrice(Rands)"), rs.getInt("AvailableStock"));
                listsSearchBags.add(bags);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listsSearchBags;
    }

    //Accepts JTable tblDisplayBags and String sql
//This void method is used to display the arrayList listBags in the JTable tblDisplayBags. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //This data is the results of string sql applied to Bags. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.


    public void showBagsSearch(JTable tblDisplayBags, String sql) {
        ArrayList<Bags> listBags = listBagsSearch(sql);
        DefaultTableModel model = (DefaultTableModel) tblDisplayBags.getModel();
        Object[] row = new Object[5];
        for (int i = 0; i < listBags.size(); i++) {

            row[0] = listBags.get(i).getName();
            row[1] = listBags.get(i).getColour();
            row[2] = listBags.get(i).getRacketSpace();
            row[3] = listBags.get(i).getPrice();
            row[4] = listBags.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It accepts String search. It is used to get the data that will populate the JTable with user search results. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data that is similar to search input by user by equipment name. Adds all fields of the Caps class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> listCapsSearch(String search) {
        ArrayList<Equipment> listsSearchCaps = new ArrayList<>();

        try {
//Get results of the SQL statement

            stmt = conn.createStatement();
            String query = "SELECT * FROM tblCaps WHERE LOWER(CapName) like '*" + search + "*'";
            ResultSet rs = stmt.executeQuery(query);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                listsSearchCaps.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listsSearchCaps;
    }

    //Accepts JTable tblDisplayCaps and String sql
//This void method is used to display the arrayList listCaps in the JTable tblDisplayCaps. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //This data is the results of string sql applied to Caps. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsSearch(JTable tblDisplayCaps, String sql) {
        ArrayList<Equipment> listCaps = listCapsSearch(sql);
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCaps.size(); i++) {

            row[0] = listCaps.get(i).getName();
            row[1] = listCaps.get(i).getColour();
            row[2] = listCaps.get(i).getPrice();
            row[3] = listCaps.get(i).getAvailableStock();

            model.addRow(row);
        }
    }
//This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by name alphabetically. Adds all fields of the Caps class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListAlphabetical() {
        ArrayList<Equipment> capsListAlphabetical = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps ORDER BY CapName";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListAlphabetical.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListAlphabetical;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsAlphabetical in the JTable tblDisplayCaps. 
    //A new object array is created which gets the values that are to be read into the jTable. The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsAlphabetical(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsAlphabetical = capListAlphabetical();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsAlphabetical.size(); i++) {

            row[0] = listCapsAlphabetical.get(i).getName();
            row[1] = listCapsAlphabetical.get(i).getColour();
            row[2] = listCapsAlphabetical.get(i).getPrice();
            row[3] = listCapsAlphabetical.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price asc. Adds all fields of the Caps class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListPriceAsc() {
        ArrayList<Equipment> capsListPriceAsc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps ORDER BY [CapPrice(Rands)]";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListPriceAsc.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListPriceAsc;
    }

    
    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsPriceAsc in the JTable tblDisplayCaps.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsPriceAsc(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsPriceAsc = capListPriceAsc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsPriceAsc.size(); i++) {

            row[0] = listCapsPriceAsc.get(i).getName();
            row[1] = listCapsPriceAsc.get(i).getColour();
            row[2] = listCapsPriceAsc.get(i).getPrice();
            row[3] = listCapsPriceAsc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data sorted by price desc. Adds all fields of the Caps class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListPriceDesc() {
        ArrayList<Equipment> capsListPriceDesc = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps ORDER BY [CapPrice(Rands)] DESC";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListPriceDesc.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListPriceDesc;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsPriceDesc in the JTable tblDisplayCaps.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsPriceDesc(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsPriceDesc = capListPriceDesc();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsPriceDesc.size(); i++) {

            row[0] = listCapsPriceDesc.get(i).getName();
            row[1] = listCapsPriceDesc.get(i).getColour();
            row[2] = listCapsPriceDesc.get(i).getPrice();
            row[3] = listCapsPriceDesc.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for all white caps. Adds all fields of the Caps class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListWhite() {
        ArrayList<Equipment> capsListWhite = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps WHERE LOWER(CapColour) like '*white*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListWhite.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListWhite;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsWhite in the JTable tblDisplayCaps. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsWhite(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsWhite = capListWhite();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsWhite.size(); i++) {

            row[0] = listCapsWhite.get(i).getName();
            row[1] = listCapsWhite.get(i).getColour();
            row[2] = listCapsWhite.get(i).getPrice();
            row[3] = listCapsWhite.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for all black caps. Adds all fields of the Caps class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListBlack() {
        ArrayList<Equipment> capsListBlack = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps WHERE LOWER(CapColour) like '*black*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListBlack.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListBlack;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsBlack in the JTable tblDisplayCaps.
    //A new object array is created which gets the values that are to be read into the jTable.
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsBlack(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsBlack = capListBlack();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsBlack.size(); i++) {

            row[0] = listCapsBlack.get(i).getName();
            row[1] = listCapsBlack.get(i).getColour();
            row[2] = listCapsBlack.get(i).getPrice();
            row[3] = listCapsBlack.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for all blue caps. Adds all fields of the Caps class to the array list.
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListBlue() {
        ArrayList<Equipment> capsListBlue = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps WHERE LOWER(CapColour) like '*blue*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListBlue.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListBlue;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsBlue in the JTable tblDisplayCaps.
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsBlue(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsBlue = capListBlue();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsBlue.size(); i++) {

            row[0] = listCapsBlue.get(i).getName();
            row[1] = listCapsBlue.get(i).getColour();
            row[2] = listCapsBlue.get(i).getPrice();
            row[3] = listCapsBlue.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. 
    //It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for all women caps. Adds all fields of the Caps class to the array list. This method returns the ArrayList.
    //This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListWomen() {
        ArrayList<Equipment> capsListWomen = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps WHERE LOWER(CapName) like '*women*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListWomen.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListWomen;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsWomen in the JTable tblDisplayCaps. 
    //A new object array is created which gets the values that are to be read into the jTable. 
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.


    public void showCapsWomen(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsWomen = capListWomen();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsWomen.size(); i++) {

            row[0] = listCapsWomen.get(i).getName();
            row[1] = listCapsWomen.get(i).getColour();
            row[2] = listCapsWomen.get(i).getPrice();
            row[3] = listCapsWomen.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

    
    //This method is typed. It has no parameters. It is used to get the data that will populate the JTable. It makes use of the Caps class’ mutator methods and adds an object of type Caps to the ArrayList whilst the sql statement is still receiving data from the database. Sql returns data for all men caps. Adds all fields of the Caps class to the array list. 
    //This method returns the ArrayList. This method is public because it needs to be accessed outside of this class.
    public ArrayList<Equipment> capListMen() {
        ArrayList<Equipment> capsListMen = new ArrayList<>();

        try {
//Get results of the SQL statement
            String query1 = "SELECT CapName, CapColour, [CapPrice(Rands)], AvailableStock FROM tblCaps WHERE CapName like '* Men*'";
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query1);
            Equipment caps;
            while (rs.next()) {
                caps = new Equipment(rs.getString("CapName"), rs.getString("CapColour"),
                        rs.getInt("CapPrice(Rands)"), rs.getInt("AvailableStock"));

                capsListMen.add(caps);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return capsListMen;
    }

    //Accepts JTable tblDisplayCaps 
//This void method is used to display the arrayList ListCapsMen in the JTable tblDisplayCaps. 
    //A new object array is created which gets the values that are to be read into the jTable.
    //The object array is looped through adding data to each column each time until the object array is empty. This method is public because it needs to be accessed outside of this class.

    public void showCapsMen(JTable tblDisplayCaps) {
        ArrayList<Equipment> listCapsMen = capListMen();
        DefaultTableModel model = (DefaultTableModel) tblDisplayCaps.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < listCapsMen.size(); i++) {

            row[0] = listCapsMen.get(i).getName();
            row[1] = listCapsMen.get(i).getColour();
            row[2] = listCapsMen.get(i).getPrice();
            row[3] = listCapsMen.get(i).getAvailableStock();

            model.addRow(row);
        }
    }

   
    
    //Accepts String tempOrder, String tempColour. Deletes the row selected by the user. 
    public void deleteBag(String tempOrder, String tempColour) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblBags WHERE BagName ='" + tempOrder + "' AND BagColour ='" + tempColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
//Accepts String tempOrder, String tempOrderColour, String colour, String name, int space, int price, int stock. Uses these values to set new values for an existing record that is selected in JTable.
    public void updateBag(String tempOrder, String tempOrderColour, String colour, String name, int space, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "UPDATE tblBags SET BagName = '" + name + "' ,BagColour ='" + colour + "' ,RacketSpace =" + space + " ,[BagPrice(Rands)] =" + price + " ,AvailableStock  = " + stock + " WHERE BagName ='" + tempOrder + "' AND BagColour ='" + tempOrderColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String name, String colour, int space, int price, int stock. Uses these values to insert a new record into the db. 
    public void insertBag(String name, String colour, int space, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "INSERT INTO tblBags (BagName, BagColour, RacketSpace, [BagPrice(Rands)], AvailableStock) VALUES ('" + name + "', '" + colour + "', " + space + ", " + price + ", " + stock + ")";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
//Accepts String tempOrder, String tempColour. Deletes the row selected by the user.
    public void deleteBall(String tempOrder, String tempColour) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblBalls WHERE BallName ='" + tempOrder + "' AND CanColour ='" + tempColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String tempOrder, String tempOrderColour, String name, boolean highAlt, String colour, int price, int stock. 
    //Uses these values to set new values for an existing record that is selected in JTable.
    public void updateBall(String tempOrder, String tempOrderColour, String name, boolean highAlt, String colour, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "UPDATE tblBalls SET BallName = '" + name + "' ,HighAltitude =" + highAlt + " ,CanColour ='" + colour + "' ,[PricePerCan(Rands)] =" + price + " ,AvailableStock  =" + stock + " WHERE BallName ='" + tempOrder + "' AND CanColour ='" + tempOrderColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String name, boolean highAlt, String colour, int price, int stock. Uses these values to insert a new record into the db. 
    public void insertBall(String name, boolean highAlt, String colour, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "INSERT INTO tblBalls (BallName, HighAltitude, CanColour, [PricePerCan(Rands)], AvailableStock) VALUES ('" + name + "', " + highAlt + ", '" + colour + "', " + price + ", " + stock + ")";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String tempOrder, String tempColour. Deletes the row selected by the user. 
    public void deleteCap(String tempOrder, String tempColour) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblCaps WHERE CapName ='" + tempOrder + "' AND CapColour ='" + tempColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String tempOrder, String tempOrderColour, String name, String colour, int price, int stock.
    //    //Uses these values to set new values for an existing record that is selected in JTable.

    public void updateCap(String tempOrder, String tempOrderColour, String name, String colour, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "UPDATE tblCaps SET CapName = '" + name + "' ,CapColour ='" + colour + "' ,[CapPrice(Rands)] =" + price + " ,AvailableStock  = " + stock + " WHERE CapName ='" + tempOrder + "' AND CapColour ='" + tempOrderColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String name, String colour, int price, int stock. 
//Uses these values to insert a new record into the db

    public void insertCap(String name, String colour, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "INSERT INTO tblCaps (CapName, CapColour, [CapPrice(Rands)], AvailableStock) VALUES ('" + name + "', '" + colour + "', " + price + ", " + stock + ")";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }

    //Accepts String tempOrder, String tempColour. Deletes the row selected by the user. 
    public void deleteRacket(String tempOrder, String tempColour) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblRackets WHERE RacketName ='" + tempOrder + "' AND RacketColour ='" + tempColour + "'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
    
    //Accepts String tempOrder, String tempOrderColour, String name, int weight, String colour, int price, String pattern, int swingWeight, int vibration, int power, String racketModel, int length, int stock. 
    //Uses these values to set new values for an existing record that is selected in JTable.
 public void updateRacket(String tempOrder, String tempOrderColour, String name, int weight, String colour, int price, String pattern, int swingWeight, int vibration, int power, String racketModel, int length, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "UPDATE tblRackets SET RacketName = '"+name+"' ,[RacketWeight(g)] ="+weight+" ,RacketColour ='"+colour+"' ,[RacketPrice(Rands)] ="+price+" ,StringPattern = '"+pattern+"' ,[SwingWeight_kg*cm2] = "+swingWeight+" ,[Vibration_Hz] ="+vibration+" ,[Power_%] ="+power+", RacketModel ='"+racketModel+"' ,[Length_cm] ="+length+" ,AvailableStock  = "+stock+" WHERE RacketName ='"+tempOrder+"' AND RacketColour ='"+tempOrderColour+"'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
 
 //Accepts String name, int weight, String colour, int price, String pattern, int swingWeight, int vibration, int power, String racketModel, int length, int stock. 
//Uses these values to insert a new record into the db

   public void insertRacket(String name, int weight, String colour, int price, String pattern, int swingWeight, int vibration, int power, String racketModel, int length, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "INSERT INTO tblRackets (RacketName, [RacketWeight(g)], RacketColour, [RacketPrice(Rands)], StringPattern, [SwingWeight_kg*cm2], [Vibration_Hz], [Power_%], RacketModel, [Length_cm], AvailableStock) VALUES ('"+name+"', "+weight+", '"+colour+"', "+price+", '"+pattern+"', "+swingWeight+", "+vibration+", "+power+", '"+racketModel+"', "+length+", "+stock+")";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
   
   //Accepts String tempOrder, String tempColour. Deletes the row selected by the user. 
     public void deleteString(String tempOrder, String tempColour) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "DELETE FROM tblStrings WHERE StringName ='"+tempOrder+"' AND StringColour ='"+tempColour+"'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
     //Accepts String tempOrder, String tempOrderColour, String name, String comp, String colour, double gauge, int price, int stock. Uses these values to set new values for an existing record that is selected in JTable
      public void updateString(String tempOrder, String tempOrderColour, String name, String comp, String colour, double gauge, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "UPDATE tblStrings SET StringName = '"+name+"' ,StringComposition ='"+comp+"' ,StringColour ='"+colour+"' ,[StringGauge(mm)] ="+gauge+" ,[StringPrice(Rands)] ="+price+" ,AvailableStock  = "+stock+" WHERE StringName ='"+tempOrder+"' AND StringColour ='"+tempOrderColour+"'";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
      
      //Accepts  String tempOrderColour, String name, String comp, String colour, double gauge, int price, int stock. Uses these values to insert a new record into the db.
  public void insertString(String name, String comp, String colour, double gauge, int price, int stock) throws SQLException {

//Get results of the SQL statement
        try {
            String query = "INSERT INTO tblStrings (StringName, StringComposition, StringColour, [StringGauge(mm)], [StringPrice(Rands)], AvailableStock) VALUES ('"+name+"', '"+comp+"', '"+colour+"', "+gauge+", "+price+", "+stock+")";
            this.updateRecord(query);

        } catch (SQLException ex) {
        }
    }
}
